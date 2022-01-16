package uz.gita.bot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.CallbackQuery;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.User;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.common.Commands;
import uz.gita.bot.common.CommandsText;
import uz.gita.bot.controller.admin.AdminController;
import uz.gita.bot.dto.CodeMessage;
import uz.gita.bot.dto.SuggestionDto;
import uz.gita.bot.holder.ExerciseListHolder;
import uz.gita.bot.holder.JobHolder;
import uz.gita.bot.holder.SuggestionHolder;
import uz.gita.bot.holder.UserHolder;
import uz.gita.bot.repository.SuggestionRepository;
import uz.gita.bot.service.FileInfoService;
import uz.gita.bot.util.ButtonAsRow;
import uz.gita.bot.util.ButtonKeyboard;
import java.util.Date;

public class MainController extends TelegramLongPollingBot {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    private FileInfoService fileInfoService; //< FILE_INFO_SERVICE
    private UserCommandController userCommanController; //< USER_COMMAND_CONTROLLER
    private AdminController adminController; //< ADMIN_CONTROLLER
    private JobHolder jobHolder;
    // public static Integer todayRequestCount = 0;

    public MainController() {
        this.fileInfoService = new FileInfoService();
        this.userCommanController = new UserCommandController();
        this.adminController = new AdminController();
        this.jobHolder = new JobHolder(this);
    }

    @Override
    public void onUpdateReceived(Update update) {
        LOGGER.info("------------- GETTING NEW UPDATE -------------");

        Message message = update.getMessage();

        if (update.hasCallbackQuery()) { //< BUTTON_CLICK
            CallbackQuery callbackQuery = update.getCallbackQuery();

            User user = callbackQuery.getFrom();//< USER
            Message msg = callbackQuery.getMessage();//< MESSAGE
            Integer mId = msg.getMessageId();//< MESSAGE ID
            String text = callbackQuery.getData();//< TEXT
            Long cId = msg.getChatId();
            this.userRequestLog(user, cId, text); //< LOG_LOGGER

            UserHolder.checkAddUser(this, user, text); //< CHECK_USER

            this.sendMsg(this.userCommanController.handlRequest(text, cId, mId, user));

        } else if (message != null) {
            String text = message.getText(); //< MESSAGE_TEXT
            Long cId = message.getChatId(); //< CHAT_ID
            Integer mId = message.getMessageId(); //< MESSAGEID
            User user = message.getFrom();

            this.userRequestLog(user, cId, text); //< LOG_LOGGER

            UserHolder.checkAddUser(this, user, text); //< CHECK_USER

            if (text != null) {//< HAS_SOME_TEXT
                if (text.equals("/start")
                        || text.equals(Commands.HELP)
                        || text.equals(Commands.MENU)
                        || text.equals(Commands.STOP)
                        || text.equals(Commands.IMPOERT_PROJECT)) { //< USER_COMMAND
                    this.sendMsg(this.userCommanController.handlRequest(text, cId, null, user));
                } else if (text.startsWith("$") && text.endsWith("$")) { //< ADMIN_COMMAND
                    this.sendMsg(this.adminController.handleRequest(cId, text));
                } else if (text.trim().endsWith("}")) {//< SOLUTION
                    this.sendMsg(ExerciseListHolder.userExerciseSolutionCompileAndCallBackMessage(cId, text));
                } else {//< NOT_FOUND
                    this.commandLineNotFound(cId, text, user.toString());
                }

            } else {//< SENDING_FILE
                CodeMessage codeMessage = this.fileInfoService.getFileInfo(message); //< MAIN_UTIL_CONTROLLER
                this.sendMsg(codeMessage);
            }
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void sendMsg(CodeMessage codeMessage) {
        try {
            Integer state = codeMessage.getMessageType();

            if (state.equals(CodeMessageType.SEND_MESSAGE)) {
                execute(codeMessage.getSendMessage());
            } else if (state.equals(CodeMessageType.EDIT_MESSAGE_TEXT)) {
                execute(codeMessage.getEditMessageText());
            } else if (state.equals(CodeMessageType.SEND_VIDEO)) {
//                sendVideo(codeMessage.getSendVideo().setVideo("BAADAgADrQEAAsec0Eg1usWFtHmU0wI")); //< TEST TODO
                sendVideo(codeMessage.getSendVideo());
            } else if (state.equals(CodeMessageType.SEND_PHOTO)) {
                sendPhoto(codeMessage.getSendPhoto());
            } else if (state.equals(CodeMessageType.SEND_VIDEO_WITH_SEND_MESSAGE)) {
//                sendVideo(codeMessage.getSendVideo().setVideo("BAADAgADrQEAAsec0Eg1usWFtHmU0wI")); //)< TEST TODO
                sendVideo(codeMessage.getSendVideo());
                execute(codeMessage.getSendMessage());
            } else if (state.equals(CodeMessageType.SEND_DOCUMENT_WITH_SEND_MESSAGE)) {
                sendDocument(codeMessage.getSendDocument());
                execute(codeMessage.getSendMessage());
            } else if (state.equals(CodeMessageType.SEND_MESSAGE_LIST)) {
                String answer = "ANSWER_SENDING_MESSAGES_TO_ADMIN\n";

                int successCount = 0;
                int failedCount = 0;

                for (SendMessage sendMessage : codeMessage.getSendMessageList()) {
                    try {
                        execute(sendMessage);
                        successCount++;
                    } catch (Exception e) {
                        failedCount++;
                    }
                }
                answer += "Success Count: " + successCount + " \n";
                answer += "Failed Count: " + failedCount + " \n";
                this.sendMsg(new SendMessage(codeMessage.getChatID(), answer).setParseMode("HTML"));
            } else if (state.equals(CodeMessageType.NOT_FOUNT)) {
                this.sendNotFountMessage(codeMessage.getChatID());
            }
//            else if (state.equals(CodeMessageType.SEND_EXCEPTION_THROW_MESSAGE)) {
//                this.sendExceptionThrownMessage(codeMessage.getChatID(), codeMessage.getText());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendNotFountMessage(Long cId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(cId);
        sendMessage.setText(" MAVJUD EMAS!!! ");
        //  sendMessage.setReplyMarkup(ReplyKeyBoardButton.get_menu_inline_keyboard_mark_up_button());
        this.sendMsg(sendMessage);
    }

    private void sendExceptionThrownMessage(Long cId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(cId);
        sendMessage.setText(message);
        sendMessage.setParseMode("HTML");
        this.sendMsg(sendMessage);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void commandLineNotFound(Long cId, String text, String userInfo) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(cId);
        if (SuggestionHolder.suggestionListRegister.containsKey(cId)) { //< CHECK_SUGGESTION_MAP
            SuggestionRepository repository = new SuggestionRepository();
            SuggestionDto dto = new SuggestionDto();
            dto.setContent(text);
            dto.setDate(new Date());
            dto.setVisible(true);
            dto.setUser_t_id(cId);
            repository.saveSuggestion(dto); //< SAVE_SUGGESTION

            SuggestionHolder.suggestionListRegister.remove(cId); //< Remove_From_Suggestion_List_Holder

            sendMessage.setText(CommandsText.SUGGESTION_ANSWER_TEXT);
            sendMessage.setParseMode("HTML");
            sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.back_to_menu_button(), ButtonAsRow.suggestion_button()));
            this.sendMsg(sendMessage);


            String adminText = " --- NEW SUGGESTION --- \n" + userInfo + "  \n --------------------- \n" + text;
            SendMessage adminMessage = new SendMessage();
            adminMessage.setChatId("54398465");
            adminMessage.setText(adminText);
            this.sendMsg(adminMessage);

        } else {
            this.sendNotFountMessage(cId);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void userRequestLog(User user, Long cId, String text) {
        // Set variables
        String user_first_name = user.getFirstName();
        String user_last_name = user.getLastName();
        String user_username = user.getUserName();
        long user_id = user.getId();
        String message_text = text;

        LOGGER.info(" MESSAGE FROM:  " + user_first_name + "  " + user_last_name + "   " + user_username + " " +
                "  USER_ID: " + String.valueOf(user_id) + "  CHAT_ID: " + String.valueOf(cId) +
                " \n REQUEST: " + message_text);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String getBotUsername() {
        return "code_uz_test_ver_bot"; //< test_version
    }

    @Override
    public String getBotToken() {
        return "524584365:AAEH-74zx90o2aVfmCCNyiuvRnxlAye0IDE";  // test_version
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

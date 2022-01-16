package uz.gita.bot.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.common.Commands;
import uz.gita.bot.dto.CodeMessage;
import uz.gita.bot.dto.NotificationDto;
import uz.gita.bot.dto.UserDto;
import uz.gita.bot.holder.ExerciseListHolder;
import uz.gita.bot.holder.VideoLessonHolder;
import uz.gita.bot.repository.NotificationRepository;
import uz.gita.bot.repository.SuggestionRepository;
import uz.gita.bot.repository.UserRepository;
import uz.gita.bot.util.ButtonAsRow;
import uz.gita.bot.util.ButtonKeyboard;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdminController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);

    public CodeMessage handleRequest(Long chatId, String text) {
        LOGGER.info("START ADMIN CONTROLLER");
        chatId = new Long(54398465);
        CodeMessage codeMessage = new CodeMessage(chatId);

        try {
            //  String command = text.replace("$", "");
            if (text.equals(Commands.REFRESH_DB)) {
                ExerciseListHolder.fillExerciseListHolder();
                VideoLessonHolder.fillVideoListHolder();

                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("REFRESH DB DONE");

                codeMessage.setSendMessage(sendMessage);
                codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);
                return codeMessage;
            } else if (text.equals(Commands.SEND_NOTIFICATION_TO_ALL_USER)) {
                return this.send_notification_to_all_users(chatId);
            } else if (text.contains(Commands.SEND_NOTIFICATION_TO_USER)) {//< {command}/{userId}/{text}
                return this.send_notification_to_current_user(chatId, text);
            } else if (text.contains(Commands.SUGGESTION_LIST)) {//< {command}/{fromId}
                return this.get_suggestion_list(chatId, text);
            } else if (text.contains(Commands.REQUEST_COUNT)) {
                return this.get_request_count_byDate(chatId, text);
            } else {
                codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
            }

        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info(e.toString());
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private CodeMessage send_notification_to_all_users(Long chatId) {
        CodeMessage codeMessage = new CodeMessage(chatId);

        NotificationRepository notificationRepository = new NotificationRepository();
        NotificationDto notificationDto = notificationRepository.getNotification();

        if (notificationDto != null) {
            UserRepository userRepository = new UserRepository();
            List<UserDto> userDtoList = userRepository.get_all();

            List<SendMessage> sendMessageList = new LinkedList<SendMessage>();

            for (UserDto userDto : userDtoList) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(String.valueOf(userDto.getUser_t_id()));
                sendMessage.setText(notificationDto.getContent());
                sendMessage.setParseMode("HTML");

                sendMessageList.add(sendMessage);
            }

            codeMessage.setSendMessageList(sendMessageList);
            codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE_LIST);

        } else {
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }
        return codeMessage;

    }

    private CodeMessage send_notification_to_current_user(Long chatId, String text) {
        String content[] = text.split("/#");//< {command}/{userId}/{text}
        CodeMessage codeMessage = new CodeMessage(chatId);

        try {
            SendMessage sendMessage = new SendMessage();
            if (content.length == 3) {
                String userTelegramId = content[1];
                String messageText = content[2].replace("$", "");
                sendMessage.setChatId(userTelegramId.trim());
                sendMessage.setText(messageText.trim());
                sendMessage.setParseMode("HTML");
//                sendMessage.setReplyMarkup(ButtonKeyboard.start_keyboard());
                sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.back_to_menu_button(), ButtonAsRow.help_button(), ButtonAsRow.suggestion_button()));
                sendMessage = sendMessage.disableWebPagePreview();

                List<SendMessage> sendMessages = new ArrayList<SendMessage>();
                sendMessages.add(sendMessage);

                codeMessage.setSendMessageList(sendMessages);
                codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE_LIST);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private CodeMessage get_suggestion_list(Long chatId, String text) {
        CodeMessage codeMessage = new CodeMessage(chatId);
        try {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);

            SuggestionRepository suggestionRepository = new SuggestionRepository();
            Long fromId = Long.valueOf(text.split("/")[1].replace("$", ""));
            sendMessage.setText(suggestionRepository.getSuggestionString_fromId(fromId));

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private CodeMessage get_request_count_byDate(Long chatId, String text) {
        CodeMessage codeMessage = new CodeMessage(chatId);
        try {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);

            UserRepository userRepository = new UserRepository();

            String data[] = text.split("/");

            String fromDate = data[1];
            String toDate = data[2].replace("$", "");

            Integer result = userRepository.get_request_count(fromDate.trim(), toDate.trim());

            sendMessage.setText(" REQUEST COUNT : " + result);

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;
    }
}

package uz.gita.bot.controller;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendVideo;
import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.api.objects.User;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.common.Commands;
import uz.gita.bot.common.CommandsText;
import uz.gita.bot.controller.exl.ExerciseListController;
import uz.gita.bot.controller.video_lesson.VideoLessonController;
import uz.gita.bot.dto.CodeMessage;
import uz.gita.bot.holder.SuggestionHolder;
import uz.gita.bot.holder.UserHolder;
import uz.gita.bot.util.ButtonAsRow;
import uz.gita.bot.util.ButtonKeyboard;

public class UserCommandController {
    private String MARKDOWN = "Markdown";

    private String HTML = "HTML";

    private ExerciseListController exerciseListController;
    private VideoLessonController videoLessonController;

    public UserCommandController() {
        this.exerciseListController = new ExerciseListController();
        this.videoLessonController = new VideoLessonController();
    }

    public CodeMessage handlRequest(String text, Long chatId, Integer messageId, User user) {
        CodeMessage codeMessage = new CodeMessage(chatId);

        String messageText = "";
        String messageParser = "";
        //   Integer messageType = CodeMessageType.NOT_FOUNT;

        InlineKeyboardMarkup messageInliKeyBoard = new InlineKeyboardMarkup();

        if (text.equals(Commands.START)) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setParseMode("HTML");
            sendMessage.setText(CommandsText.START_TEXT);
            sendMessage.setReplyMarkup(ButtonKeyboard.start_keyboard());
            sendMessage = sendMessage.disableWebPagePreview();

            codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);
            codeMessage.setSendMessage(sendMessage);

            return codeMessage;
        } else if (text.equals(Commands.MENU)) {//< MENU
            if(messageId == null){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setParseMode("HTML");
                sendMessage.setText(CommandsText.MENU_TEXT);
                sendMessage.setReplyMarkup(ButtonKeyboard.menu_keyboard());
                sendMessage = sendMessage.disableWebPagePreview();

                codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);
                codeMessage.setSendMessage(sendMessage);

            }else{
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setText(CommandsText.MENU_TEXT);
                editMessageText.setChatId(chatId);
                editMessageText.setParseMode("HTML");
                editMessageText.setReplyMarkup(ButtonKeyboard.menu_keyboard());
                editMessageText.setMessageId(messageId);
                editMessageText.disableWebPagePreview();

                codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);
                codeMessage.setEditMessageText(editMessageText);
            }


            return codeMessage;
        } else if (text.equals(Commands.HELP)) {

            SendVideo sendVideo = new SendVideo();
            sendVideo.setChatId(chatId);
            sendVideo.setVideo("BAADAgADLQEAAqaK0UhyTgABcPS0cIIC");
            sendVideo.setCaption("code uz yordam.");
            codeMessage.setSendVideo(sendVideo);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setParseMode("HTML");
            sendMessage.setText(CommandsText.HELP_TEXT);
            sendMessage = sendMessage.disableWebPagePreview(); // DISABLE_WEB_PREVIEW

            sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.back_to_menu_button()));

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_VIDEO_WITH_SEND_MESSAGE);

            return codeMessage;
        } else if (text.equals(Commands.STOP)) {
            UserHolder.removeUser(user.getId());

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Bot dan chiqib ketdingiz.");

            codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);
            codeMessage.setSendMessage(sendMessage);
            return codeMessage;
        } else if (text.equals(Commands.IMPOERT_PROJECT)) {

            SendVideo sendVideo = new SendVideo();
            sendVideo.setChatId(chatId);
            sendVideo.setVideo("BAADAgADEQIAAolL8EjYxnSG7LKiQwI");
            sendVideo.setCaption("code uz yordam.");
            codeMessage.setSendVideo(sendVideo);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setParseMode("HTML");
            sendMessage.setText("OOP misollaridagi fileni qanday\nimport qilish kerak haqida malumot.");

            sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.back_to_menu_button()));

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_VIDEO_WITH_SEND_MESSAGE);

            return codeMessage;
        } else if (text.equals(Commands.SUGGESTION)) {
            return SuggestionHolder.registerSuggestion(chatId, messageId);
        } else if (text.equals(Commands.EXERCISE_LIST)) {//< EXERCISE_LIST
            messageText = CommandsText.EXERCISE_TEXT;
            messageParser = "HTML";
            messageInliKeyBoard = ButtonKeyboard.exercise_list_keyboard();
        } else if (text.startsWith(Commands.EXERCISE_LIST)) { //< EXERCISE_LIST_CONTROLLER
            return this.exerciseListController.handleRequest(text, chatId, messageId);
        } else if (text.equals(Commands.VIDEO_LESSON_LIST)) {
            messageText = CommandsText.VIDEO_TEXT;
            messageParser = "HTML";
            messageInliKeyBoard = ButtonKeyboard.video_lesson_list_keyboard();
        } else if (text.startsWith(Commands.VIDEO_LESSON_LIST)) {
            return this.videoLessonController.handleRequest(text, chatId, messageId);
        } else {
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
            return codeMessage;
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (messageId == null) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setText(messageText);
            sendMessage.setChatId(chatId);
            sendMessage.setParseMode(messageParser);
            sendMessage.setReplyMarkup(messageInliKeyBoard);

            codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);
            codeMessage.setSendMessage(sendMessage);
        } else {
            EditMessageText editMessageText = new EditMessageText();
            editMessageText.setText(messageText);
            editMessageText.setChatId(chatId);
            editMessageText.setParseMode(messageParser);
            editMessageText.setReplyMarkup(messageInliKeyBoard);
            editMessageText.setMessageId(messageId);

            codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);
            codeMessage.setEditMessageText(editMessageText);
        }
        return codeMessage;
    }
}

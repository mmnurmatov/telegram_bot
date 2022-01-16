package uz.gita.bot.controller.video_lesson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.common.Commands;
import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.dto.CodeMessage;
import uz.gita.bot.holder.VideoLessonHolder;

public class VideoLessonController {
    private static final Logger LOGGER = LoggerFactory.getLogger(VideoLessonController.class);

    public CodeMessage handleRequest(String text, Long chatId, Integer messageId) {
        CodeMessage codeMessage = new CodeMessage(chatId);

        try {
            String[] requestArray = text.split("/");

            String messageText = "";
            String messageParser = "";
            InlineKeyboardMarkup messageInliKeyBoard = new InlineKeyboardMarkup();

            if (requestArray.length == 3) {//< /if,/for,/for ....

                messageText = Commands.getVideoLessonTopicText("/" + requestArray[2]);
                messageParser = "HTML";
                messageInliKeyBoard = VideoLessonHolder.videoLessonKeyboardMap.get(ParentQuestion.getParentId("/" + requestArray[2]));

                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setText(messageText);
                editMessageText.setChatId(chatId);
                editMessageText.setParseMode(messageParser);
                editMessageText.setReplyMarkup(messageInliKeyBoard);
                editMessageText.setMessageId(messageId);

                codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);
                codeMessage.setEditMessageText(editMessageText);
            } else if (requestArray.length == 4) {//< /{topic}/{questionId}
                String topic = requestArray[2];
                String questionId = requestArray[3];
                return VideoLessonHolder.get_video_lesson_Message(chatId, messageId, Integer.valueOf(questionId), topic);
            }

        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.toString());
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }
        return codeMessage;
    }
}

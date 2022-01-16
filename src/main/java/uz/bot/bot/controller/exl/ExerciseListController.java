package uz.gita.bot.controller.exl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.common.Commands;
import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.dto.CodeMessage;
import uz.gita.bot.holder.ExerciseListHolder;

public class ExerciseListController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExerciseListHolder.class);

    public CodeMessage handleRequest(String text, Long chatId, Integer messageId) {
        CodeMessage codeMessage = new CodeMessage(chatId);

        try {
            String[] requestArray = text.split("/");

            String messageText = "";
            String messageParser = "";
            InlineKeyboardMarkup messageInliKeyBoard = new InlineKeyboardMarkup();

            if (requestArray.length == 3) { //< /if,/for,/for ....

                messageText = Commands.getExerciseTopicText("/" + requestArray[2]);
                messageParser = "HTML";
                messageInliKeyBoard = ExerciseListHolder.exerciseListKeyboardMap.get(ParentQuestion.getParentId("/" + requestArray[2]));

                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setText(messageText);
                editMessageText.setChatId(chatId);
                editMessageText.setParseMode(messageParser);
                editMessageText.setReplyMarkup(messageInliKeyBoard);
                editMessageText.setMessageId(messageId);

                codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);
                codeMessage.setEditMessageText(editMessageText);

            } else if (requestArray.length == 4) { //< /{topic}/{questionId}
                String topic = requestArray[2];
                String questionId = requestArray[3];
                return ExerciseListHolder.get_exercise_questionMessage(chatId, messageId, Integer.valueOf(questionId), topic);
            } else if (requestArray.length == 5) { // /{topic}/{questionId}/{command}
                String topic = requestArray[2];
                String questionId = requestArray[3];
                String command = requestArray[4];

                if (("/" + command).equals(Commands.EXERCISE_SOLUTION)) {
                    return ExerciseListHolder.get_exercise_answerMessage(chatId, messageId, Integer.valueOf(questionId), topic);
                } else if (("/" + command).equals(Commands.EXERCISE_VIDEO_SOLUTION)) {
                    return ExerciseListHolder.get_exercise_solutionVideo(chatId, messageId, Integer.valueOf(questionId), topic);
                } else if (("/" + command).equals(Commands.EXERCISE_SOLUTION_REGISTER)) {
                    return ExerciseListHolder.get_exercise_solutionRegisterMessage(chatId, messageId, Integer.valueOf(questionId), topic);
                } else if (("/" + command).equals(Commands.EXERCISE_CONDITION_FILE)) {
                    return ExerciseListHolder.get_exercise_conditionFileMessage(chatId, messageId, Integer.valueOf(questionId), topic);
                } else {//< NOT_FOUND
                    codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
                }

            } else if (requestArray.length == 6) { //< OOP_EXERCISE_VIDEO_DOWNLOAD
                String topic = requestArray[2];
                String questionId = requestArray[3];
                String command = requestArray[4];
                String videoOrder = requestArray[5];

                if (("/" + command).equals(Commands.EXERCISE_VIDEO_DOWNLOAD)) {
                    return ExerciseListHolder.get_exercise_solutionVideo(chatId, messageId, Integer.valueOf(questionId), topic, Integer.valueOf(videoOrder));
                } else {//< NOT_FOUND
                    codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
                }

            } else {//< NOT_FOUND
                codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
            }

        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.toString());
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;
    }
}

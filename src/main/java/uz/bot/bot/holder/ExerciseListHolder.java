package uz.gita.bot.holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.send.SendDocument;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendVideo;
import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.common.Commands;
import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.CodeMessage;
import uz.gita.bot.dto.QuestionDto;
import uz.gita.bot.dto.VideoDTO;
import uz.gita.bot.repository.QuestionRepository;
import uz.gita.bot.repository.VideoRepository;
import uz.gita.bot.runTest.comp.CodeCompilerDto;
import uz.gita.bot.runTest.comp.CompileConstants;
import uz.gita.bot.runTest.comp.util.MethodInvocationUtils;
import uz.gita.bot.runTest.comp.util.RuntimeCompiler;
import uz.gita.bot.util.ButtonAsRow;
import uz.gita.bot.util.ButtonKeyboard;
import java.io.FileNotFoundException;
import java.util.*;

public class ExerciseListHolder {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExerciseListHolder.class);

    public static Map<Integer, List<QuestionDto>> exerciseListMap = new TreeMap<Integer, List<QuestionDto>>();
    public static Map<Integer, InlineKeyboardMarkup> exerciseListKeyboardMap = new TreeMap<Integer, InlineKeyboardMarkup>();

    public static Map<Long, QuestionDto> exerciseListSolutionRegisterMap = new TreeMap<Long, QuestionDto>();

    static {
        // fillExerciseMap();
    }

    public static void fillExerciseListHolder() {
        LOGGER.info("\n -- EXERCISE LIST HOLDER -- ");
        QuestionRepository questionRepository = new QuestionRepository();

        List<QuestionDto> if_else_exercise_list = questionRepository.get_question_list_by_parentID(ParentQuestion.IF_ELSE);
        List<QuestionDto> for_exercise_list = questionRepository.get_question_list_by_parentID(ParentQuestion.FOR);
        List<QuestionDto> nested_for_exercise_list = questionRepository.get_question_list_by_parentID(ParentQuestion.NESTED_FOR);
        List<QuestionDto> while_exercise_list = questionRepository.get_question_list_by_parentID(ParentQuestion.WHILE);
        List<QuestionDto> array_exercise_list = questionRepository.get_question_list_by_parentID(ParentQuestion.ARRAY);
        List<QuestionDto> matrix_exercise_list = questionRepository.get_question_list_by_parentID(ParentQuestion.MATRIX);
        List<QuestionDto> oop_exercise_list = questionRepository.get_question_list_by_parentID(ParentQuestion.OOP);


        /* GET_VIDEO_LIST_OF_QUESTION */
        fillExerciseWithVideo(oop_exercise_list);

        /* FILL_EXERCISE_LIST_MAP */
        fillExerciseListMap(ParentQuestion.IF_ELSE, if_else_exercise_list);
        fillExerciseListMap(ParentQuestion.FOR, for_exercise_list);
        fillExerciseListMap(ParentQuestion.NESTED_FOR, nested_for_exercise_list);
        fillExerciseListMap(ParentQuestion.WHILE, while_exercise_list);
        fillExerciseListMap(ParentQuestion.ARRAY, array_exercise_list);
        fillExerciseListMap(ParentQuestion.MATRIX, matrix_exercise_list);
        fillExerciseListMap(ParentQuestion.OOP, oop_exercise_list);

        /* FILL_EXERCISE_LIST_KEYBOARD */
        fillExerciseListKeyboardMap(ParentQuestion.IF_ELSE, Commands.IF, if_else_exercise_list);
        fillExerciseListKeyboardMap(ParentQuestion.FOR, Commands.FOR, for_exercise_list);
        fillExerciseListKeyboardMap(ParentQuestion.NESTED_FOR, Commands.NESTED_FOR, nested_for_exercise_list);
        fillExerciseListKeyboardMap(ParentQuestion.WHILE, Commands.WHILE, while_exercise_list);
        fillExerciseListKeyboardMap(ParentQuestion.ARRAY, Commands.ARRAY, array_exercise_list);
        fillExerciseListKeyboardMap(ParentQuestion.MATRIX, Commands.MATRIX, matrix_exercise_list);
        fillExerciseListKeyboardMap(ParentQuestion.OOP, Commands.OOP, oop_exercise_list);

        LOGGER.info("IF_ELSE exercise size " + if_else_exercise_list.size());
        LOGGER.info("FOR exercise size " + for_exercise_list.size());
        LOGGER.info("NESTED_FOR exercise size " + nested_for_exercise_list.size());
        LOGGER.info("WHILE exercise size " + while_exercise_list.size());
        LOGGER.info("ARRAY exercise size " + array_exercise_list.size());
        LOGGER.info("MATRIX exercise size " + matrix_exercise_list.size());

    }

    private static void fillExerciseListMap(Integer parentId, List<QuestionDto> questionDtoList) {
        exerciseListMap.put(parentId, questionDtoList);
    }

    private static void fillExerciseListKeyboardMap(Integer parentId, String topic, List<QuestionDto> questionDtoList) {
        if (questionDtoList != null) {

            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
            List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES
            int count = 0;

            Iterator<QuestionDto> iterator = questionDtoList.iterator();
            List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();
            while (iterator.hasNext()) {

                QuestionDto dto = iterator.next();

                InlineKeyboardButton menuButton = new InlineKeyboardButton();
                menuButton.setText(dto.getQuestionId() + ".");
                menuButton.setCallbackData(Commands.EXERCISE_LIST + topic + "/" + dto.getQuestionId());
                row.add(menuButton); //< ADD MENU BUTTON

                if (count == 4) {
                    count = -1;
                    rowsCollection.add(row); //< ADD ROW TO LINE (ROWS)
                    row = new ArrayList<InlineKeyboardButton>();
                }
                count++;
            }

            if (count != -1) {
                rowsCollection.add(row); //< ADD ROW TO LINE (ROWS)
            }

            rowsCollection.add(ButtonAsRow.back_to_exercise_menu_button()); //< ADD /exercise KEYBOARD BUTTON
            rowsCollection.add(ButtonAsRow.back_to_menu_button());//< ADD /menu KEYBOARD BUTTON
            markupInline.setKeyboard(rowsCollection); //< COLLECT ALL

            exerciseListKeyboardMap.put(parentId, markupInline);
        }
    }

    private static void fillExerciseWithVideo(List<QuestionDto> questionDtoList) {
        VideoRepository videoRepository = new VideoRepository();
        for (QuestionDto questionDto : questionDtoList) {
            List<VideoDTO> videoDTOList = videoRepository.get_video_lesson_by_parent_id(Integer.valueOf(questionDto.getId().toString()));
            questionDto.setVideoDTOList(videoDTOList);
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static CodeMessage get_exercise_questionMessage(Long chatId, Integer messageId, Integer questionId, String topic) {
        CodeMessage codeMessage = new CodeMessage(chatId);
        QuestionDto questionDto = getQuestion(questionId, topic); //< GET_EXERCISE

        if (questionDto != null) {
            EditMessageText editMessageText = new EditMessageText();
            editMessageText.setChatId(chatId);
            editMessageText.setMessageId(messageId);
            Integer state = questionDto.getQuestionState(); //< GET_EXERCISE_STATE_TYPE

            if (state.equals(QuestionState.HTML)) { //< IF_EXERCISE_QUESTION_HTML
                String text = "<b>code uz</b>  \n"
                        + "<i>Mavzu </i> :  <b>" + topic + "</b>   <i>Misolning soni </i> :  <b>" + questionId + "</b> \n"
                        + "<b>Savol </b> : \n"
                        + questionDto.getQuestionContentHtml();

                editMessageText.setText(text);
                editMessageText.setParseMode("HTML");
                codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);

                /* SET REPLY BUTTONS */
                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
                List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES


                rowsCollection.add(ButtonAsRow.exercise_answerAndBackToTopic_button(Commands.EXERCISE_LIST, topic, questionId));
                if (questionDto.getHasTest()) {
                    rowsCollection.add(ButtonAsRow.exercise_solutionRegister_button(Commands.EXERCISE_LIST, topic, questionId));
                }

                rowsCollection.add(ButtonAsRow.back_to_exercise_menu_button());
                rowsCollection.add(ButtonAsRow.back_to_menu_button());

                markupInline.setKeyboard(rowsCollection);

                editMessageText.setReplyMarkup(markupInline);

                codeMessage.setEditMessageText(editMessageText);
                codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);

                return codeMessage;
            } else if (state.equals(QuestionState.FILE)) { // OOP
                String text = "<b>code uz</b>  \n"
                        + "<i>Mavzu </i> :  <b>" + topic + "</b>\n<i>Misolning soni </i> :  <b>" + questionId + "</b>\n"
                        + "<i>Loyihaning nomi </i> : <b>" + questionDto.getTitle() + "</b> \n" +
                        "Loyihani import qilish :\n\n " +
                        "/importProject ga boring va\n video da loyihani import qilish ko'rstilgan.";

                editMessageText.setText(text);
                editMessageText.setParseMode("HTML");
                codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);

                /* SET REPLY BUTTONS */
                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
                List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES

                rowsCollection.add(ButtonAsRow.exercise_condition_file_button(Commands.EXERCISE_LIST, topic, questionId));
                rowsCollection.add(ButtonAsRow.exercise_solution_button(Commands.EXERCISE_LIST, topic, questionId));

                List<VideoDTO> videoDTOList = questionDto.getVideoDTOList();

                for (VideoDTO videoDTO : videoDTOList) {
                    rowsCollection.add(ButtonAsRow.exercise_video_download_button(Commands.EXERCISE_LIST, topic, questionId, videoDTO.getVideoOrder()));
                }


                rowsCollection.add(ButtonAsRow.back_to_topic_button(Commands.EXERCISE_LIST, topic));
                rowsCollection.add(ButtonAsRow.back_to_menu_button());

                markupInline.setKeyboard(rowsCollection);
                editMessageText.setReplyMarkup(markupInline);

                codeMessage.setEditMessageText(editMessageText);
                codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);
                return codeMessage;
            }
        } else { //< EXERCISE_NOT_FOUND
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }
        return codeMessage;
    }

    public static CodeMessage get_exercise_answerMessage(Long chatId, Integer messageId, Integer questionId, String topic) throws FileNotFoundException {

        CodeMessage codeMessage = new CodeMessage(chatId);
        QuestionDto questionDto = getQuestion(questionId, topic);

        Integer state = questionDto.getAnswerState();


        if (state.equals(QuestionState.HTML)) {

            /** SET REPLY BUTTONS */
            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
            List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES
            rowsCollection.add(ButtonAsRow.exercise_conditionAndBackToTopic_button(Commands.EXERCISE_LIST, topic, questionDto.getQuestionId()));

            if (questionDto.getAnswerVideoLink() != null) {
                rowsCollection.add(ButtonAsRow.exercise_video_solution_button(Commands.EXERCISE_LIST, topic, questionId));
            }

            rowsCollection.add(ButtonAsRow.back_to_exercise_menu_button());
            rowsCollection.add(ButtonAsRow.back_to_menu_button());

            markupInline.setKeyboard(rowsCollection);

            String text = "<b>code uz</b>  \n"
                    + "<i>Mavzu </i> :  <b>" + topic + "</b>   <i>Misolning soni </i> :  <b>" + questionId + "</b> \n"
                    + "<b>Savol </b> : \n"
                    + questionDto.getQuestionContentHtml() + " \n\n"
                    + "<b>Misolning javobi (yechilishi) : </b> \n"
                    + questionDto.getAnswerContentHtml();

            EditMessageText editMessageText = new EditMessageText();
            editMessageText.setChatId(chatId);
            editMessageText.setMessageId(messageId);
            editMessageText.setText(text);
            editMessageText.setParseMode("HTML");
            editMessageText.setReplyMarkup(markupInline);//< SET REPLY BUTTONS

            codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);
            codeMessage.setEditMessageText(editMessageText);
            return codeMessage;
        } else if (state.equals(QuestionState.FILE)) {

            SendDocument sendDocument = new SendDocument();
            sendDocument.setChatId(chatId);
            sendDocument.setDocument(questionDto.getAnswerFileLink());
            sendDocument.setCaption("Misolning yechimi.");

            codeMessage.setSendDocument(sendDocument);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setParseMode("HTML");
            sendMessage.setText("<b> code uz.</b>");

            sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.exercise_andBackToTopic_button(Commands.EXERCISE_LIST, topic, questionId),
                    ButtonAsRow.back_to_exercise_menu_button(), ButtonAsRow.back_to_menu_button()));

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_DOCUMENT_WITH_SEND_MESSAGE);
            return codeMessage;
        } else {//< EXERCISE_NOT_FOUND
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;
    }

    public static CodeMessage get_exercise_conditionFileMessage(Long chatId, Integer messageId, Integer questionId, String topic) throws FileNotFoundException {

        CodeMessage codeMessage = new CodeMessage(chatId);
        QuestionDto questionDto = getQuestion(questionId, topic);

        Integer state = questionDto.getAnswerState();

        if (state.equals(QuestionState.FILE)) {

            SendDocument sendDocument = new SendDocument();
            sendDocument.setChatId(chatId);
            sendDocument.setDocument(questionDto.getQuestionFileLink());
            sendDocument.setCaption("Misolning sharti.");

            codeMessage.setSendDocument(sendDocument);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setParseMode("HTML");
            sendMessage.setText("<b> code uz.</b>");

            sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.exercise_andBackToTopic_button(Commands.EXERCISE_LIST, topic, questionId),
                    ButtonAsRow.back_to_exercise_menu_button(), ButtonAsRow.back_to_menu_button()));

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_DOCUMENT_WITH_SEND_MESSAGE);
            return codeMessage;
        } else {//< EXERCISE_NOT_FOUND
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;
    }

    public static CodeMessage get_exercise_solutionVideo(Long chatId, Integer messageId, Integer questionId, String topic) {
        QuestionDto questionDto = getQuestion(questionId, topic);
        CodeMessage codeMessage = new CodeMessage(chatId);

        if (questionDto != null) {

            /* SET REPLY BUTTONS */
            //InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
            // List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES
            //   rowsCollection.add(ButtonAsRow.exercise_conditionAndBackToTopic_button(Commands.EXERCISE_LIST, topic, questionId));
            //    rowsCollection.add(ButtonAsRow.back_to_exercise_menu_button());
            //   rowsCollection.add(ButtonAsRow.back_to_menu_button());
            //   markupInline.setKeyboard(rowsCollection);

            SendVideo sendVideo = new SendVideo();
            sendVideo.setChatId(chatId);
            sendVideo.setVideo(questionDto.getAnswerVideoLink());
            sendVideo.setReplyToMessageId(messageId);
            sendVideo.setCaption("Misollar ro'yhali. \n  Mavzu : " + topic.toUpperCase() + " ,  Misolning soni: " + questionId);
            codeMessage.setSendVideo(sendVideo);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setParseMode("HTML");
            sendMessage.setText("<b> code uz.</b>");

            sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.exercise_conditionAndBackToTopic_button(Commands.EXERCISE_LIST, topic, questionId),
                    ButtonAsRow.back_to_exercise_menu_button(), ButtonAsRow.back_to_menu_button()));

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_VIDEO_WITH_SEND_MESSAGE);
        } else {
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;
    }

    public static CodeMessage get_exercise_solutionVideo(Long chatId, Integer messageId, Integer questionId, String topic, Integer videoOrder) {
        QuestionDto questionDto = getQuestion(questionId, topic);
        CodeMessage codeMessage = new CodeMessage(chatId);
        VideoDTO videoDTO = null;
        if (questionDto == null) {
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
            return codeMessage;
        }

        for (VideoDTO vDto : questionDto.getVideoDTOList()) {
            if (vDto.getVideoOrder().equals(videoOrder)) {
                videoDTO = vDto;
            }
        }

        if (videoDTO == null) {
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
            return codeMessage;
        }


        SendVideo sendVideo = new SendVideo();
        sendVideo.setChatId(chatId);
        sendVideo.setVideo(videoDTO.getVideoLink());
        sendVideo.setReplyToMessageId(messageId);

        String captionText = "Mavzu :  " + topic.toUpperCase()
                + "\nMisolning soni :  " + questionId + "\n"
                + "Loyihaning nomi :  " + questionDto.getTitle() + "\n"
                + "Video izoh raqami :  " + videoOrder + "\n";


        sendVideo.setCaption(captionText);
        codeMessage.setSendVideo(sendVideo);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setParseMode("HTML");
        sendMessage.setText("<b> code uz.</b>");

        sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.exercise_andBackToTopic_button(Commands.EXERCISE_LIST, topic, questionId),
                ButtonAsRow.back_to_exercise_menu_button(), ButtonAsRow.back_to_menu_button()));

        codeMessage.setSendMessage(sendMessage);
        codeMessage.setMessageType(CodeMessageType.SEND_VIDEO_WITH_SEND_MESSAGE);


        return codeMessage;
    }

    public static CodeMessage get_exercise_solutionRegisterMessage(Long chatId, Integer messageId, Integer questionId, String topic) {

        CodeMessage codeMessage = new CodeMessage(chatId);

        QuestionDto questionDto = getQuestion(questionId, topic);//< GET_QUESTION

        exerciseListSolutionRegisterMap.put(chatId, questionDto); //< ADD_TO_EXERCISE_SOLUTION_REGISTER_MAP

        EditMessageText editMessageText = new EditMessageText();
        editMessageText.setChatId(chatId);
        editMessageText.setMessageId(messageId);

        String text = "<b>code uz</b>  \n"
                + "<i>Mavzu </i> :  <b>" + topic + "</b>   <i>Misolning soni </i> :  <b>" + questionId + "</b> \n"
                + "Misolning echimini jo'nating. \n"
                + "Agar misol jo'natishda xatotilkar bo'lsa /help ga bo'ring.\n"
                + "Video da barchasi o'rgatilgan.\n";

        editMessageText.setText(text);
        editMessageText.setParseMode("HTML");

        /* SET REPLY BUTTONS */
        //  InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
        //  List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES
        // rowsCollection.add(ButtonAsRow.exercise_conditionAndBackToTopic_button(Commands.EXERCISE_LIST, topic, questionId));
        //   markupInline.setKeyboard(rowsCollection);
        //editMessageText.setReplyMarkup(markupInline);

        editMessageText.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.exercise_conditionAndBackToTopic_button(Commands.EXERCISE_LIST, topic, questionId)));

        codeMessage.setEditMessageText(editMessageText);
        codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);

        return codeMessage;


    }

    public static CodeMessage userExerciseSolutionCompileAndCallBackMessage(Long chatId, String text) {
        CodeMessage codeMessage = new CodeMessage(chatId);
        QuestionDto questionDto = exerciseListSolutionRegisterMap.get(chatId);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        try {
            if (questionDto != null) {


                if (questionDto.getHasTest()) {
                    String codeB = questionDto.getTest().replaceAll(CompileConstants.USER_METHOD_REPLACE, text);

                    /* SET REPLY BUTTONS */
                    //  InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
                    // List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES
                    // rowsCollection.add(ButtonAsRow.exercise_conditionAndBackToTopic_button(Commands.EXERCISE_LIST, topic, questionDto.getQuestionId()));
                    //markupInline.setKeyboard(rowsCollection);
                    //   sendMessage.setReplyMarkup(markupInline);

                    String topic = ParentQuestion.getTopicFromParentId(questionDto.getParentId());
                    sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(
                            ButtonAsRow.exercise_conditionAndBackToTopic_button(Commands.EXERCISE_LIST, topic.replace("/", ""), questionDto.getQuestionId())));

                    RuntimeCompiler r = new RuntimeCompiler();
                    r.addClass(CompileConstants.CLASS_NAME, codeB);
                    CodeCompilerDto result = r.compile();

                    if (result.getIsOk()) {
                        Object object = MethodInvocationUtils.invokeMethod(
                                r.getCompiledClass(CompileConstants.CLASS_NAME),
                                CompileConstants.METHOD_NAME);

                        if (object != null) {
                            sendMessage.setText(object.toString());
                            codeMessage.setSendMessage(sendMessage);
                            codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);
                            return codeMessage;
                        } else {
                            sendMessage.setText("ERROR IN COMPILE YOUR CODE");
                        }
                    } else {
                        sendMessage.setText(" Hatolik ro'y berdi. Yana birmarta harakat qilib ko'ring. \n" + result.getErrMsg());
                        codeMessage.setSendMessage(sendMessage);
                        codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);

                        return codeMessage;
                    }
                } else {
                    codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
                }
            } else {
                codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
            }

        } catch (Exception e) {
            sendMessage.setText(" Hatolik ro'y berdi. Yana birmarta harakat qilib ko'ring. \n" + e.toString());
            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);

        }

        return codeMessage;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static QuestionDto getQuestion(Integer questionId, String topic) {
        List<QuestionDto> topicQuestionList = exerciseListMap.get(ParentQuestion.getParentId("/" + topic));
        for (QuestionDto questionDto : topicQuestionList) {
            if (questionDto.getQuestionId().equals(questionId)) {
                return questionDto;
            }
        }
        return null;
    }
}

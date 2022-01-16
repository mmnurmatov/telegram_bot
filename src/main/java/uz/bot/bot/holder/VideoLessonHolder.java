package uz.gita.bot.holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendVideo;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.common.Commands;
import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.dto.CodeMessage;
import uz.gita.bot.dto.VideoLessonDto;
import uz.gita.bot.repository.VideoLessonRepository;
import uz.gita.bot.util.ButtonAsRow;
import uz.gita.bot.util.ButtonKeyboard;

import java.util.*;

public class VideoLessonHolder {
    private static final Logger LOGGER = LoggerFactory.getLogger(VideoLessonHolder.class);

    public static Map<Integer, List<VideoLessonDto>> videoLessonListMap = new TreeMap<Integer, List<VideoLessonDto>>();
    public static Map<Integer, InlineKeyboardMarkup> videoLessonKeyboardMap = new TreeMap<Integer, InlineKeyboardMarkup>();

    public static void fillVideoListHolder() {
        LOGGER.info("\n -- VIDEO LESSON HOLDER -- ");
        VideoLessonRepository videoLessonRepository = new VideoLessonRepository();

        List<VideoLessonDto> basic_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.BASIC);
        List<VideoLessonDto> if_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.IF_ELSE);
        List<VideoLessonDto> method_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.METHOD);
        List<VideoLessonDto> for_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.FOR);
        List<VideoLessonDto> nested_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.NESTED_FOR);
        List<VideoLessonDto> while_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.WHILE);
        List<VideoLessonDto> array_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.ARRAY);
        List<VideoLessonDto> matrix_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.MATRIX);
        List<VideoLessonDto> oop_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.OOP);
        List<VideoLessonDto> collection_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.COLLECTION);
        List<VideoLessonDto> collection_sort_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.COLLECTION_SORT);
        List<VideoLessonDto> cursor_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.CURSOR);
        List<VideoLessonDto> map_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.MAP);

        // List<VideoLessonDto> basic_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.ARRAY);
        // List<VideoLessonDto> basic_list = videoLessonRepository.get_video_lesson_by_parent_id(ParentQuestion.MATRIX);


        /* FILL_VIDEO_LIST_MAP */
        fillVideoLessonMap(ParentQuestion.BASIC, basic_list);
        fillVideoLessonMap(ParentQuestion.IF_ELSE, if_list);
        fillVideoLessonMap(ParentQuestion.METHOD, method_list);
        fillVideoLessonMap(ParentQuestion.FOR, for_list);
        fillVideoLessonMap(ParentQuestion.NESTED_FOR, nested_list);
        fillVideoLessonMap(ParentQuestion.WHILE, while_list);
        fillVideoLessonMap(ParentQuestion.ARRAY, array_list);
        fillVideoLessonMap(ParentQuestion.MATRIX, matrix_list);
        fillVideoLessonMap(ParentQuestion.OOP, oop_list);
        fillVideoLessonMap(ParentQuestion.COLLECTION, collection_list);
        fillVideoLessonMap(ParentQuestion.COLLECTION_SORT, collection_sort_list);
        fillVideoLessonMap(ParentQuestion.CURSOR, cursor_list);
        fillVideoLessonMap(ParentQuestion.MAP, map_list);


        /* FILL_VIDEO_LIST_KEYBOARD */
        fillVideoLessonKeyboardMap(ParentQuestion.BASIC, Commands.BASIC, basic_list);
        fillVideoLessonKeyboardMap(ParentQuestion.IF_ELSE, Commands.IF, if_list);
        fillVideoLessonKeyboardMap(ParentQuestion.METHOD, Commands.METHOD, method_list);
        fillVideoLessonKeyboardMap(ParentQuestion.FOR, Commands.FOR, for_list);
        fillVideoLessonKeyboardMap(ParentQuestion.NESTED_FOR, Commands.NESTED_FOR, nested_list);
        fillVideoLessonKeyboardMap(ParentQuestion.WHILE, Commands.WHILE, while_list);
        fillVideoLessonKeyboardMap(ParentQuestion.ARRAY, Commands.ARRAY, array_list);
        fillVideoLessonKeyboardMap(ParentQuestion.MATRIX, Commands.MATRIX, matrix_list);
        fillVideoLessonKeyboardMap(ParentQuestion.OOP, Commands.OOP, oop_list);
        fillVideoLessonKeyboardMap(ParentQuestion.COLLECTION, Commands.COLLECTION, collection_list);
        fillVideoLessonKeyboardMap(ParentQuestion.COLLECTION_SORT, Commands.COLLECTION_SORT, collection_sort_list);
        fillVideoLessonKeyboardMap(ParentQuestion.CURSOR, Commands.CURSOR, cursor_list);
        fillVideoLessonKeyboardMap(ParentQuestion.MAP, Commands.MAP, map_list);


        LOGGER.info("BASIC video lesson size " + basic_list.size());
        LOGGER.info("IF_ELSE video lesson size " + if_list.size());
        LOGGER.info("METHOD video lesson size " + method_list.size());
        LOGGER.info("FOR video lesson size " + for_list.size());
        LOGGER.info("NESTED_FOR video lesson size " + nested_list.size());
        LOGGER.info("WHILE video lesson size " + while_list.size());
        LOGGER.info("ARRAY video lesson size " + array_list.size());
        LOGGER.info("MATRIX video lesson size " + matrix_list.size());
        LOGGER.info("OOP video lesson size " + oop_list.size());
        LOGGER.info("COLLECTION video lesson size " + collection_list.size());
        LOGGER.info("COLLECTION_SORT video lesson size " + collection_sort_list.size());
        LOGGER.info("CURSOR video lesson size " + cursor_list.size());
        LOGGER.info("MAP video lesson size " + map_list.size());

    }

    private static void fillVideoLessonMap(Integer parentId, List<VideoLessonDto> videoLessonDtoList) {
        videoLessonListMap.put(parentId, videoLessonDtoList);
    }

    private static void fillVideoLessonKeyboardMap(Integer parentId, String topic, List<VideoLessonDto> videoLessonDtoList) {
        if (videoLessonDtoList != null) {

            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
            List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES
            int count = 0;

            Iterator<VideoLessonDto> iterator = videoLessonDtoList.iterator();
            List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();
            while (iterator.hasNext()) {

                VideoLessonDto dto = iterator.next();

                InlineKeyboardButton menuButton = new InlineKeyboardButton();
                menuButton.setText(dto.getQuestionId() + ".");
                menuButton.setCallbackData(Commands.VIDEO_LESSON_LIST + topic + "/" + dto.getQuestionId());
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

            rowsCollection.add(ButtonAsRow.back_to_video_menu_button()); //< ADD /exercise KEYBOARD BUTTON
            rowsCollection.add(ButtonAsRow.back_to_menu_button());//< ADD /menu KEYBOARD BUTTON
            markupInline.setKeyboard(rowsCollection); //< COLLECT ALL

            videoLessonKeyboardMap.put(parentId, markupInline);
        }

    }

    public static CodeMessage get_video_lesson_Message(Long chatId, Integer messageId, Integer questionId, String topic) {
        CodeMessage codeMessage = new CodeMessage(chatId);

        VideoLessonDto videoLessonDto = getVideoLesson(topic, questionId);
        if (videoLessonDto != null) {

            /* SEND_VIDEO */
            SendVideo sendVideo = new SendVideo();
            sendVideo.setChatId(chatId);

            sendVideo.setVideo(videoLessonDto.getVideoLink());

            sendVideo.setCaption("Video darslar. \n Mavzu : " + topic.toUpperCase() + " ,  video raqami: " + questionId);
            //  sendVideo.setReplyToMessageId(messageId);
            codeMessage.setSendVideo(sendVideo);


            /* SET REPLY BUTTONS */
//            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
//            List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES
//
//            rowsCollection.add(ButtonAsRow.back_to_topic_button(Commands.VIDEO_LESSON_LIST, topic));
//            rowsCollection.add(ButtonAsRow.back_to_video_menu_button());
//            rowsCollection.add(ButtonAsRow.back_to_menu_button());

            // markupInline.setKeyboard(rowsCollection);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setParseMode("HTML");
            sendMessage.setText("<b> code uz video darslar.</b>");

            // sendMessage.setReplyMarkup(markupInline);
            sendMessage.setReplyMarkup(ButtonKeyboard.build_button_keyboard(ButtonAsRow.back_to_topic_button(Commands.VIDEO_LESSON_LIST, topic),
                    ButtonAsRow.back_to_video_menu_button(),
                    ButtonAsRow.back_to_menu_button()));

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setMessageType(CodeMessageType.SEND_VIDEO_WITH_SEND_MESSAGE);


        } else {
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }
        return codeMessage;
    }

    private static VideoLessonDto getVideoLesson(String topic, Integer questionId) {
        List<VideoLessonDto> topicList = videoLessonListMap.get(ParentQuestion.getParentId("/" + topic));
        for (VideoLessonDto dto : topicList) {
            if (dto.getQuestionId().equals(questionId)) {
                return dto;
            }
        }
        return null;
    }
}

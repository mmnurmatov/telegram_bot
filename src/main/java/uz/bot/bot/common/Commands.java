package uz.gita.bot.common;

public class Commands {
    public static final String START = "/start"; //< START
    public static final String HELP = "/help"; //< HELP
    public static final String STOP = "/stop";
    public static final String MENU = "/menu"; //< LIST OF TUTORIALS (MAIN_MENU)


    public static final String IMPOERT_PROJECT = "/importProject"; //< LIST OF TUTORIALS (MAIN_MENU)


    /* MENU_BUTTONS */
    public static final String EXERCISE_LIST = "/exercise_list";
    public static final String VIDEO_LESSON_LIST = "/video_lesson_list"; //< VIDEO
    public static final String SUGGESTION = "/suggestion"; //< Takliflar / Misol jo'natish
    public static final String AUTHOR = "/author"; //< AUTHORIS INFO

    /* EXERCISE_LIST_COMMANDS  */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final String BASIC = "/basic";
    public static final String IF = "/if";
    public static final String NESTED_FOR = "/nestedFor";
    public static final String FOR = "/for";
    public static final String WHILE = "/while";
    public static final String ARRAY = "/array";
    public static final String MATRIX = "/matrix";
    public static final String METHOD = "/method";
    public static final String OOP = "/oop";
    public static final String COLLECTION = "/collection";
    public static final String COLLECTION_SORT = "/collection_sort";
    public static final String CURSOR = "/cursor";
    public static final String MAP = "/map";
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final String EXERCISE_SOLUTION = "/ex_solution";
    public static final String EXERCISE_CONDITION_FILE = "/ex_condition_file";
    public static final String EXERCISE_SOLUTION_REGISTER = "/ex_solution_register";
    public static final String EXERCISE_VIDEO_SOLUTION = "/ex_video_solution";
    public static final String EXERCISE_VIDEO_DOWNLOAD = "/ex_video_download";
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final String SUGGESTION_LIST = "$suggestionList$"; //< $...$/{fromId}$  //< ADMIN_SUGGESTION_LIST
    public static final String REFRESH_DB = "$refreshDb$"; //< ADMIN_REFRESH_DB_CODE_
    public static final String SEND_NOTIFICATION_TO_ALL_USER = "$sendNotificationToAllUser$"; //< ADMIN_SEND_MESSAGE_CODE
    public static final String SEND_NOTIFICATION_TO_USER = "$sendNotificationToUser$";//< $...$/#{userId}/#{text}$ //< ADMIN_SEND_NOTIFICATION_TO_USER
    public static final String REQUEST_COUNT = "$todayRequestCount$";// $...$/{fromDate}/{toDate$} // $todayRequestCount$/2018.09.17/2018.09.20$

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String getExerciseTopicText(String topic) {
        if (topic.equals(BASIC)) {
            return CommandsText.EXERCISE_LIST_BASIC_TEXT;
        } else if (topic.equals(IF)) {
            return CommandsText.EXERCISE_LIST_IF_TEXT;
        } else if (topic.equals(NESTED_FOR)) {
            return CommandsText.EXERCISE_LIST_NESTED_FOR_TEXT;
        } else if (topic.equals(FOR)) {
            return CommandsText.EXERCISE_LIST_FOR_TEXT;
        } else if (topic.equals(WHILE)) {
            return CommandsText.EXERCISE_LIST_WHILE_TEXT;
        } else if (topic.equals(ARRAY)) {
            return CommandsText.EXERCISE_LIST_ARRAY_TEXT;
        } else if (topic.equals(MATRIX)) {
            return CommandsText.EXERCISE_LIST_MATRIX_TEXT;
        } else if (topic.equals(OOP)) {
            return CommandsText.EXERCISE_LIST_OOP_TEXT;
        } else {
            return "NOT FOUND";
        }
    }


    public static String getVideoLessonTopicText(String topic) {
        if (topic.equals(BASIC)) {
            return CommandsText.VIDEO_LESSON_BASIC_TEXT;
        } else if (topic.equals(IF)) {
            return CommandsText.VIDEO_LESSON_IF_TEXT;
        } else if (topic.equals(METHOD)) {
            return CommandsText.VIDEO_LESSON_METHOD_TEXT;
        } else if (topic.equals(NESTED_FOR)) {
            return CommandsText.VIDEO_LESSON_NESTED_FOR_TEXT;
        } else if (topic.equals(FOR)) {
            return CommandsText.VIDEO_LESSON_FOR_TEXT;
        } else if (topic.equals(WHILE)) {
            return CommandsText.VIDEO_LESSON_WHILE_TEXT;
        } else if (topic.equals(ARRAY)) {
            return CommandsText.VIDEO_LESSON_ARRAY_TEXT;
        } else if (topic.equals(MATRIX)) {
            return CommandsText.VIDEO_LESSON_MATRIX_TEXT;
        } else if (topic.equals(OOP)) {
            return CommandsText.VIDEO_LESSON_OOP_TEXT;
        } else if (topic.equals(COLLECTION)) {
            return CommandsText.VIDEO_LESSON_COLLECTION_TEXT;
        } else if (topic.equals(COLLECTION_SORT)) {
            return CommandsText.VIDEO_LESSON_COLLECTION_SORT_TEXT;
        } else if (topic.equals(CURSOR)) {
            return CommandsText.VIDEO_LESSON_CURSOR_TEXT;
        } else if (topic.equals(MAP)) {
            return CommandsText.VIDEO_LESSON_MAP_TEXT;
        } else {
            return "NOT FOUND";
        }
    }
}

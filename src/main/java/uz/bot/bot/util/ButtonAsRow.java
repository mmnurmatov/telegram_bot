package uz.gita.bot.util;

import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import uz.gita.bot.common.Commands;

import java.util.ArrayList;
import java.util.List;

public class ButtonAsRow {
    public static List<InlineKeyboardButton> make_button_as_row(InlineKeyboardButton inlineKeyboardButton) {
        List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();
        row.add(inlineKeyboardButton);

        return row;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static List<InlineKeyboardButton> back_to_menu_button() {
        return make_button_as_row(SingleButton.make_single_button_with_emojer(Commands.MENU, "Asosiy menuga o'tish", ":clipboard:"));
    }

    public static List<InlineKeyboardButton> menu_button() {
        return make_button_as_row(SingleButton.make_single_button_with_emojer(Commands.MENU, "Asosiy menu", ":clipboard:"));
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static List<InlineKeyboardButton> back_to_exercise_menu_button() {
        return make_button_as_row(SingleButton.make_single_button_with_emojer(Commands.EXERCISE_LIST, "Misollar ro'yhatiga o'tish", ":computer:"));
    }

    public static List<InlineKeyboardButton> exercise_menu_button() {
        return make_button_as_row(SingleButton.make_single_button_with_emojer(Commands.EXERCISE_LIST, "Misollar ro'yhati", ":computer:"));
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static List<InlineKeyboardButton> video_menu_button() {
        return make_button_as_row(SingleButton.make_single_button_with_emojer(Commands.VIDEO_LESSON_LIST, "Video darslar ro'yhati", ":video_camera:"));
    }

    public static List<InlineKeyboardButton> back_to_video_menu_button() {
        return make_button_as_row(SingleButton.make_single_button_with_emojer(Commands.VIDEO_LESSON_LIST, "Video darslar ro'yhatiga o'tish", ":video_camera:"));
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static List<InlineKeyboardButton> help_button() {
        return make_button_as_row(SingleButton.make_single_button_with_emojer(Commands.HELP, "Yordam", ":mag_right:"));
    }

    public static List<InlineKeyboardButton> suggestion_button() {
        return make_button_as_row(SingleButton.make_single_button_with_emojer(Commands.SUGGESTION, "Takliflar / Misol jo'natish", ":memo:"));
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static List<InlineKeyboardButton> exercise_answerAndBackToTopic_button(String initialUrl, String topic, Integer questionId) {
        List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();

        row.add(SingleButton.make_single_button(initialUrl + "/" + topic + "/" + questionId + Commands.EXERCISE_SOLUTION, "Misolning javobi."));
        row.add(SingleButton.make_single_button(initialUrl + "/" + topic, topic.toUpperCase() + "  ga qaytish."));
        return row;
    }

    public static List<InlineKeyboardButton> exercise_conditionAndBackToTopic_button(String initialUrl, String topic, Integer questionId) {
        List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();

//        InlineKeyboardButton answerButton = new InlineKeyboardButton();
//        answerButton.setText("Misolning sharti.");
//        answerButton.setCallbackData(initialUrl + "/" + topic + "/" + questionId);

        row.add(SingleButton.make_single_button(initialUrl + "/" + topic + "/" + questionId, "Misolning sharti."));
        row.add(SingleButton.make_single_button(initialUrl + "/" + topic, topic.toUpperCase() + "  ga qaytish."));
        return row;
    }

    /* BACK_TO_EXERCISE_
       BACK_TO_TOPIC  */
    public static List<InlineKeyboardButton> exercise_andBackToTopic_button(String initialUrl, String topic, Integer questionOrder) {

        List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();
        row.add(SingleButton.make_single_button(initialUrl + "/" + topic + "/" + questionOrder, "Misolga qaytish."));
        row.add(SingleButton.make_single_button(initialUrl + "/" + topic, topic.toUpperCase() + "  ga qaytish."));
        return row;
    }

    public static List<InlineKeyboardButton> exercise_condition_file_button(String initialUrl, String topic, Integer questionId) {
        List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();

        row.add(SingleButton.make_single_button_with_emojer(initialUrl + "/" + topic + "/" + questionId + Commands.EXERCISE_CONDITION_FILE, "Misolning sharti.", ":scroll:"));
        return row;
    }

    public static List<InlineKeyboardButton> exercise_solution_button(String initialUrl, String topic, Integer questionId) {
        List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();

        row.add(SingleButton.make_single_button_with_emojer(initialUrl + "/" + topic + "/" + questionId + Commands.EXERCISE_SOLUTION, "Misolning yechimi.", ":page_with_curl:"));
        return row;
    }

    public static List<InlineKeyboardButton> exercise_solutionRegister_button(String initialUrl, String topic, Integer questionId) {
        List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();

//        InlineKeyboardButton menuButton = new InlineKeyboardButton();
//        menuButton.setText("Misolning Yechimini jo'nating");
//        menuButton.setCallbackData(initialUrl + "/" + topic + "/" + questionId + Commands.EXERCISE_SOLUTION_REGISTER);

        row.add(SingleButton.make_single_button_with_emojer(initialUrl + "/" + topic + "/" + questionId + Commands.EXERCISE_SOLUTION_REGISTER, "Misolning Yechimini jo'nating",":point_right:")); //< ADD MENU BUTTON

        return row;
    }

    public static List<InlineKeyboardButton> exercise_video_solution_button(String initialUrl, String topic, Integer questionId) {

        String command = initialUrl + "/" + topic + "/" + questionId + Commands.EXERCISE_VIDEO_SOLUTION;

        return make_button_as_row(SingleButton.make_single_button_with_emojer(command, "Misolning yechilish izohi", ":clapper:"));
    }

    public static List<InlineKeyboardButton> exercise_video_download_button(String initialUrl, String topic, Integer questionId, Integer videoOrder) {

        String command = initialUrl + "/" + topic + "/" + questionId + Commands.EXERCISE_VIDEO_DOWNLOAD + "/" + videoOrder;

        return make_button_as_row(SingleButton.make_single_button_with_emojer(command, "Misolning yechilish video izohi. " + videoOrder, ":clapper:"));
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static List<InlineKeyboardButton> back_to_topic_button(String initialUrl, String topic) {
        List<InlineKeyboardButton> row = new ArrayList<InlineKeyboardButton>();
        row.add(SingleButton.make_single_button(initialUrl + "/" + topic, topic.toUpperCase() + "  ga qaytish."));
        return row;
    }
}

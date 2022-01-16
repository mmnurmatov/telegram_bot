package uz.gita.bot.util;

import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import uz.gita.bot.common.Commands;

import java.util.ArrayList;
import java.util.List;

public class ButtonKeyboard {
    public static InlineKeyboardMarkup build_button_keyboard(List<InlineKeyboardButton>... singleButtons) {
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();
        for (List<InlineKeyboardButton> button : singleButtons) {
            rowsCollection.add(button); //< ADD_MENU_BUTTON
        }
        markupInline.setKeyboard(rowsCollection); //< COLLECT ALL

        return markupInline;
    }

    public static InlineKeyboardMarkup start_keyboard() {
        return build_button_keyboard(ButtonAsRow.menu_button(), ButtonAsRow.help_button());
    }

    public static InlineKeyboardMarkup menu_keyboard() {
        return build_button_keyboard(ButtonAsRow.exercise_menu_button(), ButtonAsRow.video_menu_button(), ButtonAsRow.suggestion_button());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static InlineKeyboardMarkup exercise_list_keyboard() {

        List<InlineKeyboardButton> row_if =
                ButtonAsRow.make_button_as_row(
                        SingleButton.make_single_button(Commands.EXERCISE_LIST + Commands.IF, " 1. if (else) operatori"));

        List<InlineKeyboardButton> row_for =
                ButtonAsRow.make_button_as_row(
                        SingleButton.make_single_button(Commands.EXERCISE_LIST + Commands.FOR, " 2.  for operatori "));

        List<InlineKeyboardButton> row_while =
                ButtonAsRow.make_button_as_row(
                        SingleButton.make_single_button(Commands.EXERCISE_LIST + Commands.WHILE, " 3. while operatori "));

        List<InlineKeyboardButton> row_nestedFor =
                ButtonAsRow.make_button_as_row(
                        SingleButton.make_single_button(Commands.EXERCISE_LIST + Commands.NESTED_FOR, " 4. Murakkab sikl (nested loop) "));

        List<InlineKeyboardButton> row_array =
                ButtonAsRow.make_button_as_row(
                        SingleButton.make_single_button(Commands.EXERCISE_LIST + Commands.ARRAY, " 5. array (massiv)"));

        List<InlineKeyboardButton> row_matrix =
                ButtonAsRow.make_button_as_row(
                        SingleButton.make_single_button(Commands.EXERCISE_LIST + Commands.MATRIX, " 6. Matrix (Matritsa)"));

        List<InlineKeyboardButton> row_oop =
                ButtonAsRow.make_button_as_row(
                        SingleButton.make_single_button(Commands.EXERCISE_LIST + Commands.OOP, " 7. OOP"));

        return build_button_keyboard(row_if, row_for, row_while, row_nestedFor, row_array, row_matrix, row_oop,
                ButtonAsRow.back_to_menu_button());
    }

    public static InlineKeyboardMarkup video_lesson_list_keyboard() {

        List<InlineKeyboardButton> row_basic = new ArrayList<InlineKeyboardButton>();
        row_basic.add(new InlineKeyboardButton().setText(" 1. Kirish & Primitive Data type").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.BASIC));

        List<InlineKeyboardButton> row_if = new ArrayList<InlineKeyboardButton>();
        row_if.add(new InlineKeyboardButton().setText(" 2. if (else) operatori").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.IF));

        List<InlineKeyboardButton> row_method = new ArrayList<InlineKeyboardButton>();
        row_method.add(new InlineKeyboardButton().setText(" 3. Methodlar ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.METHOD));

        List<InlineKeyboardButton> row_for = new ArrayList<InlineKeyboardButton>();
        row_for.add(new InlineKeyboardButton().setText(" 4.  for operatori ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.FOR));

        List<InlineKeyboardButton> row_while = new ArrayList<InlineKeyboardButton>();
        row_while.add(new InlineKeyboardButton().setText(" 5. while operatori ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.WHILE));

        List<InlineKeyboardButton> row_nestedFor = new ArrayList<InlineKeyboardButton>();
        row_nestedFor.add(new InlineKeyboardButton().setText(" 6. Murakkab sikl (nested loop) ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.NESTED_FOR));

        List<InlineKeyboardButton> row_array = new ArrayList<InlineKeyboardButton>();
        row_array.add(new InlineKeyboardButton().setText(" 7. array (massive,to'plam)").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.ARRAY));

        List<InlineKeyboardButton> row_matrix = new ArrayList<InlineKeyboardButton>();
        row_matrix.add(new InlineKeyboardButton().setText(" 8.Matrix (Matritsa)").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.MATRIX));

        List<InlineKeyboardButton> row_oop = new ArrayList<InlineKeyboardButton>();
        row_oop.add(new InlineKeyboardButton().setText(" 9. OOP ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.OOP));

        List<InlineKeyboardButton> row_collection = new ArrayList<InlineKeyboardButton>();
        row_collection.add(new InlineKeyboardButton().setText(" 10. Collection ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.COLLECTION));

        List<InlineKeyboardButton> row_collection_sort = new ArrayList<InlineKeyboardButton>();
        row_collection_sort.add(new InlineKeyboardButton().setText(" 11. Collection Sort ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.COLLECTION_SORT));

        List<InlineKeyboardButton> row_cursor = new ArrayList<InlineKeyboardButton>();
        row_cursor.add(new InlineKeyboardButton().setText(" 12. Cursor ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.CURSOR));

        List<InlineKeyboardButton> row_map = new ArrayList<InlineKeyboardButton>();
        row_map.add(new InlineKeyboardButton().setText(" 13. Map ").setCallbackData(Commands.VIDEO_LESSON_LIST + Commands.MAP));

        return build_button_keyboard(row_basic, row_if, row_method, row_for, row_while, row_nestedFor, row_array, row_matrix,
                row_oop, row_collection, row_collection_sort, row_cursor, row_map,
                ButtonAsRow.back_to_menu_button());
    }

//
//    private static InlineKeyboardButton get_topic_inline_keyboard_mark_up_button_pass(String topic) {
//        InlineKeyboardButton topicButton = new InlineKeyboardButton();
//        topicButton.setText("' " + topic.replace("/", "").toUpperCase() + " ' " + "  ga qaytish.");
//        topicButton.setCallbackData(topic);
//
//        return topicButton;
//    }
}

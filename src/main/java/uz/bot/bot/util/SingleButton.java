package uz.gita.bot.util;

import com.vdurmont.emoji.EmojiParser;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;

public class SingleButton {
    public static InlineKeyboardButton make_single_button_with_emojer(String command, String text, String emojer) {
        String emojerText = EmojiParser.parseToUnicode(emojer + " " + text);
        return new InlineKeyboardButton().setText(emojerText).setCallbackData(command);
    }

    public static InlineKeyboardButton make_single_button(String command, String text) {
        return new InlineKeyboardButton().setText(text).setCallbackData(command);
    }
}

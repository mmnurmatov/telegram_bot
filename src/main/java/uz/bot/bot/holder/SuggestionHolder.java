package uz.gita.bot.holder;

import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.common.CommandsText;
import uz.gita.bot.dto.CodeMessage;
import uz.gita.bot.dto.SuggestionDto;
import uz.gita.bot.util.ButtonAsRow;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SuggestionHolder {
    public static Map<Long, SuggestionDto> suggestionListRegister = new TreeMap<Long, SuggestionDto>();

    public static CodeMessage registerSuggestion(Long chatId, Integer messageId) {
        CodeMessage codeMessage = new CodeMessage(chatId);
        try {
            suggestionListRegister.put(chatId, new SuggestionDto(chatId)); //< REGISTER_SUGGESTION
            EditMessageText editMessageText = new EditMessageText();
            editMessageText.setText(CommandsText.SUGGESTION_TEXT);
            editMessageText.setChatId(chatId);
            editMessageText.setParseMode("HTML");

            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();//< INLINE ROWS CONTAINER
            List<List<InlineKeyboardButton>> rowsCollection = new ArrayList<List<InlineKeyboardButton>>();//< INLINE ROES
            rowsCollection.add(ButtonAsRow.back_to_menu_button());

            markupInline.setKeyboard(rowsCollection);

            editMessageText.setReplyMarkup(markupInline);
            editMessageText.setMessageId(messageId);
            codeMessage.setEditMessageText(editMessageText);
            codeMessage.setMessageType(CodeMessageType.EDIT_MESSAGE_TEXT);

        } catch (Exception e) {
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        return codeMessage;
    }
}

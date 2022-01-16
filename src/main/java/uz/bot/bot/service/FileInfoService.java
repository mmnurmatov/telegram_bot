package uz.gita.bot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Document;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.PhotoSize;
import org.telegram.telegrambots.api.objects.Video;
import uz.gita.bot.common.CodeMessageType;
import uz.gita.bot.dto.CodeMessage;

import java.util.List;

public class FileInfoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileInfoService.class);

    public CodeMessage getFileInfo(Message message) { //< GETTING MESSAGE (WHICH CONTAINS FILE)
        LOGGER.info(" FILE INFO REQUEST ");

        Long cId = message.getChatId();

        CodeMessage codeMessage = new CodeMessage(cId);
        codeMessage.setMessageType(CodeMessageType.SEND_MESSAGE);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(cId);


        if (message.getPhoto() != null) { // ADDING PHOTO
            LOGGER.info(" -> PHOTO ");
            String s = this.show_photo_detail(message.getPhoto());
            sendMessage.setText(s);
        } else if (message.getVideo() != null) { // ADDING VIDEO
            LOGGER.info(" -> VIDEO ");
            String s = this.show_video_detail(message.getVideo());
            sendMessage.setText(s);
        } else if (message.getDocument() != null) {
            LOGGER.info(" -> DOCUMENT ");
            String s = this.show_document_detail(message.getDocument());
            sendMessage.setText(s);
        } else { //< NO_MESSAGE_TEXT_NO_FILE
            LOGGER.info(" -> NOT FOUND ");
            codeMessage.setMessageType(CodeMessageType.NOT_FOUNT);
        }

        codeMessage.setSendMessage(sendMessage);
        return codeMessage;
    }

    private String show_photo_detail(List<PhotoSize> photoSizeList) {
        String s = "------------------------- PHOTO INFO -------------------------\n";
        for (PhotoSize photoSize : photoSizeList) {
            s += " Size = " + photoSize.getFileSize() + "  ,    ID  = " + photoSize.getFileId() + " \n";
        }
        LOGGER.info(s);
        return s;
    }

    private String show_video_detail(Video video) {
        String s = "------------------------- VIDEO INFO -------------------------\n";
        s += video.toString(); //" Size " + video.getFileSize() + "  ,  duration = " + video.getDuration() + "  ID = " + video.getMimeType();
        LOGGER.info(s);
        return s;
    }

    private String show_document_detail(Document document) {
        String s = "------------------------- PHOTO INFO -------------------------\n";
        s += document.toString();
        LOGGER.info(s);
        return s;
    }
}

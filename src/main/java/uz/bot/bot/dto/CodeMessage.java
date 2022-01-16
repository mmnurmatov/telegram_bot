package uz.gita.bot.dto;

import org.telegram.telegrambots.api.methods.send.SendDocument;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.methods.send.SendVideo;
import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;

import java.util.List;

/**
 * Created by Bigman on 21.05.2018.
 */
public class CodeMessage {
    private Integer messageType;
    private SendMessage sendMessage;
    private SendPhoto sendPhoto;
    private SendVideo sendVideo;
    private EditMessageText editMessageText;
    private SendDocument sendDocument;

    private Long chatID;
    private String text;


    private List<SendMessage> sendMessageList;

    public CodeMessage() {

    }

    public CodeMessage(Long chatID) {
        this.chatID = chatID;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public SendMessage getSendMessage() {
        return sendMessage;
    }

    public void setSendMessage(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public SendPhoto getSendPhoto() {
        return sendPhoto;
    }

    public void setSendPhoto(SendPhoto sendPhoto) {
        this.sendPhoto = sendPhoto;
    }

    public SendVideo getSendVideo() {
        return sendVideo;
    }

    public void setSendVideo(SendVideo sendVideo) {
        this.sendVideo = sendVideo;
    }

    public EditMessageText getEditMessageText() {
        return editMessageText;
    }

    public void setEditMessageText(EditMessageText editMessageText) {
        this.editMessageText = editMessageText;
    }

    public Long getChatID() {
        return chatID;
    }

    public void setChatID(Long chatID) {
        this.chatID = chatID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<SendMessage> getSendMessageList() {
        return sendMessageList;
    }

    public void setSendMessageList(List<SendMessage> sendMessageList) {
        this.sendMessageList = sendMessageList;
    }

    public SendDocument getSendDocument() {
        return sendDocument;
    }

    public void setSendDocument(SendDocument sendDocument) {
        this.sendDocument = sendDocument;
    }
}

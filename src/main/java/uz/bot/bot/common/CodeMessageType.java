package uz.gita.bot.common;

public interface CodeMessageType {
    Integer SEND_MESSAGE = 1;
    Integer EDIT_MESSAGE_TEXT = 2;
    Integer SEND_PHOTO = 3;
    Integer SEND_VIDEO = 4;
    Integer NOT_FOUNT = 5; //< WHEN NOT FOUNT (IN NULL_POINTER) (REQUIRED cId TO SEND_MESSAGE_TO_USER)
    Integer SEND_MESSAGE_LIST = 6;
    Integer SEND_VIDEO_WITH_SEND_MESSAGE = 7;
    Integer SEND_DOCUMENT_WITH_SEND_MESSAGE = 8;
    // Integer SEND_EXCEPTION_THROW_MESSAGE = 9;
}

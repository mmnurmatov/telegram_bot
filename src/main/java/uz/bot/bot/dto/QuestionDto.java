package uz.gita.bot.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by Bigman on 31.12.2017.
 */
public class QuestionDto {

    private Long id;

    private String questionContentText;
    private String questionContentHtml;
    private String questionImageLink;
    private String questionFileLink;
    private Integer questionState;// STATE OF QUESTION (Text,Html,Image,)

    private String answerContentText;
    private String answerContentHtml;
    private String answerImageLink;
    private String answerVideoLink;
    private String answerFileLink;
    private Integer answerState; // STATE OF ANSWER (Txt,Html,Image,Video)

    private Boolean visible;
    private Date createdDate;

    private String title;  // SOME DESCRIPTION OF QUESTION

    private Integer questionId;//ORDER OF QUESTION RELATIVE PARENT
    private Integer parentId; // ID OF (IF,FOR,WHILE)

    public Boolean hasTest; //< INFO ABOUT QUESTION HAS TEXT OR NOT
    public String test; //< TEST STRING

    private List<VideoDTO> videoDTOList;

    public QuestionDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionContentText() {
        return questionContentText;
    }

    public void setQuestionContentText(String questionContentText) {
        this.questionContentText = questionContentText;
    }

    public String getQuestionContentHtml() {
        return questionContentHtml;
    }

    public void setQuestionContentHtml(String questionContentHtml) {
        this.questionContentHtml = questionContentHtml;
    }

    public String getAnswerContentText() {
        return answerContentText;
    }

    public void setAnswerContentText(String answerContentText) {
        this.answerContentText = answerContentText;
    }

    public String getAnswerContentHtml() {
        return answerContentHtml;
    }

    public void setAnswerContentHtml(String answerContentHtml) {
        this.answerContentHtml = answerContentHtml;
    }

    public String getQuestionImageLink() {
        return questionImageLink;
    }

    public void setQuestionImageLink(String questionImageLink) {
        this.questionImageLink = questionImageLink;
    }

    public Integer getQuestionState() {
        return questionState;
    }

    public void setQuestionState(Integer questionState) {
        this.questionState = questionState;
    }

    public String getAnswerImageLink() {
        return answerImageLink;
    }

    public void setAnswerImageLink(String answerImageLink) {
        this.answerImageLink = answerImageLink;
    }

    public String getAnswerVideoLink() {
        return answerVideoLink;
    }

    public void setAnswerVideoLink(String answerVideoLink) {
        this.answerVideoLink = answerVideoLink;
    }

    public Integer getAnswerState() {
        return answerState;
    }

    public void setAnswerState(Integer answerState) {
        this.answerState = answerState;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Boolean getHasTest() {
        return hasTest;
    }

    public void setHasTest(Boolean hasTest) {
        this.hasTest = hasTest;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getQuestionFileLink() {
        return questionFileLink;
    }

    public void setQuestionFileLink(String questionFileLink) {
        this.questionFileLink = questionFileLink;
    }

    public String getAnswerFileLink() {
        return answerFileLink;
    }

    public void setAnswerFileLink(String answerFileLink) {
        this.answerFileLink = answerFileLink;
    }

    public List<VideoDTO> getVideoDTOList() {
        return videoDTOList;
    }

    public void setVideoDTOList(List<VideoDTO> videoDTOList) {
        this.videoDTOList = videoDTOList;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getQuestionId() + "  ---  " + this.title + "\n");
    }
}

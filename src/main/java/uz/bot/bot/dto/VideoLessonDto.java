package uz.gita.bot.dto;

import java.util.Date;

/**
 * Created by Bigman on 27.05.2018.
 */
public class VideoLessonDto {

    private Long id;

    private String title;  // SOME DESCRIPTION OF QUESTION
    private String videoLink;

    private Integer questionId;//ORDER OF QUESTION RELATIVE PARENT
    private Integer parentId; // ID OF (IF,FOR,WHILE)

    private Date createdDate;
    private Boolean visible;

    public VideoLessonDto() {
    }

    public VideoLessonDto(Integer questionId, Integer parentId, String videoLink,
                          String title, Date createdDate, Boolean visible) {
        this.id = id;
        this.title = title;
        this.videoLink = videoLink;
        this.questionId = questionId;
        this.parentId = parentId;
        this.createdDate = createdDate;
        this.visible = visible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}

package uz.gita.bot.dto;

import java.util.Date;

/**
 * Created by BigMan on 10.09.2018.
 */
public class VideoDTO {
    private Long id;

    private String title;  // SOME DESCRIPTION OF QUESTION
    private String videoLink;

    private Integer videoOrder;//ORDER OF QUESTION RELATIVE PARENT
    private Integer parentId; //< RELATED QUESTION ID

    private Date createdDate;
    private Boolean visible;


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

    public Integer getVideoOrder() {
        return videoOrder;
    }

    public void setVideoOrder(Integer videoOrder) {
        this.videoOrder = videoOrder;
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

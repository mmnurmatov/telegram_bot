package uz.gita.bot.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Bigman on 27.02.2018.
 */
public class SuggestionDto {
    private Long id;
    private Long user_t_id;
    private String content;
    private Date date;
    private Boolean visible;

    public SuggestionDto() {

    }

    public SuggestionDto(Long user_t_id) {
        this.user_t_id = user_t_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Long getUser_t_id() {
        return user_t_id;
    }

    public void setUser_t_id(Long user_t_id) {
        this.user_t_id = user_t_id;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        StringBuilder s = new StringBuilder();
        s.append("\n\n\n*************************************************");
        s.append("\nSUGGESTION_ID: " + this.id);
        s.append("\nUSER_T_ID: " + this.user_t_id);
        s.append("\nDATE: " + simpleDateFormat.format(this.date));
        s.append("\nVISIBLE: " + this.visible);
        s.append("\nCONTENT: \n" + this.content);
        s.append("\n*************************************************\n");

        return s.toString();
    }
}

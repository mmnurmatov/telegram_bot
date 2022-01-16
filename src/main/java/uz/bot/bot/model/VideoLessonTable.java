package uz.gita.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "video_lesson_table")
public class VideoLessonTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIDEO_LESSON_TABLE_SEQUENCE")
    @SequenceGenerator(sequenceName = "VIDEO_LESSON_TABLE_SEQUENCE", allocationSize = 1, name = "VIDEO_LESSON_TABLE_SEQUENCE")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "title", length = 300000)
    private String title;

    @Column(name = "video_link")
    private String videoLink;

    @Column(name = "create_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date createDate;

    @Column(name = "visible")
    private boolean visible;

    @Column(name = "question_id", nullable = false, updatable = false)
    private Long question;

    @Column(name = "parent_id", nullable = false, updatable = false)
    private Long parent;
}

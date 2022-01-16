package uz.gita.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "video_table")
public class VideoTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIDEO_TABLE_SEQUENCE")
    @SequenceGenerator(sequenceName = "VIDEO_TABLE_SEQUENCE", allocationSize = 1, name = "VIDEO_TABLE_SEQUENCE")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "video_link")
    private String videoLink;

    @Column(name = "video_order")
    private Long videoOrder;

    @Column(name = "visible")
    private boolean visible;

    @Column(name = "created_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date createdDate;

    @Column(name = "parent_id", nullable = false, updatable = false)
    private Long parent;
}

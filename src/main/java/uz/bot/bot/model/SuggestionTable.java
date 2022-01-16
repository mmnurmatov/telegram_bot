package uz.gita.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "suggestion_table")
public class SuggestionTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SUGGESTION_TABLE_SEQUENCE")
    @SequenceGenerator(sequenceName = "SUGGESTION_TABLE_SEQUENCE", allocationSize = 1, name = "SUGGESTION_TABLE_SEQUENCE")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "content", length = 300000)
    private String content;

    @Column(name = "visible", nullable = false)
    private boolean visible;

    @Column(name = "created_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_t_id", referencedColumnName = "id")
    @JsonIgnore
    UserTable userTable;
}

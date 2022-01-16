package uz.gita.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user_request_table")
public class UserRequestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_REQUEST_TABLE_SEQUENCE")
    @SequenceGenerator(sequenceName = "USER_REQUEST_TABLE_SEQUENCE", allocationSize = 1, name = "USER_REQUEST_TABLE_SEQUENCE")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "request_text", length = 500000)
    private String requestText;

    @Column(name = "request_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date requestDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_t_id", referencedColumnName = "id")
    @JsonIgnore
    UserTable userTable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnore
    UserTable user;
}

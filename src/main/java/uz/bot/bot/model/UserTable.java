package uz.gita.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user_table")
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_TABLE_SEQUENCE")
    @SequenceGenerator(sequenceName = "USER_TABLE_SEQUENCE", allocationSize = 1, name = "USER_TABLE_SEQUENCE")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String userName;

    @Column(name = "joined_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date joinedDate;

    @Column(name = "visible", nullable = false)
    private boolean visible;

    @Column(name = "last_request_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date lastRequestDate;

    @Column(name = "user_t_id", nullable = false, updatable = false)
    private Long parent;
}

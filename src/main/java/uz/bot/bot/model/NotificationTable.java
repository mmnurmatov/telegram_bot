package uz.gita.bot.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "notification_table")
public class NotificationTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NOTIFICATION_TABLE_SEQUENCE")
    @SequenceGenerator(sequenceName = "NOTIFICATION_TABLE_SEQUENCE", allocationSize = 1, name = "NOTIFICATION_TABLE_SEQUENCE")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "content", length = 300000)
    private String content;

    @Column(name = "visible", nullable = false)
    private boolean visible;

    @Column(name = "c_time", length = 300000)
    private String cTime;
}

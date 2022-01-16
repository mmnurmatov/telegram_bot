package uz.gita.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "question_table")
public class QuestionTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QUESTION_TABLE_SEQUENCE")
    @SequenceGenerator(sequenceName = "QUESTION_TABLE_SEQUENCE", allocationSize = 1, name = "QUESTION_TABLE_SEQUENCE")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "question_txt", length = 100000)
    private String questionTxt;

    @Column(name = "question_html", length = 100000)
    private String questionHtml;

    @Column(name = "question_image_link")
    private String questionImageLink;

    @Column(name = "question_file_link")
    private String questionFileLink;

    @Column(name = "state_question", nullable = false)
    private Long stateQuestion;

    @Column(name = "answer_txt", length = 200000)
    private String answerTxt;

    @Column(name = "answer_html", length = 200000)
    private String answerHtml;

    @Column(name = "answer_image_link")
    private String answerImageLink;

    @Column(name = "answer_video_link")
    private String answerVideoLink;

    @Column(name = "answer_file_link")
    private String answerFileLink;

    @Column(name = "state_answer", nullable = false)
    private Long stateAnswer;

    @Column(name = "hastest", nullable = false)
    private boolean hasTest;

    @Column(name = "test", length = 300000)
    private String test;

    @Column(name = "title")
    private String title;

    @Column(name = "create_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date createDate;

    @Column(name = "visible")
    private boolean visible;

    @Column(name = "parent_id", nullable = false, updatable = false)
    private Long parent;

    @Column(name = "question_id", nullable = false, updatable = false)
    private Long question;
}

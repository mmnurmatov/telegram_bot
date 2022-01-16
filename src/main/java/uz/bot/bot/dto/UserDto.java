package uz.gita.bot.dto;

import java.sql.Timestamp;

/**
 * Created by Bigman on 07.01.2018.
 */
public class UserDto {

    private Long id;
    private Integer user_t_id;
    private String firstName;
    private String lastName;
    private String userName;
    private Timestamp joined_date;
    private Timestamp last_request_date;

    public UserDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUser_t_id() {
        return user_t_id;
    }

    public void setUser_t_id(Integer user_t_id) {
        this.user_t_id = user_t_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getJoined_date() {
        return joined_date;
    }

    public void setJoined_date(Timestamp joined_date) {
        this.joined_date = joined_date;
    }

    public Timestamp getLast_request_date() {
        return last_request_date;
    }

    public void setLast_request_date(Timestamp last_request_date) {
        this.last_request_date = last_request_date;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", user_t_id=" + user_t_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", joined_date=" + joined_date +
                ", last_request_date=" + last_request_date +
                '}';
    }
}

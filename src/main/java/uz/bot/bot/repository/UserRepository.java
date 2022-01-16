package uz.gita.bot.repository;

import uz.gita.bot.db.PostgresSQlConnection;
import uz.gita.bot.dto.UserDto;

import java.sql.*;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public Long create(UserDto userDto) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PostgresSQlConnection m = new PostgresSQlConnection();

        Calendar cal = Calendar.getInstance();
        Timestamp timestamp = new Timestamp(cal.getTimeInMillis());

        try {
            connection = m.getConnection();

            String sql = "INSERT INTO user_table (user_t_id," +
                    "firstName,lastName,userName," +
                    "joined_date,last_request_date," +
                    "visible) values(?,?,?,?,?,?,?) RETURNING ID";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, userDto.getUser_t_id());
            preparedStatement.setString(2, userDto.getFirstName());

            preparedStatement.setString(3, userDto.getLastName());
            preparedStatement.setString(4, userDto.getUserName());
            preparedStatement.setTimestamp(5, timestamp);
            preparedStatement.setTimestamp(6, timestamp);
            preparedStatement.setBoolean(7, true);

            ResultSet rs = preparedStatement.executeQuery();
            rs.next();

            Long uId = rs.getLong(1);

            return uId;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean create_user_request(Long uId, Integer user_t_id, String text) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PostgresSQlConnection m = new PostgresSQlConnection();

        Calendar cal = Calendar.getInstance();
        Timestamp timestamp = new Timestamp(cal.getTimeInMillis());

        try {
            connection = m.getConnection();

            String sql = "INSERT INTO " + TableNames.USER_REQUEST_TABLE + " (user_id,user_t_id,request_text,request_date ) " +
                    " values(?,?,?,?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, uId);
            preparedStatement.setInt(2, user_t_id);
            preparedStatement.setString(3, text);
            preparedStatement.setTimestamp(4, timestamp);


            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean remove(Long uId, Integer user_t_id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PostgresSQlConnection m = new PostgresSQlConnection();

        try {
            connection = m.getConnection();

            String sql = "UPDATE " + TableNames.USER + " SET visible = false WHERE id = ? AND user_t_id = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, uId);
            preparedStatement.setInt(2, user_t_id);

            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public List<UserDto> get_all() {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        PostgresSQlConnection p = new PostgresSQlConnection();

        String sql = "SELECT * FROM  " + TableNames.USER + " WHERE visible = TRUE ";
        try {
            List<UserDto> userDtoList = new LinkedList<UserDto>();

            connection = p.getConnection();
            statement = connection.createStatement();

            result = statement.executeQuery(sql);
            while (result.next()) {
                UserDto dto = new UserDto();

                dto.setId(result.getLong("id"));
                dto.setUser_t_id(result.getInt("user_t_id"));

                dto.setFirstName(result.getString("firstName"));
                dto.setLastName(result.getString("lastName"));
                dto.setUserName(result.getString("userName"));
                dto.setJoined_date(result.getTimestamp("joined_date"));
                dto.setLast_request_date(result.getTimestamp("last_request_date"));
                userDtoList.add(dto);
            }
            return userDtoList;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public Integer get_request_count(String fromDate, String toDate) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        PostgresSQlConnection p = new PostgresSQlConnection();

        String sql = "SELECT count(*) as rCount FROM  " + TableNames.USER_REQUEST_TABLE + " WHERE request_date >= to_timestamp(?, 'YYYY-MM-DD') AND  request_date < to_timestamp(?, 'YYYY-MM-DD') ";
        try {

            connection = p.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, fromDate);
            preparedStatement.setString(2, toDate);

            result = preparedStatement.executeQuery();

            while (result.next()) {

                return result.getInt("rCount");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

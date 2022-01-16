package uz.gita.bot.repository;

import uz.gita.bot.db.PostgresSQlConnection;
import uz.gita.bot.dto.SuggestionDto;

import java.sql.*;

public class SuggestionRepository {
    public Boolean saveSuggestion(SuggestionDto dto) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PostgresSQlConnection m = new PostgresSQlConnection();

        try {
            connection = m.getConnection();
            String sql = "INSERT INTO  " + TableNames.SUGGESTION_TABLE + " (content,user_t_id,date,visible)" +
                    " values(?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, dto.getContent());
            preparedStatement.setLong(2, dto.getUser_t_id());
            preparedStatement.setTimestamp(3, new Timestamp(new java.util.Date().getTime()));
            preparedStatement.setBoolean(4, true);

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

    public String getSuggestionString_fromId(Long fromId) {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        PostgresSQlConnection p = new PostgresSQlConnection();

        String sql = "SELECT * FROM  " + TableNames.SUGGESTION_TABLE + " WHERE visible = TRUE AND id > " + fromId;
        try {

            connection = p.getConnection();
            statement = connection.createStatement();

            result = statement.executeQuery(sql);

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SUGGESTION_LIST\n");
            while (result.next()) {

                SuggestionDto dto = new SuggestionDto();
                // QUESTION DETAIL
                dto.setId(result.getLong("id"));
                dto.setContent(result.getString("content"));
                dto.setUser_t_id(result.getLong("user_t_id"));
                dto.setDate(result.getTimestamp("date"));
                dto.setVisible(result.getBoolean("visible"));

                stringBuilder.append(dto.toString());
            }
            return stringBuilder.toString();
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
        return "SOME_ERROR_IN_SUGGESTION_REPOSITORY";
    }
}

package uz.gita.bot.repository;

import uz.gita.bot.db.PostgresSQlConnection;
import uz.gita.bot.dto.NotificationDto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class NotificationRepository {
    public NotificationDto getNotification() {

        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        PostgresSQlConnection p = new PostgresSQlConnection();

        String sql = "SELECT * FROM  " + TableNames.NOTIFICATION_TABLE + " WHERE visible = TRUE ";
        try {

            connection = p.getConnection();
            statement = connection.createStatement();

            result = statement.executeQuery(sql);
            while (result.next()) {

                NotificationDto dto = new NotificationDto();

                dto.setId(result.getLong("id"));
                dto.setContent(result.getString("content"));
                dto.setC_time(result.getString("c_time"));

                return dto;
            }
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
}

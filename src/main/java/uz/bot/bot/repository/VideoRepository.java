package uz.gita.bot.repository;

import uz.gita.bot.db.PostgresSQlConnection;
import uz.gita.bot.dto.VideoDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class VideoRepository {
    public Boolean add(VideoDTO videoDTO) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PostgresSQlConnection m = new PostgresSQlConnection();

        try {
            connection = m.getConnection();
            String sql = "INSERT INTO " + TableNames.VIDEO_TABLE + " (title,video_link," +
                    "video_order,parent_id,create_date,visible) " +
                    "values(?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, videoDTO.getTitle());
            preparedStatement.setString(2, videoDTO.getVideoLink());

            preparedStatement.setInt(3, videoDTO.getVideoOrder());
            preparedStatement.setInt(4, videoDTO.getParentId());

            preparedStatement.setDate(5, new java.sql.Date(new Date().getTime()));
            preparedStatement.setBoolean(6, true);

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

    public List<VideoDTO> get_video_lesson_by_parent_id(Integer parentId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        PostgresSQlConnection p = new PostgresSQlConnection();

        String sql = "SELECT * FROM  " + TableNames.VIDEO_TABLE + " WHERE parent_id =?  AND visible = TRUE order by video_order ";
        try {

            connection = p.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, parentId);

            result = preparedStatement.executeQuery();
            List<VideoDTO> dtoList = new LinkedList<VideoDTO>();

            while (result.next()) {

                VideoDTO dto = new VideoDTO();
                // QUESTION DETAIL
                dto.setId(result.getLong("id"));
                dto.setTitle(result.getString("title"));
                dto.setVideoLink(result.getString("video_link"));

                dto.setVideoOrder(result.getInt("video_order"));
                dto.setParentId(result.getInt("parent_id"));

                dtoList.add(dto);
            }

            return dtoList;

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

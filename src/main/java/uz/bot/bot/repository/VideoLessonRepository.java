package uz.gita.bot.repository;

import uz.gita.bot.db.PostgresSQlConnection;
import uz.gita.bot.dto.VideoLessonDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class VideoLessonRepository {
    public Boolean add(VideoLessonDto videoLessonDto) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PostgresSQlConnection m = new PostgresSQlConnection();

        try {
            connection = m.getConnection();
            String sql = "INSERT INTO " + TableNames.VIDEO_LESSON_TABLE + " (title,video_link," +
                    "parent_id,question_id,create_date,visible) " +
                    "values(?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, videoLessonDto.getTitle());
            preparedStatement.setString(2, videoLessonDto.getVideoLink());

            preparedStatement.setInt(3, videoLessonDto.getParentId());
            preparedStatement.setInt(4, videoLessonDto.getQuestionId());

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

    public List<VideoLessonDto> get_video_lesson_by_parent_id(Integer parentId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        PostgresSQlConnection p = new PostgresSQlConnection();

        String sql = "SELECT * FROM  " + TableNames.VIDEO_LESSON_TABLE + " WHERE parent_id =?  AND visible = TRUE order by question_id ";
        try {

            connection = p.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, parentId);

            result = preparedStatement.executeQuery();
            List<VideoLessonDto> dtoList = new LinkedList<VideoLessonDto>();
            while (result.next()) {

                VideoLessonDto dto = new VideoLessonDto();
                // QUESTION DETAIL
                dto.setId(result.getLong("id"));
                dto.setTitle(result.getString("title"));
                dto.setVideoLink(result.getString("video_link"));

                dto.setParentId(result.getInt("parent_id"));
                dto.setQuestionId(result.getInt("question_id"));

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

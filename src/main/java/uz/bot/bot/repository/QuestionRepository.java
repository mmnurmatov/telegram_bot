package uz.gita.bot.repository;

import uz.gita.bot.db.PostgresSQlConnection;
import uz.gita.bot.dto.QuestionDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class QuestionRepository {
    public Integer saveQuestion(QuestionDto questionDto) {
        System.out.println(" START SAVE QUESTION ");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PostgresSQlConnection m = new PostgresSQlConnection();

        try {
            connection = m.getConnection();
            String sql = "INSERT INTO " + TableNames.QUESTION_TABLE + " (parent_id,question_id," +
                    "question_txt,question_html,question_image_link,question_file_link,state_question," +
                    "answer_txt,answer_html,answer_image_link,answer_video_link,answer_file_link,state_answer," +
                    "hasTest, test, " +
                    "title,create_date,visible)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) RETURNING ID";
            preparedStatement = connection.prepareStatement(sql);
            // QUESTiON DETAIL
            preparedStatement.setInt(1, questionDto.getParentId());
            preparedStatement.setInt(2, questionDto.getQuestionId());
            // QUESTION
            preparedStatement.setString(3, questionDto.getQuestionContentText());
            preparedStatement.setString(4, questionDto.getQuestionContentHtml());
            preparedStatement.setString(5, questionDto.getQuestionImageLink());
            preparedStatement.setString(6, questionDto.getQuestionFileLink());
            preparedStatement.setInt(7, questionDto.getQuestionState());
            // ANSWER
            preparedStatement.setString(8, questionDto.getAnswerContentText());
            preparedStatement.setString(9, questionDto.getAnswerContentHtml());
            preparedStatement.setString(10, questionDto.getAnswerImageLink());
            preparedStatement.setString(11, questionDto.getAnswerVideoLink());
            preparedStatement.setString(12, questionDto.getAnswerFileLink());
            preparedStatement.setInt(13, questionDto.getAnswerState());
            // TEST
            preparedStatement.setBoolean(14, questionDto.getHasTest());
            preparedStatement.setString(15, questionDto.getTest());
            // ***
            preparedStatement.setString(16, questionDto.getTitle());
            preparedStatement.setDate(17, new java.sql.Date(new Date().getTime()));
            preparedStatement.setBoolean(18, true);

            ResultSet rs = preparedStatement.executeQuery();
            rs.next();

            Integer uId = rs.getInt(1);
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

    public List<QuestionDto> get_question_list_by_parentID(Integer parentId) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        PostgresSQlConnection p = new PostgresSQlConnection();

        String sql = "SELECT * FROM  " + TableNames.QUESTION_TABLE + " WHERE parent_id =?  AND visible = TRUE order by question_id ";
        try {

            connection = p.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, parentId);

            result = preparedStatement.executeQuery();
            List<QuestionDto> dtoList = new LinkedList<QuestionDto>();
            while (result.next()) {

                QuestionDto dto = new QuestionDto();
                // QUESTION DETAIL
                dto.setId(result.getLong("id"));
                dto.setParentId(result.getInt("parent_id"));
                dto.setQuestionId(result.getInt("question_id"));
                // QUESTION
                dto.setQuestionContentText(result.getString("question_txt"));
                dto.setQuestionContentHtml(result.getString("question_html"));
                dto.setQuestionImageLink(result.getString("question_image_link"));
                dto.setQuestionFileLink(result.getString("question_file_link"));
                dto.setQuestionState(result.getInt("state_question"));
                // ANSWER
                dto.setAnswerContentText(result.getString("answer_txt"));
                dto.setAnswerContentHtml(result.getString("answer_html"));
                dto.setAnswerImageLink(result.getString("answer_image_link"));
                dto.setAnswerVideoLink(result.getString("answer_video_link"));
                dto.setAnswerFileLink(result.getString("answer_file_link"));
                dto.setAnswerState(result.getInt("state_answer"));
                // TEST
                dto.setHasTest(result.getBoolean("hasTest"));
                dto.setTest(result.getString("test"));
                // TITLE
                dto.setTitle(result.getString("title"));

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

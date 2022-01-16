package uz.gita.bot.question_module._MATRIX_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 10.02.2018.
 */
public class _001_Question {

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        matrix[2] = new int[]{7, 8, 9};

        // matrix[][] matrix berilgan
        // shu matriz ni ekranga chiqaradigan dastur yozing

        new _001_Question().printMatrix(matrix);
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(1); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.MATRIX); //< QUESTION PARENT

        question.setQuestionContentHtml(" matrix[][] matrix berilgan\n" +
                "shu matriz ni ekranga chiqaradigan dastur yozing \n\n" +
                "<code>public void printMatrix(int[][] matrix) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("matrix ekran ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  public void printMatrix(int[][] matrix) {\n" +
                "        for (int i = 0; i &lt; matrix.length; i++) {\n" +
                "            for (int j = 0; j &lt; matrix[i].length; j++) {\n" +
                "                System.out.print(matrix[i][j] + \"  \");\n" +
                "            }\n" +
                "            System.out.println();\n" +
                "        }\n" +
                "    }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);

        return question;
    }
}

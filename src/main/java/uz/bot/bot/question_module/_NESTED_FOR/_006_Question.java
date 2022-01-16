package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _006_Question {

    public void doIt() {
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.printf("%d\t", count);
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // geometrik shakilni ekranga chiqaring
        /*

          0  1  2  3  4  5  6  7  8  9
          10 11 12 13 14 15 16 17 18 19
          20 ........                29
          .
          .
          .
          90 91 92 93 94 95 96 97 98 99

        * */
        new _006_Question().doIt();
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(6); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("Geometrik shakilni ekranga chiqaring\n" +
                " 0  1  2  3  4  5  6  7  8  9\n" +
                " 10 11 12 13 14 15 16 17 18 19\n" +
                " 20 ........                29\n" +
                " .\n" +
                " .\n" +
                " .\n" +
                " 90 91 92 93 94 95 96 97 98 99 \n\n" +
                "<code>   public void doIt() {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>   " +
                "public void doIt() {\n" +
                "    int count = 0;\n" +
                "    for (int i = 0; i &lt;= 9; i++) {\n" +
                "       for (int j = 0; j &lt;= 9; j++) {\n" +
                "          System.out.printf(\n" +
                "              \"%d\\t\", count);\n" +
                "           count++;\n" +
                "       }\n" +
                "      System.out.println();\n" +
                "   }\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);
        question.setAnswerVideoLink("BAADAgADowEAAt2NUEiJmQWZF6NiRwI");
        return question;
    }
}

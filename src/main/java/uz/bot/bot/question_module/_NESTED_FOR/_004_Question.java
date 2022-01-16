package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _004_Question {

    public void doIt() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == 0 || i == 9 || j == 0) {
                    System.out.print("(" + i + "," + j + ") ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // geometrik shakilni ekranga chiqaring
        /*

         (0,0) (0,1) (0,2) ........... (0,9)
         (1,0)
         (2,0)
         (3,0)
         (4,0)
         .
         .
         (9,0) (9,1) (9,2) ........... (9,9)

        * */
        new _004_Question().doIt();
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(4); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("Geometrik shakilni ekranga chiqaring\n" +
                "  (0,0) (0,1) (0,2) ........... (0,9)\n" +
                "  (1,0)\n" +
                "  (2,0)\n" +
                "  (3,0)\n" +
                "  (4,0)\n" +
                "   ...\n" +
                "   ...\n" +
                "  (9,0) (9,1) (9,2) ........... (9,9) \n\n" +
                "<code>   public void doIt() {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public void doIt(){\n " +
                "   for (int i = 0; i &lt;= 9; i++) {\n" +
                "       for (int j = 0; j &lt;= 9; j++) {\n" +
                "           if (i == 0 ||\n" +
                "               i == 9 ||\n " +
                "               j == 0) {\n" +
                "        System.out.print(\n" +
                "           \"(\" + i + \",\" + j + \") \");\n" +
                "           }\n" +
                "      }\n" +
                "       System.out.println();\n" +
                "  }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);
        question.setAnswerVideoLink("BAADAgAD_wEAAmhmUEhvQg9wgMk6ugI");
        return question;
    }
}

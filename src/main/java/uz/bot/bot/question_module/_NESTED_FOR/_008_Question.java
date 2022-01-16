package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _008_Question {

    public void doIt(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j) {
                    System.out.print("(" + i + "," + j + ") ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // n soni berilgan
        // geometrik shakilni ekranga chiqaring
        /*

         (0,0)
             (1,1)
                 (2,2)
                     (3,3)
                         (4,4)
                             .
                               .
                                (n,n)

        * */
        new _008_Question().doIt(5);
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(8); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Geometrik shakilni ekranga chiqaring \n\n" +
                "(0,0)\n" +
                "    (1,1)\n" +
                "        (2,2)\n" +
                "            (3,3)\n" +
                "                (4,4)\n" +
                "                    .\n" +
                "                      .\n" +
                "                       (n,n) \n\n" +
                "Malasan: n = 5 \n" +
                "(0,0)                     \n" +
                "    (1,1)                 \n" +
                "        (2,2)             \n" +
                "            (3,3)         \n" +
                "                (4,4)     \n" +
                "                    (5,5)\n" +
                "<code>   public void doIt(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public void doIt(int n) {\n" +
                "   for (int i = 0; i &lt;= n; i++) {\n" +
                "       for (int j = 0; j &lt;= n; j++) {\n" +
                "           if (i == j) {\n" +
                "        System.out.print(\"(\" + i + \",\" + j + \") \");\n" +
                "           } else {\n" +
                "           System.out.print(\"    \");\n" +
                "           }\n" +
                "       }\n" +
                "      System.out.println();\n" +
                "   }\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);
        question.setAnswerVideoLink("BAADAgADpQEAAt2NUEhTuFb1y-aHVwI");
        return question;
    }
}

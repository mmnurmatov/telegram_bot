package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 28.01.2018.
 */
public class _030_Question {

    public void doIt(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            for (int k = 1; k < i * 2 + 1; k++) {
                System.out.print(" ");
            }

            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = (2 * i); k < (2 * n - 2); k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

    public static void main(String[] args) {
        // n soni berilgan
        // geometrik shakilni ekranga chiqaring
        // 2*n buyerda qatorlar soni (row number)
        /*

           *********
           **** ****
           ***   ***
           **     **
           *       *
           *       *
           **     **
           ***   ***
           **** ****
           *********

         */


        // LOOK IT IN EXPLANATION
        //http://codeforwin.org/2015/07/c-program-to-print-diamond-star-pattern.html

        new _030_Question().doIt(5);
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(30); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Geometrik shakilni ekranga chiqaring.\n" +
                "2*n buyerda qatorlar soni (row number)\n" +
                "Masalan: n = 5; \n\n" +
                " *********\n" +
                " ****  ****\n" +
                " ***      ***\n" +
                " **          **\n" +
                " *               *\n" +
                " *               *\n" +
                " **           **\n" +
                " ***      ***\n" +
                " ****  ****\n" +
                " *********\n\n" +
                "<code>   public void doIt(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public void doIt(int n) {\n" +
                "  for (int i = 0; i &lt; n; i++) {\n" +
                "    for (int j = i; j &lt; n; j++) {\n" +
                "         System.out.print(\"*\");\n" +
                "    }\n" +
                "    for (int k = 1; k &lt; i * 2 + 1; k++) {\n" +
                "         System.out.print(\" \");\n" +
                "    }\n" +
                "   for (int j = i; j &lt; n; j++) {\n" +
                "         System.out.print(\"*\");\n" +
                "   }\n" +
                "   System.out.println();\n" +
                "  }\n" +
                "\n" +
                "  for (int i = 0; i &lt; n; i++) {\n" +
                "    for (int j = 0; j &lt;= i; j++) {\n" +
                "        System.out.print(\"*\");\n" +
                "    }\n" +
                "   for (int k = (2 * i); k &lt; (2 * n - 2); k++) {\n" +
                "        System.out.print(\" \");\n" +
                "    }\n" +
                "   for (int j = 0; j &lt;= i; j++) {\n" +
                "       System.out.print(\"*\");\n" +
                "   }\n" +
                "\n" +
                "       System.out.println();\n" +
                "   }\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);

        return question;
    }

}

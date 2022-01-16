package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 28.01.2018.
 */
public class _031_Question {

    public void doIt(int n) {
        for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2) {
                System.out.printf(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.printf(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }

            System.out.println(" ");
        }

        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.printf(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // n soni berilgan
        // geometrik shakilni ekranga chiqaring
        // (2 * n - 1),  buyerda eng uzun yulduzlar soni teng (row number)
        /*

              *****     *****
             *******   *******
            ********* *********
            *******************
             *****************
              ***************
               *************
                ***********
                 *********
                  *******
                   *****
                    ***
                     *
         */
        new _031_Question().doIt(6);
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(31); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml(" n soni berilgan.\n" +
                "Geometrik shakilni ekranga chiqaring.\n" +
                "(2 * n - 1)  buyerda eng uzun yulduzlar. \n" +
                "soni teng (row number)\n" +
                "Masalan n = 5; \n\n" +
                "     *****      *****\n" +
                "   *******    *******\n" +
                "********* *********\n" +
                "*******************\n" +
                "  *****************\n" +
                "     ***************\n" +
                "       *************\n" +
                "         ***********\n" +
                "           *********\n" +
                "            *******\n" +
                "              *****\n" +
                "               ***\n" +
                "                  *\n\n" +
                "<code>   public void doIt(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public void doIt(int n) {\n" +
                "  for (int i = n / 2; i &lt;= n; i += 2) {\n" +
                "    for (int j = 1; j &lt; n - i; j += 2) {\n" +
                "       System.out.printf(\" \");\n" +
                "    }\n" +
                "\n" +
                "    for (int j = 1; j &lt;= i; j++) {\n" +
                "        System.out.printf(\"*\");\n" +
                "    }\n" +
                "\n" +
                "    for (int j = 1; j &lt;= n - i; j++) {\n" +
                "        System.out.printf(\" \");\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    for (int j = 1; j &lt;= i; j++) {\n" +
                "        System.out.printf(\"*\");\n" +
                "    }\n" +
                "\n" +
                "        System.out.println(\" \");\n" +
                "    }\n" +
                "\n" +
                "   for (int i = n; i &gt;= 1; i--) {\n" +
                "      for (int j = i; j < n; j++) {\n" +
                "         System.out.printf(\" \");\n" +
                "    }\n" +
                "\n" +
                "   for (int j = 1; j &lt;= (i * 2) - 1; j++) {\n" +
                "          System.out.printf(\"*\");\n" +
                "   }\n" +
                "\n" +
                "          System.out.println();\n" +
                "  }\n" +
                "}</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);

        return question;
    }

}

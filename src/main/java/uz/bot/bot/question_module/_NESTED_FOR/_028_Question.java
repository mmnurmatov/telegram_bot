package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 28.01.2018.
 */
public class _028_Question {

    public void doIt(int n) {
        int column = 1;
        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < n - column; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }

            if (i < n - 1) {
                column++;
            } else {
                column--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // n soni berilgan
        // geometrik shakilni ekranga chiqaring
        // n buyerrda eng uzun yulduzlar soni (row number)
        /*

              *
             **
            ***
           ****
          *****
           ****
            ***
             **
              *


         */

        new _028_Question().doIt(5);
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(28); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml(" n soni berilgan.\n" +
                "Geometrik shakilni ekranga chiqaring\n" +
                "n buyerrda eng uzun yulduzlar soni (row number)\n" +
                "Masalan: n = 5; \n\n" +
                "     *\n" +
                "    **\n" +
                "   ***\n" +
                "  ****\n" +
                " *****\n" +
                "  ****\n" +
                "   ***\n" +
                "    **\n" +
                "     *\n\n" +
                "<code>   public void doIt(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public void doIt(int n) {\n" +
                "   int column = 1;\n" +
                "   for (int i = 0; i &lt; 2 * n - 1; i++) {\n" +
                "     for (int j = 0; j &lt; n - column; j++) {\n" +
                "           System.out.print(\" \");\n" +
                "      }\n" +
                "      for (int j = 0; j &lt; column; j++) {\n" +
                "         System.out.print(\"*\");\n" +
                "      }\n" +
                "      if (i &lt; n - 1) {\n" +
                "          column++;\n" +
                "      } else {\n" +
                "          column--;\n" +
                "      }\n" +
                "      System.out.println();\n" +
                "   }\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);

        return question;
    }

}

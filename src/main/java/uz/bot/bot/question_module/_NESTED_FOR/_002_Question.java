package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _002_Question {

    public void doIt(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // n soni berilgan
        // geometrik shakilni ekranga chiqaring
        //
        /*
         Masalan: n = 5

         *****
         *****
         *****
         *****
         *****

         Masalan = 3

         ***
         ***
         ***

        * */

        new _002_Question().doIt(5);
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(2); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Geometrik shakilni ekranga chiqaring.\n\n" +
                "Masalan: n = 5\n" +
                " *****\n" +
                " *****\n" +
                " *****\n" +
                " *****\n" +
                " *****\n" +
                "\n" +
                "Masalan: = 3\n" +
                " ***\n" +
                " ***\n" +
                " ***\n\n" +
                "<code>   public void doIt(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public void doIt(int n) {\n" +
                "   for (int i = 0; i &lt; n; i++) {\n" +
                "      for (int j = 0; j &lt; n; j++) {\n" +
                "          System.out.print(\"*\");\n" +
                "         }\n" +
                "      System.out.println();\n" +
                "    }\n" +
                "  }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);
        question.setAnswerVideoLink("BAADAgADogEAAt2NUEgkmvWXoHHxjwI");
        return question;
    }
}

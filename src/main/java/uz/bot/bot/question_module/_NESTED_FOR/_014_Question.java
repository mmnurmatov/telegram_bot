package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _014_Question {

    public void doIt(int n) {
        for (int i = 0; i < n; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // n soni berilgan
        // geometrik shakilni ekranga chiqaring
        // n nechta bo'lsa bo'yiga  chigadigan yuldizchalar soni ham shuncha bo'lishi kerak
        /*

            *****
             *****
              *****
               *****
                *****
        * */
        new _014_Question().doIt(5);
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(14); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Geometrik shakilni ekranga chiqaring.\n" +
                "Masalan: n = 5; \n\n" +
                " *****\n" +
                "  *****\n" +
                "   *****\n" +
                "    *****\n" +
                "     *****\n\n" +
                "<code>   public void doIt(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public void doIt(int n) {\n" +
                "   for (int i = 0; i &lt; n; i++) {\n" +
                "       for (int k = 0; k &lt; i; k++) {\n" +
                "           System.out.print(\" \");\n" +
                "       }\n" +
                "      for (int j = 0; j &lt; n; j++) {\n" +
                "          System.out.print(\"*\");\n" +
                "      }\n" +
                "       System.out.println();\n" +
                "   }\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);
        question.setAnswerVideoLink("BAADAgADpgEAAt2NUEgb73UayJi06QI");
        return question;
    }
}

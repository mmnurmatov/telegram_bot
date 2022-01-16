package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _012_Question {

    public void doIt(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print(j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // n soni berilgan
        // geometrik shakilni ekranga chiqaring
        // n nechta bo'lsa bo'yiga  chigadigan yuldizchalar soni ham shuncha bo'lishi kerak
        /*

       1
       12
       123
       1234
       12345
        * */

        new _012_Question().doIt(5);
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(12); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Geometrik shakilni ekranga chiqaring.\n" +
                "Masalan: n = 5; \n\n" +
                " 1\n" +
                " 12\n" +
                " 123\n" +
                " 1234\n" +
                " 12345 \n\n" +
                "<code>   public void doIt(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("geometrik shakl ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>   " +
                "public void doIt(int n) {\n" +
                "   for (int i = 0; i &lt; n; i++) {\n" +
                "       for (int j = 0; j &lt; n; j++) {\n" +
                "           if (i &gt;= j) {\n" +
                "               System.out.print(j + 1);\n" +
                "           } else {\n" +
                "              System.out.print(\" \");\n" +
                "           }\n" +
                "       }\n" +
                "       System.out.println();\n" +
                "    }\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);
        question.setAnswerVideoLink("BAADAgADBAIAAmhmUEi93EyxmMDOTAI");
        return question;
    }


}

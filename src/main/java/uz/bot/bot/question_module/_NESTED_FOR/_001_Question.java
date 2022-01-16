package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _001_Question {

    public void sum(int n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1 / i;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        // n ,soni berilgan
        // quyidagi yig'indini hisoblovchi dastur yozing.
        // (1 + 1/2 + 1/3 + 1/4 ..... 1/n).

        new _001_Question().sum(5);
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(1); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Quyidagi yig'indini hisoblovchi dastur yozing.\n" +
                " (1 + 1/2 + 1/3 + 1/4 ..... 1/n ).\n\n" +
                "<code>  public void sum(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("son yasash ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public void sum(int n) {\n" +
                "    double sum = 0;\n" +
                "    for (double i = 1; i &lt;= n; i++) {\n" +
                "          sum += 1 / i;\n" +
                "      }\n" +
                "   System.out.println(sum);\n" +
                "    }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);
        question.setAnswerVideoLink("");
        question.setAnswerVideoLink("BAADAgADrAIAAixzYEjetzRgUPSsHAI");
        return question;
    }

}

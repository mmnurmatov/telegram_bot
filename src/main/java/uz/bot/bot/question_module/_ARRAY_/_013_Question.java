package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _013_Question {

    public void count(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("array[" + i + "]: " + array[i] + " =  array[" + j + "]: " + array[j]);
                }
            }
        }

    }

    public static void main(String[] args) {
        // n, array[] berilgan
        // shu arraydadi o'xshash elementlarni ekranga chiqaring
        new _013_Question().count(new int[]{1, 2, 1, 4, 6, 1, 2, 7, 1, 3, 5, 1});
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(13); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml(" array[] berilgan.\n" +
                "shu arraydagi o'xshash elementlarni ekranga chiqaring.\n" +
                "Namuna: [1,2,1,4]\n" +
                "Natija: \n" +
                "array[0]: 1 = array[2] : 1\n" +
                "array[2]: 1 = array[0] : 1\n\n " +
                "<code>public void count(int array[]) {\n" +
                "\n" +
                "    }</code>");
        question.setTitle(" son ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>" +
                "public void count(int array[]) {\n" +
                "    for (int i = 0; i &lt; array.length; i++) {\n" +
                "      for (int j = i + 1; j &lt; array.length; j++) {\n" +
                "           if (array[i] == array[j]) {\n" +
                "            System.out.println(\"array[\" + i + \"]: \n" +
                "                           \" + array[i] + \" =  \n" +
                "                          array[\" + j + \"]:\n" +
                "                           \" + array[j]);\n" +
                "            }\n" +
                "       }\n" +
                "    }\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);

        return question;
    }
}

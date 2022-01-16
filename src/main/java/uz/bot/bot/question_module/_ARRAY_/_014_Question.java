package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _014_Question {

    public void count(int array1[], int array2[]) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("array1[" + i + "] : " + array1[i] + " =  array2 [" + j + "] : " + array2[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        // int array1[], int array2[] berilgan
        // shu ikkita arraydagi  o'xshash elementlarni ekranga chiqaring
        new _014_Question().count(new int[]{2, 3, 4, 5}, new int[]{2, 3, 6, 2, 1, 5, 8, 3});
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(14); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("int array1[], int array2[] berilgan.\n" +
                "Shu ikkita arraydagi  o'xshash elementlarni ekranga chiqaring.\n" +
                "Namuna:  \n" +
                "array1{1,2,3} , array2{1,4,1,2} \n" +
                "Natija: \n" +
                "array1[0]: 1 = array2[0] \n" +
                "array1[0]: 1 = array2[2] \n" +
                "array1[1]: 2 = array2[3] \n\n" +
                "<code>public void count(int array1[], int array2[]) {\n" +
                "        \n" +
                "  }</code>");
        question.setTitle(" son ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>" +
                "public void count(int array1[], int array2[]) {\n" +
                "  for (int i = 0; i &lt; array1.length; i++) {\n" +
                "    for (int j = 0; j &lt; array2.length; j++) {\n" +
                "      if (array1[i] == array2[j]) {\n" +
                "        System.out.println(\"array1[\" + i + \"] \n" +
                "                           : \" + array1[i] + \" =\n" +
                "                             array2 [\" + j + \"] : \"\n" +
                "                             + array2[j]);\n" +
                "        }\n" +
                "     }\n" +
                "  }\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);

        return question;
    }
}

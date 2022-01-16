package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

import java.util.Arrays;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _016_Question {

    public void remove(int array[]) {
        int temp[] = new int[array.length];
        int dup_count = 0;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    temp[j] = temp[j] + 1;
                    dup_count++;
                }
            }
        }

//        System.out.println(dup_count);
//        System.out.println(Arrays.toString(temp));
//        System.out.println(Arrays.toString(array));

        int mas[] = new int[array.length - dup_count];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (temp[i] == 0) {
                mas[count] = array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    public static void main(String[] args) {
        // int array1[]
        // shu arraydagi o'xshash elementlarni olib tashang
        // 15 misolga o'xshamagan usulda
        new _016_Question().remove(new int[]{2, 3, 6, 2, 1, 3, 1, 4});
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(16); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("int array1[] berilgan.\n" +
                "Shu arraydagi o'xshash elementlarni olib tashang.\n" +
                "15 chi misolga o'xshamagan usulda.\n" +
                "Namuna: [1,2,3,4,3,2]\n" +
                "Natija: [1,2,3,4]\n\n" +
                "<code>public void remove(int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("o'xshash elementlar ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>\n" +
                "public void remove(int array[]) {\n" +
                "  int temp[] = new int[array.length];\n" +
                "  int dup_count = 0;\n" +
                "  System.out.println(Arrays.toString(array));\n" +
                "   for (int i = 0; i &lt; array.length; i++) {\n" +
                "    for (int j = i + 1; j &lt; array.length; j++) {\n" +
                "        if (array[i] == array[j]) {\n" +
                "            temp[j] = temp[j] + 1;\n" +
                "            dup_count++;\n" +
                "          }\n" +
                "      }\n" +
                "    }\n" +
                "//        System.out.println(dup_count);\n" +
                "//        System.out.println(Arrays.toString(temp));\n" +
                "//        System.out.println(Arrays.toString(array));\n" +
                "  int mas[] = new int[array.length - dup_count];\n" +
                "  int count = 0;\n" +
                "  for (int i = 0; i &lt; array.length; i++) {\n" +
                "     if (temp[i] == 0) {\n" +
                "         mas[count] = array[i];\n" +
                "         count++;\n" +
                "      }\n" +
                "   }\n" +
                "  System.out.println(Arrays.toString(mas));\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);

        return question;
    }

}

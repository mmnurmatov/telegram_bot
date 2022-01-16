package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

import java.util.Arrays;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _017_Question {

    public int[] sortByIncreasing(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1[] = sortByIncreasing(new int[]{1, 2, 1, 6, 22, 8, 1});
        s += "Test 1  ({1, 2, 1, 6, 22, 8, 1})  Kelgan javob  ";
        if (r_1 != null && r_1.length == 7 && r_1[0] == 1 &&
                r_1[1] == 1 && r_1[2] == 1 && r_1[3] == 2 && r_1[6] == 22) {
            s += " '" + Arrays.toString(r_1) + "' " + "  To'g'ri";
        } else {
            s += Arrays.toString(r_1) + "   Xato ";
            return s;
        }

        int r_2[] = sortByIncreasing(new int[]{44, 1, 8});
        s += "\nTest 2  ({44, 1, 8}) .  Kelgan javob ";
        if (r_2 != null && r_2.length == 3 && r_2[0] == 1 && r_2[1] == 8 && r_2[2] == 44) {
            s += " '" + Arrays.toString(r_2) + "' " + "  To'g'ri";
        } else {
            s += Arrays.toString(r_2) + "   Xato ";
            return s;
        }

        int r_3[] = sortByIncreasing(new int[]{4, 2, 5, 7, 2, 8, 2, 14, 8, 2});
        s += "\nTest 3  ({4, 2, 5, 7, 2, 8, 2, 14, 8, 2}).  Kelgan javob ";
        if (r_3 != null && r_3.length == 10 && r_3[0] == 2 && r_3[1] == 2 && r_3[3] == 2 && r_3[6] == 7 && r_3[8] == 8 && r_3[9] == 14) {
            s += " '" + Arrays.toString(r_3) + "' " + "  To'g'ri";
        } else {
            s += Arrays.toString(r_3) + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        //  array[] berilgan
        // shu massivni  elementlarini o'sish tartibida jo'ylashtiring (sort by increasing (ascending) )  qiling
        //
        System.out.println(new _017_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(17); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("int array[] berilgan.\n" +
                "Shu massivni  elementlarini o'sish tartibida jo'ylashtiring\n" +
                " (sort by increasing (ascending) )\n " +
                " va hosil bo'lgan massivni ni return qiling\n" +
                "Namuna: [2,4,1,5]\n" +
                "Natija: [1,2,4,5]\n\n" +
                "<code>public int[] sortByIncreasing(int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle(" o'sish tartibi ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int[] sortByIncreasing(int array[]) {\n" +
                "  for (int i = 0; i &lt; array.length; i++) {\n" +
                "    for (int j = i + 1; j &lt; array.length; j++) {\n" +
                "          if (array[i] &gt; array[j]) {\n" +
                "               int temp = array[i];\n" +
                "               array[i] = array[j];\n" +
                "               array[j] = temp;\n" +
                "          }\n" +
                "     }\n" +
                "  }\n" +
                "  return array;\n" +
                "}</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("import java.util.Arrays;\n" +
                "public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1[] = sortByIncreasing(new int[]{1, 2, 1, 6, 22, 8, 1});\n" +
                "        s += \"Test 1  ({1, 2, 1, 6, 22, 8, 1})  Kelgan javob  \";\n" +
                "        if (r_1 != null && r_1.length == 7 && r_1[0] == 1 &&\n" +
                "                r_1[1] == 1 && r_1[2] == 1 && r_1[3] == 2 && r_1[6] == 22) {\n" +
                "            s += \" '\" + Arrays.toString(r_1) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += Arrays.toString(r_1) + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2[] = sortByIncreasing(new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  ({44, 1, 8}) .  Kelgan javob \";\n" +
                "        if (r_2 != null && r_2.length == 3 && r_2[0] == 1 && r_2[1] == 8 && r_2[2] == 44) {\n" +
                "            s += \" '\" + Arrays.toString(r_2) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += Arrays.toString(r_2) + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3[] = sortByIncreasing(new int[]{4, 2, 5, 7, 2, 8, 2, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  ({4, 2, 5, 7, 2, 8, 2, 14, 8, 2}).  Kelgan javob \";\n" +
                "        if (r_3 != null && r_3.length == 10 && r_3[0] == 2 && r_3[1] == 2 && r_3[3] == 2 && r_3[6] == 7 && r_3[8] == 8 && r_3[9] == 14) {\n" +
                "            s += \" '\" + Arrays.toString(r_3) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += Arrays.toString(r_3) + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "    }}");
        return question;
    }
}

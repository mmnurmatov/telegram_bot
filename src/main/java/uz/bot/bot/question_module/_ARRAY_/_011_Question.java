package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

import java.util.Arrays;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _011_Question {

    public int[] reverse(int array[]) {
        int mas[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            mas[array.length - 1 - i] = array[i];
        }

        return mas;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int[] r_1 = reverse(new int[]{4, 2, 0, 6, 22, 8, 1});
        s += "Test 1  ({4, 2, 0, 6, 22, 8, 1})  Kelgan javob  ";
        if (r_1 != null && r_1.length == 7 && r_1[0] == 1 && r_1[1] == 8 && r_1[6] == 4) {
            s += " '" + Arrays.toString(r_1) + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int[] r_2 = reverse(new int[]{44, 1, 8});
        s += "\nTest 2  ({44, 1, 8}) .  Kelgan javob ";
        if (r_2 != null && r_2.length == 3 && r_2[0] == 8 && r_2[1] == 1 && r_2[2] == 44) {
            s += " '" + Arrays.toString(r_2) + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int[] r_3 = reverse(new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});
        s += "\nTest 3  ({4, 2, 5, 7, -1, 8, 12, 14, 8, 2}).  Kelgan javob ";
        if (r_3 != null && r_3.length == 10 && r_3[0] == 2 && r_3[1] == 8 && r_3[8] == 2 && r_3[9] == 4) {
            s += " '" + Arrays.toString(r_3) + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int[] r_4 = reverse(new int[]{33, 2, 1, 5, 7});
        s += "\nTest 4  ({33, 2, 1, 5, 7}).  Kelgan javob ";
        if (r_4 != null && r_4.length == 5 && r_4[0] == 7 && r_4[1] == 5 && r_4[4] == 33) {
            s += " '" + Arrays.toString(r_4) + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // n, array[] berilgan
        // Shu massivni teskarisini jo'nating
        // masalan [1,2,3,4]  bo'lsa  [4,3,2,1] kelishi kerak
        System.out.println(new _011_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(11); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("array[] berilgan.\n" +
                "Shu massivni teskarisini jo'nating.\n" +
                "masalan: [1,2,3,4]  bo'lsa  [4,3,2,1] kelishi kerak.\n\n" +
                "<code>public int[] reverse(int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle(" elementni olib tashlash ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>\n" +
                "public int[] reverse(int array[]) {\n" +
                "   int mas[] = new int[array.length];\n" +
                "   for (int i = 0; i &lt; array.length; i++) {\n" +
                "      mas[array.length - 1 - i] = array[i];\n" +
                "    }\n" +
                "      return mas;\n" +
                " }</code>");

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
                "        int[] r_1 = reverse(new int[]{4, 2, 0, 6, 22, 8, 1});\n" +
                "        s += \"Test 1  ({4, 2, 0, 6, 22, 8, 1})  Kelgan javob  \";\n" +
                "        if (r_1 != null && r_1.length == 7 && r_1[0] == 1 && r_1[1] == 8 && r_1[6] == 4) {\n" +
                "            s += \" '\" + Arrays.toString(r_1) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int[] r_2 = reverse(new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  ({44, 1, 8}) .  Kelgan javob \";\n" +
                "        if (r_2 != null && r_2.length == 3 && r_2[0] == 8 && r_2[1] == 1 && r_2[2] == 44) {\n" +
                "            s += \" '\" + Arrays.toString(r_2) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int[] r_3 = reverse(new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  ({4, 2, 5, 7, -1, 8, 12, 14, 8, 2}).  Kelgan javob \";\n" +
                "        if (r_3 != null && r_3.length == 10 && r_3[0] == 2 && r_3[1] == 8 && r_3[8] == 2 && r_3[9] == 4) {\n" +
                "            s += \" '\" + Arrays.toString(r_3) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int[] r_4 = reverse(new int[]{33, 2, 1, 5, 7});\n" +
                "        s += \"\\nTest 4  ({33, 2, 1, 5, 7}).  Kelgan javob \";\n" +
                "        if (r_4 != null && r_4.length == 5 && r_4[0] == 7 && r_4[1] == 5 && r_4[4] == 33) {\n" +
                "            s += \" '\" + Arrays.toString(r_4) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "    }}");
        return question;
    }
}

package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

import java.util.Arrays;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _010_Question {

    public int[] removeElement(int n, int array[]) {
        int[] mas = new int[array.length - 1];
        int subIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (i == n) {
                subIndex++;
            }
            mas[i] = array[subIndex];
            subIndex++;
        }

        return mas;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int[] r_1 = removeElement(2, new int[]{4, 2, 0, 6, 22, 8, 1});
        s += "Test 1  (2,{4, 2, 0, 6, 22, 8, 1})  Kelgan javob  ";
        if (r_1 != null && r_1.length == 6 && r_1[2] == 6) {
            s += " '" + Arrays.toString(r_1) + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int[] r_2 = removeElement(0, new int[]{44, 1, 8});
        s += "\nTest 2  (0,{44, 1, 8}) .  Kelgan javob ";
        if (r_2 != null && r_2.length == 2 && r_2[0] == 1) {
            s += " '" + Arrays.toString(r_2) + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int[] r_3 = removeElement(6, new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});
        s += "\nTest 3  (6,{4, 2, 5, 7, -1, 8, 12, 14, 8, 2}).  Kelgan javob ";
        if (r_3 != null && r_3.length == 9 && r_3[6] == 14) {
            s += " '" + Arrays.toString(r_3) + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int[] r_4 = removeElement(4, new int[]{33, 2, 1, 5, 7});
        s += "\nTest 4  (4,{33, 2, 1, 5, 7}).  Kelgan javob ";
        if (r_4 != null && r_4.length == 4 && r_4[3] == 5) {
            s += " '" + Arrays.toString(r_4) + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // n, array[] berilgan
        // shu massivning n chi indexsini olib tashang
        // agar  n index mos
        System.out.println(new _010_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(10); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("n, array[] berilgan.\n" +
                "Shu massivning n chi indexsini olib tashang.\n" +
                "<code>public int[] removeElement(int n, int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle(" elementni olib tashlash ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>" +
                "public int[] removeElement(int n, int array[]) {\n" +
                "   int[] mas = new int[array.length - 1];\n" +
                "   int subIndex = 0;\n" +
                "  for (int i = 0; i &lt; array.length-1; i++) {\n" +
                "      if (i == n) {\n" +
                "         subIndex++;\n" +
                "      }\n" +
                "      mas[i] = array[subIndex];\n" +
                "      subIndex++;\n" +
                "   }\n" +
                "  return mas;\n" +
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
                "        int[] r_1 = removeElement(2, new int[]{4, 2, 0, 6, 22, 8, 1});\n" +
                "        s += \"Test 1  (2,{4, 2, 0, 6, 22, 8, 1})  Kelgan javob  \";\n" +
                "        if (r_1 != null && r_1.length == 6 && r_1[2] == 6) {\n" +
                "            s += \" '\" + Arrays.toString(r_1) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int[] r_2 = removeElement(0, new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  (0,{44, 1, 8}) .  Kelgan javob \";\n" +
                "        if (r_2 != null && r_2.length == 2 && r_2[0] == 1) {\n" +
                "            s += \" '\" + Arrays.toString(r_2) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int[] r_3 = removeElement(6, new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  (6,{4, 2, 5, 7, -1, 8, 12, 14, 8, 2}).  Kelgan javob \";\n" +
                "        if (r_3 != null && r_3.length == 9 && r_3[6] == 14) {\n" +
                "            s += \" '\" + Arrays.toString(r_3) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int[] r_4 = removeElement(4, new int[]{33, 2, 1, 5, 7});\n" +
                "        s += \"\\nTest 4  (4,{33, 2, 1, 5, 7}).  Kelgan javob \";\n" +
                "        if (r_4 != null && r_4.length == 4 && r_4[3] == 5) {\n" +
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

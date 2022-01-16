package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

import java.util.Arrays;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _015_Question {

    public int[] removeDuplicates(int array[]) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[size - 1];
                    size--;
                    j--;
                }
            }
        }
        int mas[] = Arrays.copyOf(array, size);
        return mas;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        // TEST_1
        int r_1[] = removeDuplicates(new int[]{1, 2, 1, 6, 2, 8, 1});
        s += "Test 1  {1, 2, 1, 6, 2, 8, 1}  Kelgan javob  ";
        Boolean t_1 = false;
        if (r_1 != null) {
            t_1 = true;
            for (int i = 0; i < r_1.length; i++) {
                for (int j = i + 1; j < r_1.length; j++) {
                    if (r_1[i] == r_1[j]) {
                        t_1 = false;
                    }
                }
            }
        }
        if (t_1) {
            s += " '" + Arrays.toString(r_1) + "' " + "  To'g'ri";
        } else {
            s += Arrays.toString(r_1) + "   Xato ";
            return s;
        }

        // TEST_2
        int r_2[] = removeDuplicates(new int[]{44, 1, 8, 1});
        s += "\nTest 2  {44, 1, 8, 1} .  Kelgan javob ";
        Boolean t_2 = false;
        if (r_2 != null) {
            t_2 = true;
            for (int i = 0; i < r_2.length; i++) {
                for (int j = i + 1; j < r_2.length; j++) {
                    if (r_2[i] == r_2[j]) {
                        t_2 = false;
                    }
                }
            }
        }
        if (t_2) {
            s += " '" + Arrays.toString(r_2) + "' " + "  To'g'ri";
        } else {
            s += Arrays.toString(r_2) + "   Xato ";
            return s;
        }

        //TEST_3
        int r_3[] = removeDuplicates(new int[]{4, 2, 5, 7, 2, 8, 2, 14, 8, 2});
        s += "\nTest 3  {4, 2, 5, 7, 2, 8, 2, 14, 8, 2}.  Kelgan javob ";

        Boolean t_3 = false;
        if (r_3 != null) {
            t_3 = true;
            for (int i = 0; i < r_3.length; i++) {
                for (int j = i + 1; j < r_3.length; j++) {
                    if (r_3[i] == r_3[j]) {
                        t_3 = false;
                    }
                }
            }
        }
        if (t_3) {
            s += " '" + Arrays.toString(r_3) + "' " + "  To'g'ri";
        } else {
            s += Arrays.toString(r_3) + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }

    public static void main(String[] args) {
        // int array1[]
        // shu arraydagi o'xshash elementlarni olib tashang
        System.out.println(new _015_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(15); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("int array1[] berilgan.\n" +
                "Shu arraydagi o'xshash elementlarni olib tashang.\n" +
                "Namuna: [1,3,4,1,5,3] \n" +
                "Natija: [1,3,4,5]\n\n" +
                "<code>public int[] removeDuplicates(int array[]) {\n" +
                "    \n" +
                "    }</code>");
        question.setTitle(" o'xshash elementlar ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>\n" +
                "public int[] removeDuplicates(int array[]) {\n" +
                "   int size = array.length;\n" +
                "   for (int i = 0; i &lt; size; i++) {\n" +
                "     for (int j = i + 1; j &lt; size; j++) {\n" +
                "       if (array[i] == array[j]) {\n" +
                "           array[j] = array[size - 1];\n" +
                "            size--;\n" +
                "            j--;\n" +
                "       }\n" +
                "      }\n" +
                "    }\n" +
                "  int mas[] = Arrays.copyOf(array, size);\n" +
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
                "        // TEST_1\n" +
                "        int r_1[] = removeDuplicates(new int[]{1, 2, 1, 6, 2, 8, 1});\n" +
                "        s += \"Test 1  {1, 2, 1, 6, 2, 8, 1}  Kelgan javob  \";\n" +
                "        Boolean t_1 = false;\n" +
                "        if (r_1 != null) {\n" +
                "            t_1 = true;\n" +
                "            for (int i = 0; i < r_1.length; i++) {\n" +
                "                for (int j = i + 1; j < r_1.length; j++) {\n" +
                "                    if (r_1[i] == r_1[j]) {\n" +
                "                        t_1 = false;\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        if (t_1) {\n" +
                "            s += \" '\" + Arrays.toString(r_1) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += Arrays.toString(r_1) + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        // TEST_2\n" +
                "        int r_2[] = removeDuplicates(new int[]{44, 1, 8, 1});\n" +
                "        s += \"\\nTest 2  {44, 1, 8, 1} .  Kelgan javob \";\n" +
                "        Boolean t_2 = false;\n" +
                "        if (r_2 != null) {\n" +
                "            t_2 = true;\n" +
                "            for (int i = 0; i < r_2.length; i++) {\n" +
                "                for (int j = i + 1; j < r_2.length; j++) {\n" +
                "                    if (r_2[i] == r_2[j]) {\n" +
                "                        t_2 = false;\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        if (t_2) {\n" +
                "            s += \" '\" + Arrays.toString(r_2) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += Arrays.toString(r_2) + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        //TEST_3\n" +
                "        int r_3[] = removeDuplicates(new int[]{4, 2, 5, 7, 2, 8, 2, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  {4, 2, 5, 7, 2, 8, 2, 14, 8, 2}.  Kelgan javob \";\n" +
                "\n" +
                "        Boolean t_3 = false;\n" +
                "        if (r_3 != null) {\n" +
                "            t_3 = true;\n" +
                "            for (int i = 0; i < r_3.length; i++) {\n" +
                "                for (int j = i + 1; j < r_3.length; j++) {\n" +
                "                    if (r_3[i] == r_3[j]) {\n" +
                "                        t_3 = false;\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        if (t_3) {\n" +
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

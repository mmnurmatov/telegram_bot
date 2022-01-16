package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _021_Question {

    public int sumEqual(int a, int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == a) {
                    count++;
                }
            }
        }
        return count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = sumEqual(6, new int[]{4, 2, 3, 2, 3, 4, 5, 1});
        s += "Test 1  (6, {4, 2, 3, 2, 3, 4, 5, 1})  Kelgan javob  ";
        if (r_1 == 6) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = sumEqual(10, new int[]{44, 1, 8});
        s += "\nTest 2  (10, {44, 1, 8}) .  Kelgan javob ";
        if (r_2 == 0) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = sumEqual(12, new int[]{4, 10, 5, 7, -1, 8, 12, 14, 13, 2});
        s += "\nTest 3  (12, {4, 10, 5, 7, -1, 8, 12, 14, 13, 2}).  Kelgan javob ";
        if (r_3 == 4) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // a, array berilgan
        // arrayning hohlagan ikkita  elementlarini yig'indisi a ga teng bo'lishini aniqlang
        // ekranga chiqaring (indexlari bilan birga)
        // va ularni nechta ekanligini qaytaring
        System.out.println(new _021_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(21); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("a, array berilgan.\n" +
                "Arrayning hohlagan ikkita  elementlarini \n" +
                "yig'indisi a ga teng bo'lishini aniqlang.\n" +
                "va ularni nechta ekanligini return qiling\n\n" +
                "<code>public int sumEqual(int a, int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("  ikkita  elementlar yig'indisi ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>" +
                "public int sumEqual(int a, int array[]) {\n" +
                "   int count = 0;\n" +
                "   for (int i = 0; i &lt; array.length; i++) {\n" +
                "     for (int j = i + 1; j &lt; array.length; j++) {\n" +
                "          if (array[i] + array[j] == a) {\n" +
                "               count++;\n" +
                "          }\n" +
                "     }\n" +
                "  }\n" +
                " return count;\n" +
                "}</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = sumEqual(6, new int[]{4, 2, 3, 2, 3, 4, 5, 1});\n" +
                "        s += \"Test 1  (6, {4, 2, 3, 2, 3, 4, 5, 1})  Kelgan javob  \";\n" +
                "        if (r_1 == 6) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = sumEqual(10, new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  (10, {44, 1, 8}) .  Kelgan javob \";\n" +
                "        if (r_2 == 0) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = sumEqual(12, new int[]{4, 10, 5, 7, -1, 8, 12, 14, 13, 2});\n" +
                "        s += \"\\nTest 3  (12, {4, 10, 5, 7, -1, 8, 12, 14, 13, 2}).  Kelgan javob \";\n" +
                "        if (r_3 == 4) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "    }}");
        return question;
    }

}

package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _004_Question {

    public boolean find(int a, int array[]) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return true;
            }
        }
        return false;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = find(3, new int[]{4, 2, 0, 6, 22, 8, 1});
        s += "Test 1  (3,{4, 2, 1, 6, 22, 8, 1})  Kelgan javob  ";
        if (!r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = find(1, new int[]{44, 1, 8});
        s += "\nTest 2  (1,{44, 1, 8}) .  Kelgan javob ";
        if (r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = find(12, new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});
        s += "\nTest 3  (12,{4, 2, 5, 7, 1, 8, 12, 14, 8, -2}).  Kelgan javob ";
        if (r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        Boolean r_4 = find(8, new int[]{33, 2, 1, 5, 7});
        s += "\nTest 4  (8,{33, 2, 1, 5, 7}).  Kelgan javob ";
        if (!r_4) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // n, array[] berilgan
        // shu massivda n soni bor yokiy yo'qligini aniqlang
        // n soni bo'lsa true, bo'lmasa false qaytaring
        System.out.println(new _004_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(4); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("n, array[] berilgan.\n" +
                "shu massivda n soni bor yokiy yo'qligini aniqlang.\n" +
                "n soni bo'lsa true, bo'lmasa false qaytaring.\n\n" +
                "<code>public boolean find(int a, int array[]) {\n" +
                "       \n" +
                "    }</code>");
        question.setTitle(" o'rtacha qiymat ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>   " +
                "public boolean find(int a, int array[]) {\n" +
                "   for (int i = 0; i &lt; array.length; i++) {\n" +
                "       if (array[i] == a) {\n" +
                "           return true;\n" +
                "        }\n" +
                "     }\n" +
                "   return false;\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        Boolean r_1 = find(3, new int[]{4, 2, 0, 6, 22, 8, 1});\n" +
                "        s += \"Test 1  (3,{4, 2, 1, 6, 22, 8, 1})  Kelgan javob  \";\n" +
                "        if (!r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = find(1, new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  (1,{44, 1, 8}) .  Kelgan javob \";\n" +
                "        if (r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = find(12, new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  (12,{4, 2, 5, 7, 1, 8, 12, 14, 8, -2}).  Kelgan javob \";\n" +
                "        if (r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_4 = find(8, new int[]{33, 2, 1, 5, 7});\n" +
                "        s += \"\\nTest 4  (8,{33, 2, 1, 5, 7}).  Kelgan javob \";\n" +
                "        if (!r_4) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
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

package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _005_Question {

    public int find(int n, int array[]) {
        if (n < 0 || n >= array.length) {
            return 0;
        } else {
            return array[n];
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = find(2, new int[]{4, 2, 0, 6, 22, 8, 1});
        s += "Test 1  (2,{4, 2, 1, 6, 22, 8, 1})  Kelgan javob  ";
        if (r_1 == 0) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = find(0, new int[]{44, 1, 8});
        s += "\nTest 2  (0,{44, 1, 8}) .  Kelgan javob ";
        if (r_2 == 44) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = find(15, new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});
        s += "\nTest 3  (15,{4, 2, 5, 7, 1, 8, 12, 14, 8, -2}).  Kelgan javob ";
        if (r_3 == 0) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = find(4, new int[]{33, 2, 1, 5, 7});
        s += "\nTest 4  (4,{33, 2, 1, 5, 7}).  Kelgan javob ";
        if (r_4 == 7) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // n, array[] berilgan
        // shu massivda n-chi index dagi elementini returin qiling
        // agar index hato bo'lsa  0 jo'nating
        System.out.println(new _005_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(5); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("n, array[] berilgan.\n" +
                "Shu massivda n-chi index dagi elementini return qiling.\n" +
                "Agar index hato bo'lsa  0 jo'nating.\n\n" +
                "<code> public int find(int n, int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle(" n- chi index ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int find(int n, int array[]) {\n" +
                "   if (n &lt; 0 || n &gt;= array.length) {\n" +
                "       return 0;\n" +
                "    } else {\n" +
                "       return array[n];\n" +
                "    }\n" +
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
                "        int r_1 = find(2, new int[]{4, 2, 0, 6, 22, 8, 1});\n" +
                "        s += \"Test 1  (2,{4, 2, 1, 6, 22, 8, 1})  Kelgan javob  \";\n" +
                "        if (r_1 == 0) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = find(0, new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  (0,{44, 1, 8}) .  Kelgan javob \";\n" +
                "        if (r_2 == 44) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = find(15, new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  (15,{4, 2, 5, 7, 1, 8, 12, 14, 8, -2}).  Kelgan javob \";\n" +
                "        if (r_3 == 0) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = find(4, new int[]{33, 2, 1, 5, 7});\n" +
                "        s += \"\\nTest 4  (4,{33, 2, 1, 5, 7}).  Kelgan javob \";\n" +
                "        if (r_4 == 7) {\n" +
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

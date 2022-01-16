package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _006_Question {

    public int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public String testUserMethod() {
        String s = "Code ni Trkshirish\n";

        int r_1 = max(15, 10, 3);
        s += "Test 1  (15, 10, 3).  Kelgan javob  ";
        if (r_1 == 15) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = max(10, 22, 14);
        s += "\nTest 2  (10, 22, 14).  Kelgan javob ";
        if (r_2 == 22) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = max(-1, 2, 5);
        s += "\nTest 3  (-1,2,5).  Kelgan javob ";
        if (r_3 == 5) {
            s += " '" + r_3 + "' " + " To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = max(-1, -2, -3);
        s += "\nTest 4  (-1,-2,-3).  Kelgan javob ";
        if (r_4 == -1) {
            s += " '" + r_4 + "' " + " To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // berilgan 3 ta sondan kattasini toping
        System.out.println(new _006_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(6); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c  sonlari berilgan.\n" +
                "Berilgan 3 ta sondan kattasini return qiling .\n\n" +
                "<code> public int max(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("uchta sondan kattasi");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> public int max(int a, int b, int c) {\n" +
                "        if (a &gt; b) {\n" +
                "            if (a &gt; c) {\n" +
                "                return a;\n" +
                "            } else {\n" +
                "                return c;\n" +
                "            }\n" +
                "        } else {\n" +
                "            if (b &gt; c) {\n" +
                "                return b;\n" +
                "            } else {\n" +
                "                return c;\n" +
                "            }\n" +
                "        }\n" +
                "    }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = max(15, 10, 3);\n" +
                "        s += \"Test 1  (15, 10, 3).  Kelgan javob  \";\n" +
                "        if (r_1 == 15) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = max(10, 22, 14);\n" +
                "        s += \"\\nTest 2  (10, 22, 14).  Kelgan javob \";\n" +
                "        if (r_2 == 22) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = max(-1, 2, 5);\n" +
                "        s += \"\\nTest 3  (-1,2,5).  Kelgan javob \";\n" +
                "        if (r_3 == 5) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \" To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = max(-1, -2, -3);\n" +
                "        s += \"\\nTest 4  (-1,-2,-3).  Kelgan javob \";\n" +
                "        if (r_4 == -1) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \" To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD0QEAAmhmUEgVp7-ceYZP0gI");
        return question;
    }
}

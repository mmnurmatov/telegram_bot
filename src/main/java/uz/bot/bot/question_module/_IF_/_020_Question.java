package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _020_Question {

    public int min(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = min(3, 6, 7);
        s += "Test 1  (3,6,7).  Kelgan javob  ";
        if (r_1 == 3) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = min(4, 2, 8);
        s += "\nTest 2  (4,2,8).  Kelgan javob ";
        if (r_2 == 2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = min(14, 15, 10);
        s += "\nTest 3  (14,15,10).  Kelgan javob ";
        if (r_3 == 10) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = min(-7, -11, -1);
        s += "\nTest 4  (-7, -11,-1).  Kelgan javob ";
        if (r_4 == -11) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        int r_5 = min(13, 10, 9);
        s += "\nTest 5  (13, 10, 9).  Kelgan javob ";
        if (r_5 == 9) {
            s += " '" + r_5 + "' " + "  To'g'ri";
        } else {
            s += r_5 + "   Xato ";
            return s;
        }

        int r_6 = min(8, 20, 2);
        s += "\nTest 6  (8, 20, 2).  Kelgan javob ";
        if (r_6 == 2) {
            s += " '" + r_6 + "' " + "  To'g'ri";
        } else {
            s += r_6 + "   Xato ";
            return s;
        }

        int r_7 = min(4, 8, 5);
        s += "\nTest 7  (8, 20, 14).  Kelgan javob ";
        if (r_7 == 4) {
            s += " '" + r_7 + "' " + "  To'g'ri";
        } else {
            s += r_7 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Berilgan uchta sondan minimum sonni toping;
        System.out.println(new _020_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(20); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c sonlari berilgan.\n" +
                "Berilgan uchta sondan minimum sonni toping " +
                " va shu sonni return qiling. \n\n" +
                "<code> public int min(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("min 3 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int min(int a, int b, int c) {\n" +
                "        if (a &lt; b) {\n" +
                "            if (a &lt; c) {\n" +
                "                return a;\n" +
                "            } else {\n" +
                "                return c;\n" +
                "            }\n" +
                "        } else if (b &lt; c) {\n" +
                "            return b;\n" +
                "        } else {\n" +
                "            return c;\n" +
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
                "        int r_1 = min(3, 6, 7);\n" +
                "        s += \"Test 1  (3,6,7).  Kelgan javob  \";\n" +
                "        if (r_1 == 3) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = min(4, 2, 8);\n" +
                "        s += \"\\nTest 2  (4,2,8).  Kelgan javob \";\n" +
                "        if (r_2 == 2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = min(14, 15, 10);\n" +
                "        s += \"\\nTest 3  (14,15,10).  Kelgan javob \";\n" +
                "        if (r_3 == 10) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = min(-7, -11, -1);\n" +
                "        s += \"\\nTest 4  (-7, -11,-1).  Kelgan javob \";\n" +
                "        if (r_4 == -11) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_5 = min(13, 10, 9);\n" +
                "        s += \"\\nTest 5  (13, 10, 9).  Kelgan javob \";\n" +
                "        if (r_5 == 9) {\n" +
                "            s += \" '\" + r_5 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_5 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_6 = min(8, 20, 2);\n" +
                "        s += \"\\nTest 6  (8, 20, 2).  Kelgan javob \";\n" +
                "        if (r_6 == 2) {\n" +
                "            s += \" '\" + r_6 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_6 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_7 = min(4, 8, 5);\n" +
                "        s += \"\\nTest 7  (8, 20, 14).  Kelgan javob \";\n" +
                "        if (r_7 == 4) {\n" +
                "            s += \" '\" + r_7 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_7 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD2wEAAmhmUEgSLCLVLDg1XgI");
        return question;
    }
}

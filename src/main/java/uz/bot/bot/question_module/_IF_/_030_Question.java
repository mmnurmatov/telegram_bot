package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 24.01.2018.
 */
public class _030_Question {

    public int check(int a, int b, int c) {
        if ((a % 2 == 0 && b % 2 == 0) ||
                (a % 2 == 0 && c % 2 == 0) ||
                (b % 2 == 0 && c % 2 == 0)) {
            return 1;
        } else if ((a % 2 == 1 && b % 2 == 1) ||
                (a % 2 == 1 && c % 2 == 1) ||
                (b % 2 == 1 && c % 2 == 1)) {
            return 2;
        } else {
            return 0;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = check(24, 15, 8);
        s += "Test 1  (24,15,8)  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = check(2, 4, 6);
        s += "\nTest 2  (2, 4, 6).  Kelgan javob ";
        if (r_2 == 1) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = check(15, 7, 14);
        s += "\nTest 3  (15, 7, 14).  Kelgan javob ";
        if (r_3 == 2) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = check(24, 17, 23);
        s += "\nTest 3  (24,17, 23).  Kelgan javob ";
        if (r_4 == 2) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a,b,c sonlar berilgan (0 emas)
        // 1. agar  hohlagan 2 tasi juft bo'lsa 1;
        // 2. agar hohlagan 2 tasi toq bo'lsa 2
        // bo'lmasa 0 ni jo'nating

        System.out.println(new _030_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(30); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c sonlar berilgan (0 emas).\n" +
                "Agar  hohlagan 2 tasi juft bo'lsa 1 ni return qiling.\n" +
                "Agar hohlagan 2 tasi toq bo'lsa 2 ni return qiling\n" +
                "bo'lmasa 0 ni return qiling.\n\n" +
                "<code>  public int check(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("son 5 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int check(int a, int b, int c) {\n" +
                "     if ((a % 2 == 0 &amp;&amp; b % 2 == 0) ||\n" +
                "             (a % 2 == 0 &amp;&amp; c % 2 == 0) ||\n" +
                "             (b % 2 == 0 &amp;&amp; c % 2 == 0)) { \n" +
                "          return 1;\n" +
                "      } else if ((a % 2 == 1 &amp;&amp; b % 2 == 1) ||\n" +
                "             (a % 2 == 1 &amp;&amp; c % 2 == 1) ||\n" +
                "             (b % 2 == 1 &amp;&amp; c % 2 == 1)) {\n" +
                "          return 2;\n" +
                "      } else {\n" +
                "          return 0;\n" +
                "      }\n" +
                "    }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                " public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = check(24, 15, 8);\n" +
                "        s += \"Test 1  (24,15,8)  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = check(2, 4, 6);\n" +
                "        s += \"\\nTest 2  (2, 4, 6).  Kelgan javob \";\n" +
                "        if (r_2 == 1) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = check(15, 7, 14);\n" +
                "        s += \"\\nTest 3  (15, 7, 14).  Kelgan javob \";\n" +
                "        if (r_3 == 2) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = check(24, 17, 23);\n" +
                "        s += \"\\nTest 3  (24,17, 23).  Kelgan javob \";\n" +
                "        if (r_4 == 2) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD5gEAAmhmUEiMMExhOYUilwI");
        return question;
    }
}

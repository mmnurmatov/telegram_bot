package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 24.01.2018.
 */
public class _022_Question {

    public int order(int a, int b, int c) {
        if (a < b && b < c) {
            // agar sonlar o'sish tartibida  joylashgan bo'lsa.
            return 1; //1 ni qaytarsin.
        } else if (a > b && b > c) {
            // agar kamayish tartibda bo'lsa,
            return 2; // 2 qaytarsin,
        } else if (b > a && b > c) {
            //agar eng kattasi b bo'sa  bini qaytarsin.
            return b;
        } else if (a == b && b == c) {
            // agar ular teng bo'lsa 5 ni qaytarsin.
            return 5;
        } else {
            //bo'lmasa 0 ni qaytarsin.
            return 0;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = order(2, 5, 8);
        s += "Test 1  (2,5,8).  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = order(11, 9, 2);
        s += "\nTest 2  (11,9,2).  Kelgan javob ";
        if (r_2 == 2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = order(14, 15, 10);
        s += "\nTest 3  (14,15,10).  Kelgan javob ";
        if (r_3 == 15) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = order(4, 4, 4);
        s += "\nTest 4  (4,4,4).  Kelgan javob ";
        if (r_4 == 5) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        int r_5 = order(14, 4, 18);
        s += "\nTest 4  (14,4,18).  Kelgan javob ";
        if (r_5 == 0) {
            s += " '" + r_5 + "' " + "  To'g'ri";
        } else {
            s += r_5 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Q 16;
        // a,b,c sonlar berilgan
        // agar sonlar o'sish tartibida  joylashgan bo'lsa  1 ni qaytarsin
        // agar kamayish tartibda bo'lsa 2 qaytarsin
        // agar eng kattasi b bo'sa  bini qaytarsin
        // agar ular teng bo'lsa 5 ni qaytarsin
        // bo'lmasa 0 ni qaytarsin

        System.out.println(new _022_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(22); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c sonlar berilgan.\n" +
                "Agar sonlar o'sish tartibida  joylashgan bo'lsa  " +
                "1 ni return qiling.\n" +
                "Agar kamayish tartibda bo'lsa 2 return qiling.\n" +
                "Agar eng kattasi b bo'sa  b ni return qiling.\n" +
                "Agar ular teng bo'lsa 5 ni return qiling.\n" +
                "bo'lmasa 0 ni return qiling. \n\n " +
                "<code>   public int order(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("sonlar ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int order(int a, int b, int c) {\n" +
                "        if (a < b && b < c) {\n" +
                "            // agar sonlar o'sish tartibida  joylashgan bo'lsa.\n" +
                "            return 1; //1 ni qaytarsin.\n" +
                "        } else if (a > b && b > c) {\n" +
                "            // agar kamayish tartibda bo'lsa,\n" +
                "            return 2; // 2 qaytarsin,\n" +
                "        } else if (b > a && b > c) {\n" +
                "            //agar eng kattasi b bo'sa  bini qaytarsin.\n" +
                "            return b;\n" +
                "        } else if (a == b && b == c) {\n" +
                "            // agar ular teng bo'lsa 5 ni qaytarsin.\n" +
                "            return 5;\n" +
                "        } else {\n" +
                "            //bo'lmasa 0 ni qaytarsin.\n" +
                "            return 0;\n" +
                "        }\n" +
                "    } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = order(2, 5, 8);\n" +
                "        s += \"Test 1  (2,5,8).  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = order(11, 9, 2);\n" +
                "        s += \"\\nTest 2  (11,9,2).  Kelgan javob \";\n" +
                "        if (r_2 == 2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = order(14, 15, 10);\n" +
                "        s += \"\\nTest 3  (14,15,10).  Kelgan javob \";\n" +
                "        if (r_3 == 15) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = order(4, 4, 4);\n" +
                "        s += \"\\nTest 4  (4,4,4).  Kelgan javob \";\n" +
                "        if (r_4 == 5) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_5 = order(14, 4, 18);\n" +
                "        s += \"\\nTest 4  (14,4,18).  Kelgan javob \";\n" +
                "        if (r_5 == 0) {\n" +
                "            s += \" '\" + r_5 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_5 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD1gEAAt2NSEhNnQNP70uwhAI");
        return question;
    }

}

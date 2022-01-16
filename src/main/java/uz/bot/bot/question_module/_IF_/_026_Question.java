package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 24.01.2018.
 */
public class _026_Question {

    public int distance(int a) {
        if (a >= 100) {
            // 100 ham 3 honali son hisoblanadi
            // shuning uchun  katta yokiy teng ishorasi turibdi
            return 3;
        } else if (a >= 10) {
            return 2;
        } else {
            // agar s soni 3 yokiy 2 honali bo'lmasa demak u 1 honali.
            // chunkiy a sonining qiymati (1-999) orasida.
            return 1;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = distance(3);
        s += "Test 1  (3)  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = distance(19);
        s += "\nTest 2  (19).  Kelgan javob ";
        if (r_2 == 2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = distance(177);
        s += "\nTest 3  (177).  Kelgan javob ";
        if (r_3 == 3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a soni berilgan (1 - 999)
        // agar a soni 1 honali son bo'lsa 1 jo'nating
        // agat a soni 2 honali son bo'lsa 2 ni jo'nating
        // agar a soni 3 honali bo'lsa 3 ni jo'nating
        System.out.println(new _026_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(26); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("  a soni berilgan (1 - 999).\n" +
                "Agar a soni 1 honali son bo'lsa 1 ni return qiling.\n" +
                "Agat a soni 2 honali son bo'lsa 2 ni return qiling.\n" +
                "Agar a soni 3 honali bo'lsa 3 ni return qiling.\n\n" +
                "<code> public int distance(int a) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("masofa 2 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int distance(int a) {\n" +
                "        if (a >= 100) { \n" +
                "          // 100 ham 3 honali son hisoblanadi\n" +
                "            // shuning uchun  katta yokiy teng ishorasi turibdi\n" +
                "            return 3;\n" +
                "        } else if (a >= 10) {\n" +
                "            return 2;\n" +
                "        } else {\n" +
                "            // agar s soni 3 yokiy 2 honali bo'lmasa demak u 1 honali.\n" +
                "            // chunkiy a sonining qiymati (1-999) orasida.\n" +
                "            return 1;\n" +
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
                "        int r_1 = distance(3);\n" +
                "        s += \"Test 1  (3)  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = distance(19);\n" +
                "        s += \"\\nTest 2  (19).  Kelgan javob \";\n" +
                "        if (r_2 == 2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = distance(177);\n" +
                "        s += \"\\nTest 3  (177).  Kelgan javob \";\n" +
                "        if (r_3 == 3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD2QEAAt2NSEhJoUMtGmWnTgI");
        return question;
    }
}

package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 24.01.2018.
 */
public class _023_Question {

    public int difNum(int a, int b, int c) {
        if (a == b) {
            // agar a teng bo'lsa b
            return c;
        } else if (a == c) {
            // agar a teng bo'lsa c
            return b;
        } else if (b == c) {
            // agar b teng bo'lsa c
            return a;
        } else {
            // agar ular bir biriga teng bo'lmasa
            return 0;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = difNum(21, 9, 17);
        s += "Test 1  (21, 9, 17.  Kelgan javob  ";
        if (r_1 == 0) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = difNum(1, 1, 2);
        s += "\nTest 2  (1,1,2).  Kelgan javob ";
        if (r_2 == 2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = difNum(9, 7, 9);
        s += "\nTest 3  (9, 7, 9).  Kelgan javob ";
        if (r_3 == 7) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = difNum(8, 4, 4);
        s += "\nTest 4  (8,4,4).  Kelgan javob ";
        if (r_4 == 8) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        int r_5 = difNum(5, 4, 1);
        s += "\nTest 4  (15,4,1).  Kelgan javob ";
        if (r_5 == 0) {
            s += " '" + r_5 + "' " + "  To'g'ri";
        } else {
            s += r_5 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Q 18;
        // a,b,c sonlar berilgan
        // agar shu solarning ikkitasi o'zaro teng bo'lsa teng bo'lmagan sonni jo'nativoeing
        // aks holda 0 ni jo'nating

        System.out.println(new _023_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(23); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c sonlar berilgan.\n" +
                "Agar shu solarning ikkitasi o'zaro teng bo'lsa \n" +
                "teng bo'lmagan sonni return qiling.\n" +
                "aks holda 0 ni return qiling. \n\n" +
                "<code>   public int difNum(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("sonlar 2 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int difNum(int a, int b, int c) {\n" +
                "        if (a == b) {\n" +
                "            // agar a teng bo'lsa b\n" +
                "            return c;\n" +
                "        } else if (a == c) {\n" +
                "            // agar a teng bo'lsa c\n" +
                "            return b;\n" +
                "        } else if (b == c) {\n" +
                "            // agar b teng bo'lsa c\n" +
                "            return a;\n" +
                "        } else {\n" +
                "            // agar ular bir biriga teng bo'lmasa\n" +
                "            return 0;\n" +
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
                "        int r_1 = difNum(21, 9, 17);\n" +
                "        s += \"Test 1  (21, 9, 17.  Kelgan javob  \";\n" +
                "        if (r_1 == 0) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = difNum(1, 1, 2);\n" +
                "        s += \"\\nTest 2  (1,1,2).  Kelgan javob \";\n" +
                "        if (r_2 == 2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = difNum(9, 7, 9);\n" +
                "        s += \"\\nTest 3  (9, 7, 9).  Kelgan javob \";\n" +
                "        if (r_3 == 7) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = difNum(8, 4, 4);\n" +
                "        s += \"\\nTest 4  (8,4,4).  Kelgan javob \";\n" +
                "        if (r_4 == 8) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_5 = difNum(5, 4, 1);\n" +
                "        s += \"\\nTest 4  (15,4,1).  Kelgan javob \";\n" +
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
        question.setAnswerVideoLink("BAADAgAD1wEAAt2NSEhae36M8CC_6QI");
        return question;
    }
}

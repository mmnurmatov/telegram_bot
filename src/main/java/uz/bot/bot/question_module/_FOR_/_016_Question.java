package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _016_Question {
    public Boolean isPerfect(int n) {
        int temp = n;
        int sum = 0;
        int m;

        for (; temp != 0; temp = temp / 10) {
            m = temp % 10;
            sum = sum + (m * m * m);
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = isPerfect(153);
        s += "Test 1  (153)  Kelgan javob  ";
        if (r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = isPerfect(356);
        s += "\nTest 2  (356).  Kelgan javob ";
        if (!r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = isPerfect(371);
        s += "\nTest 3  (371).  Kelgan javob ";
        if (r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        Boolean r_4 = isPerfect(496);
        s += "\nTest 4  (496).  Kelgan javob ";
        if (!r_4) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n ,soni berilgan (n  uch honali son deb hisoblang)
        // shu son Armstrong raqami hisoblanadimi yoki yo'qmi ?
        // agar Armsrong raqami bo'lsa true bo'lmasa false return qiling
        // Masalan : (Armstrong raqam)
        // n = 153  agar (1*1*1) + (5*5*5) + (3*3*3) = 153  bu Armstrong raqami deyiladi
        // bunda sonning raqamlarining kub (153  , 3 honali bo'lgani uchun ) darajasi yig'indisi osha sonning o'ziga teng bo'lsa.
        // n = 1634  (1*1*1*1) + (6*6*6*6)+ (3*3*3*3)+(4*4*4*4) = 1634
        // bunda raqamlarinig 4 chi darajani hisoblaymiz chunkiy 1634 to'r honali son.
        // bu misolni hohlasa sonni aniqlaydigani ikkitalik for da bo'ladi.
        System.out.println(new _016_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(16); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan (n  uch honali son deb hisoblang).\n" +
                "Shu son Armstrong raqami hisoblanadimi yoki yo'qmi ?\n" +
                "Agar Armsrong raqami bo'lsa true bo'lmasa false return qiling.\n" +
                "Masalan : (Armstrong raqam)\n" +
                "n = 153  agar (1*1*1) + (5*5*5) + (3*3*3) = 153  \n." +
                "bu Armstrong raqami deyiladi.\n" +
                "bunda sonning raqamlarining kub (153  , 3 honali bo'lgani uchun )\n" +
                " darajasi yig'indisi osha sonning o'ziga teng.\n" +
                "n = 1634  (1*1*1*1) + (6*6*6*6)+ (3*3*3*3)+(4*4*4*4) = 1634\n" +
                "bunda raqamlarinig 4 chi darajani hisoblaymiz\n" +
                "chunkiy 1634 to'r honali son.\n\n" +
                "<code>  public Boolean isPerfect(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("ketma ketlik ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> public Boolean isPerfect(int n) {\n" +
                "        int temp = n;\n" +
                "        int sum = 0;\n" +
                "        int m;\n" +
                "\n" +
                "        for (; temp != 0; temp = temp / 10) {\n" +
                "            m = temp % 10;\n" +
                "            sum = sum + (m * m * m);\n" +
                "        }\n" +
                "\n" +
                "        if (sum == n) {\n" +
                "            return true;\n" +
                "        } else {\n" +
                "            return false;\n" +
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
                "        Boolean r_1 = isPerfect(153);\n" +
                "        s += \"Test 1  (153)  Kelgan javob  \";\n" +
                "        if (r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = isPerfect(356);\n" +
                "        s += \"\\nTest 2  (356).  Kelgan javob \";\n" +
                "        if (!r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = isPerfect(371);\n" +
                "        s += \"\\nTest 3  (371).  Kelgan javob \";\n" +
                "        if (r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_4 = isPerfect(496);\n" +
                "        s += \"\\nTest 4  (496).  Kelgan javob \";\n" +
                "        if (!r_4) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD9AEAAmhmUEhy2hZi5BLDXwI");
        return question;
    }

}

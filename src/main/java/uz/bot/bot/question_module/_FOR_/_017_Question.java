package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _017_Question {

    public Boolean isPrime(int n) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count >= 3) {
            return false;
        } else {
            return true;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = isPrime(13);
        s += "Test 1  (13)  Kelgan javob  ";
        if (r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = isPrime(356);
        s += "\nTest 2  (356).  Kelgan javob ";
        if (!r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = isPrime(443);
        s += "\nTest 3  (443).  Kelgan javob ";
        if (r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        Boolean r_4 = isPrime(29);
        s += "\nTest 4  (29).  Kelgan javob ";
        if (r_4) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n ,soni berilgan
        // shu sonni tup ekanligini aniqlang
        // agar tup bo'lsa true kelsin bo'lmasa false
        //  tupson ( 1 ga va o'ziga bo'linadigan sonlar)
        System.out.println(new _017_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(17); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Shu son tup (prime) ekanligini aniqlang.\n" +
                "Agar tup bo'lsa true return qiling\n " +
                "bo'lmasa false return qiling.\n" +
                "tupson ( 1 ga va o'ziga bo'linadigan sonlar).\n\n" +
                "<code>  public Boolean isPrime(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("ketma ketlik ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public Boolean isPrime(int n) {\n" +
                "        int count = 0;\n" +
                "\n" +
                "        for (int i = 1; i &lt; n; i++) {\n" +
                "            if (n % i == 0) {\n" +
                "                count++;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        if (count &gt;= 3) {\n" +
                "            return false;\n" +
                "        } else {\n" +
                "            return true;\n" +
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
                "        Boolean r_1 = isPrime(13);\n" +
                "        s += \"Test 1  (13)  Kelgan javob  \";\n" +
                "        if (r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = isPrime(356);\n" +
                "        s += \"\\nTest 2  (356).  Kelgan javob \";\n" +
                "        if (!r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = isPrime(443);\n" +
                "        s += \"\\nTest 3  (443).  Kelgan javob \";\n" +
                "        if (r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_4 = isPrime(29);\n" +
                "        s += \"\\nTest 4  (29).  Kelgan javob \";\n" +
                "        if (r_4) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD9QEAAmhmUEg5YUvlrSTb7gI");
        return question;
    }
}

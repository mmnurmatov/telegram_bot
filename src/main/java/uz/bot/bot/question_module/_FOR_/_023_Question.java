package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _023_Question {

    public int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = factorial(5);
        s += "Test 1  (5)  Kelgan javob  ";
        if (r_1 == 120) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = factorial(10);
        s += "\nTest 2  (10).  Kelgan javob ";
        if (r_2 == 3628800) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = factorial(7);
        s += "\nTest 3  (7).  Kelgan javob ";
        if (r_3 == 5040) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n ,soni berilgan
        // berilgan sonning factarialini hisoblang
        // Masalan: 5 ning factoriali   1*2*3*4*5 = 120;

        System.out.println(new _023_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(23); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "berilgan sonning factarialini hisoblang.\n" +
                "Masalan: 5 ning factoriali   1*2*3*4*5 = 120; \n\n" +
                "<code>  public int factorial(int n) {\n" +
                "       \n" +
                "    }</code>");
        question.setTitle("factarial ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>   " +
                "public int factorial(int n) {\n" +
                "        int f = 1;\n" +
                "        for (int i = 1; i &lt;= n; i++) {\n" +
                "            f = f * i;\n" +
                "        }\n" +
                "        return f;\n" +
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
                "        int r_1 = factorial(5);\n" +
                "        s += \"Test 1  (5)  Kelgan javob  \";\n" +
                "        if (r_1 == 120) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = factorial(10);\n" +
                "        s += \"\\nTest 2  (10).  Kelgan javob \";\n" +
                "        if (r_2 == 3628800) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = factorial(7);\n" +
                "        s += \"\\nTest 3  (7).  Kelgan javob \";\n" +
                "        if (r_3 == 5040) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD_AEAAmhmUEgAAdSdEWqKu1UC");
        return question;
    }

}

package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _035_Question {

    public int test(int x, int n) {
        // 1 + x + x^2 + x^3 + ... x^n
        // x^0 + x^1 + x^3 + ... x^n
        int sum = 1;
        for (int i = 0; i < n; i++) {
            int powerSum = x;
            for (int j = 1; j <= i; j++) {
                powerSum *= x;
            }
            sum += powerSum;
        }
        return sum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = test(2, 5);
        s += "Test 1  (2,5)  Kelgan javob  ";
        if (r_1 == 63) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = test(4, 5);
        s += "\nTest 2  (4,5).  Kelgan javob ";
        if (r_2 == 1365) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }


    public static void main(String[] args) {
        // x, n sonlari berilagan
        // 1 + x + x^2 + x^3 + ... x^n
        // n buyerda ketma ketlikni  n chi hadi
        System.out.println(new _035_Question().test(4, 5));
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(35); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("x, n sonlari berilagan.\n" +
                "x1 + x + x^2 + x^3 + ... x^n.\n" +
                "n buyerda ketma ketlikni  n chi hadi.\n\n" +
                "<code>  public int test(int x, int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("oraliqdagi palindrom");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int test(int x, int n) {\n" +
                "   // 1 + x + x^2 + x^3 + ... x^n\n" +
                "   // x^0 + x^1 + x^3 + ... x^n\n" +
                "     int sum = 1;\n" +
                "     for (int i = 0; i &lt; n; i++) {\n" +
                "        int powerSum = x;\n" +
                "        for (int j = 1; j &lt;= i; j++) {\n" +
                "             powerSum *= x;\n" +
                "        }\n" +
                "           sum += powerSum;\n" +
                "      }\n" +
                "      return sum;\n" +
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
                "        int r_1 = test(2, 5);\n" +
                "        s += \"Test 1  (2,5)  Kelgan javob  \";\n" +
                "        if (r_1 == 63) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = test(4, 5);\n" +
                "        s += \"\\nTest 2  (4,5).  Kelgan javob \";\n" +
                "        if (r_2 == 1365) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        return question;
    }
}

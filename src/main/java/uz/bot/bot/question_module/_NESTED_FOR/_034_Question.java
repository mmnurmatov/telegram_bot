package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _034_Question {


    public int test(int x, int n) {
        // [ x - x^3 + x^5 + ......]
        // [ x^1 -x^3 + x^5 + .......]
        int sum = 0;
        boolean t = true;
        int power = 1;
        for (int i = 1; i <= n; i++, power += 2) {
            int powerSum = 1;

            for (int j = 1; j <= power; j++) {
                powerSum *= x;
            }
            if (t) {
                sum += powerSum;
                t = false;
            } else {
                sum -= powerSum;
                t = true;
            }
        }
        return sum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = test(2, 5);
        s += "Test 1  (2,5)  Kelgan javob  ";
        if (r_1 == 410) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = test(3, 4);
        s += "\nTest 2  (3,4).  Kelgan javob ";
        if (r_2 == -1968) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // x , n soni berilgan
        // [ x - x^3 + x^5 + ......]
        // shu ketma ketlikni hisoblovchi dastur yozing
        // n buyerda ketmaketlikning elementi (soni)
//        System.out.println(new _034_Question().test(3, 4));
        System.out.println(new _034_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(34); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("x , n soni berilgan.\n" +
                "[ x - x^3 + x^5 + ......]\n" +
                "shu ketma ketlikni hisoblovchi dastur yozing.\n" +
                "n buyerda ketma ketlikni  n chi hadi.\n\n" +
                "<code>  public int test(int x, int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("oraliqdagi palindrom");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int test(int x, int n) {\n" +
                "   // [ x - x^3 + x^5 + ......]\n" +
                "   // [ x^1 -x^3 + x^5 + .......]\n" +
                "    int sum = 0;\n" +
                "    boolean t = true;\n" +
                "    int power = 1;\n" +
                "  for (int i = 1; i &lt;= n; i++, power += 2) {\n" +
                "     int powerSum = 1;\n" +
                "\n" +
                "  for (int j = 1; j &lt;= power; j++) {\n" +
                "     powerSum *= x;\n" +
                "    }\n" +
                "    if (t) {\n" +
                "       sum += powerSum;\n" +
                "       t = false;\n" +
                "    } else {\n" +
                "       sum -= powerSum;\n" +
                "       t = true;\n" +
                "    }\n" +
                "  }\n" +
                "     return sum;\n" +
                "}</code>");

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
                "        if (r_1 == 410) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = test(3, 4);\n" +
                "        s += \"\\nTest 2  (3,4).  Kelgan javob \";\n" +
                "        if (r_2 == -1968) {\n" +
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

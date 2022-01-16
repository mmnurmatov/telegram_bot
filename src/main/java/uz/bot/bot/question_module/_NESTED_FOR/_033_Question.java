package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _033_Question {

    public int power(int a, int b, int c) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            int power = 1;
            for (int j = 0; j < c; j++) {
                power = power * i;
            }
            sum += power;
        }
        return sum;
    }


    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = power(1, 5, 3);
        s += "Test 1  (1, 5, 3)  Kelgan javob  ";
        if (r_1 == 225) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = power(4, 10, 1);
        s += "\nTest 2  (4, 10, 1).  Kelgan javob ";
        if (r_2 == 49) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a,b,c  sonlari berilgan
        // a dan b gacha bo'lgan sonlarni c -chi darajasini yig'indisini hisoblovchi dastur yozing
        System.out.println(new _033_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(33); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c  sonlari berilgan.\n" +
                "a dan b gacha bo'lgan sonlarni." +
                "c - n chi darajasini yig'indisini hisoblovchi dastur yozing.\n\n" +
                "<code>  public int power(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("oraliqdagi palindrom");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int power(int a, int b, int c) {\n" +
                "   int sum = 0;\n" +
                "   for (int i = a; i &lt;= b; i++) {\n" +
                "       int power = 1;\n" +
                "      for (int j = 0; j &lt; c; j++) {\n" +
                "          power = power * i;\n" +
                "      }\n" +
                "       sum += power;\n" +
                "   }\n" +
                "   return sum;\n" +
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
                "        int r_1 = power(1, 5, 3);\n" +
                "        s += \"Test 1  (1, 5, 3)  Kelgan javob  \";\n" +
                "        if (r_1 == 225) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = power(4, 10, 1);\n" +
                "        s += \"\\nTest 2  (4, 10, 1).  Kelgan javob \";\n" +
                "        if (r_2 == 49) {\n" +
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

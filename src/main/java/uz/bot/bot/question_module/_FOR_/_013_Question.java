package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _013_Question {

    public static int power(int a, int n) {
        int sum = a;
        int temp = a;

        for (int i = 2; i <= n; i++) {
            temp = temp * 10 + a;
            sum = sum + temp;
        }
        return sum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = power(3, 5);
        s += "Test 1  (3, 5)  Kelgan javob  ";
        if (r_1 == 37035) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = power(5, 7);
        s += "\nTest 2  (5, 7).  Kelgan javob ";
        if (r_2 == 6172835) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = power(2, 4);
        s += "\nTest 3  (2, 4).  Kelgan javob ";
        if (r_3 == 2468) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a , n soni berilgan (a soni 1-9 o'rtasida )
        //  ketma ketlikni hisoblang
        // Masalan:
        // 1) a=7, n=5;
        // bunda (7 + 77 + 777 + 7777 + 77777 ) = 86415 (yig'indisi)
        System.out.println(new _013_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(13); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a , n sonlari berilgan (a soni 1-9 o'rtasida )\n" +
                "ketma ketlikni hisoblang.\n" +
                "Masalan:\n" +
                "1) a=7, n=5;\n" +
                "bunda (7 + 77 + 777 + 7777 + 77777 ) = 86415 (yig'indisi)\n\n" +
                "<code>   public static int power(int a, int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("n - daraja ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public static int power(int a, int n) {\n" +
                "        int sum = a;\n" +
                "        int temp = a;\n" +
                "\n" +
                "        for (int i = 2; i &lt;= n; i++) {\n" +
                "            temp = temp * 10 + a;\n" +
                "            sum = sum + temp;\n" +
                "        }\n" +
                "        return sum;\n" +
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
                "        int r_1 = power(3, 5);\n" +
                "        s += \"Test 1  (3, 5)  Kelgan javob  \";\n" +
                "        if (r_1 == 37035) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = power(5, 7);\n" +
                "        s += \"\\nTest 2  (5, 7).  Kelgan javob \";\n" +
                "        if (r_2 == 6172835) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = power(2, 4);\n" +
                "        s += \"\\nTest 3  (2, 4).  Kelgan javob \";\n" +
                "        if (r_3 == 2468) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD8gEAAmhmUEixs3DKgPWQtgI");
        return question;
    }

}

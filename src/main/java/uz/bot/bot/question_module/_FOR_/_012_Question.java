package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _012_Question {
    public int power(int a, int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) { // n darajani ham hisoblaymiz
            p = p * a;
        }
        return p;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = power(2, 5);
        s += "Test 1  (2,5)  Kelgan javob  ";
        if (r_1 == 32) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = power(3, 7);
        s += "\nTest 2  (3,7).  Kelgan javob ";
        if (r_2 == 2187) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = power(0, 8);
        s += "\nTest 3  (0,8).  Kelgan javob ";
        if (r_3 == 0) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a va n  sonlari berilgan
        // a sonini n chi darajasini hisoblaydigan dastur yozing

        System.out.println(new _012_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(12); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a, n  sonlari berilgan.\n" +
                "a sonini n chi darajasini hisoblaydigan dastur yozing\n " +
                " va hosil bo'lgan sonni return qiling.\n\n" +
                "<code>    public int power(int a, int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("n - daraja ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>   " +
                " public int power(int a, int n) {\n" +
                "        int p = 1;\n" +
                "        for (int i = 1; i &lt;= n; i++) { " +
                "         // n darajani ham hisoblaymiz\n" +
                "            p = p * a;\n" +
                "        }\n" +
                "        return p;\n" +
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
                "        int r_1 = power(2, 5);\n" +
                "        s += \"Test 1  (2,5)  Kelgan javob  \";\n" +
                "        if (r_1 == 32) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = power(3, 7);\n" +
                "        s += \"\\nTest 2  (3,7).  Kelgan javob \";\n" +
                "        if (r_2 == 2187) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = power(0, 8);\n" +
                "        s += \"\\nTest 3  (0,8).  Kelgan javob \";\n" +
                "        if (r_3 == 0) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD8QEAAmhmUEjXlHX2ueFlBAI");
        return question;
    }
}

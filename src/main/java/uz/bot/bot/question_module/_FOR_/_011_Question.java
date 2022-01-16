package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _011_Question {

    public int power(int a) {
        int p = 1;
        for (int i = 1; i <= 5; i++) { // 5 darajani ham hisoblaymiz
            p = p * a;
        }
        return p;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = power(2);
        s += "Test 1  (2)  Kelgan javob  ";
        if (r_1 == 32) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = power(5);
        s += "\nTest 2  (5).  Kelgan javob ";
        if (r_2 == 3125) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a soni berilgan
        // a sonini 5 chi darajasini hisoblab return qiladigan dastur yozing

        System.out.println(new _011_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(11); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a soni berilgan.\n" +
                "a sonini 5 chi darajasini hisoblab return " +
                "qiladigan dastur yozing.\n\n" +
                "<code>     public int power(int a) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("5 - daraja ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>    " +
                "public int power(int a) {\n" +
                "        int p = 1;\n" +
                "        for (int i = 1; i &lt;= 5; i++) { " +
                "         // 5 darajani ham hisoblaymiz\n" +
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
                "        int r_1 = power(2);\n" +
                "        s += \"Test 1  (2)  Kelgan javob  \";\n" +
                "        if (r_1 == 32) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = power(5);\n" +
                "        s += \"\\nTest 2  (5).  Kelgan javob \";\n" +
                "        if (r_2 == 3125) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD8AEAAmhmUEgMt1lHB5qFpgI");
        return question;
    }

}

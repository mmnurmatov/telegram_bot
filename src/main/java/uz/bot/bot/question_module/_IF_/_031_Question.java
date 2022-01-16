package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 24.01.2018.
 */
public class _031_Question {
    public int check(int a) {
        // masalan kelgan son 245;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;

        r1 = a % 10;  // shunda r1 = 5;
        a = a / 10; // a = 24;

        r2 = a % 10; // r2 = 4;
        a = a / 10; // a = 2;

        r3 = a; // r3 = 2;

        return r1 + r2 + r3; // 5 + 4 +2;

    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = check(245);
        s += "Test 1  (245)  Kelgan javob  ";
        if (r_1 == 11) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = check(123);
        s += "\nTest 2  (123).  Kelgan javob ";
        if (r_2 == 6) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a sonlari berilgan (2 yokiy 3 honali son)
        // masalan 245 ( raqamlar yig'indisini 2+4+5=9) raqamlar yig'indisini jo'nating
        System.out.println(new _031_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(31); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a sonni berilgan (2 yokiy 3 honali son).\n" +
                "Shu sonning raqamlar yig'indisini  return qiling. \n" +
                "masalan 245 ( raqamlar yig'indisini 2+4+5=9)\n\n" +
                "<code>  public int check(int a) {\n" +
                "\n" +
                "    }</code>");
        question.setTitle("raqamlar yig'indisi ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int check(int a) {\n" +
                "        // masalan kelgan son 245;\n" +
                "        int r1 = 0;\n" +
                "        int r2 = 0;\n" +
                "        int r3 = 0;\n" +
                "\n" +
                "        r1 = a % 10;  // shunda r1 = 5;\n" +
                "        a = a / 10; // a = 24;\n" +
                "\n" +
                "        r2 = a % 10; // r2 = 4;\n" +
                "        a = a / 10; // a = 2;\n" +
                "\n" +
                "        r3 = a; // r3 = 2;\n" +
                "\n" +
                "        return r1 + r2 + r3; // 5 + 4 +2;\n" +
                "\n" +
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
                "        int r_1 = check(245);\n" +
                "        s += \"Test 1  (245)  Kelgan javob  \";\n" +
                "        if (r_1 == 11) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = check(123);\n" +
                "        s += \"\\nTest 2  (123).  Kelgan javob \";\n" +
                "        if (r_2 == 6) {\n" +
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
        question.setAnswerVideoLink("BAADAgAD5wEAAmhmUEiZjZTWeLeoHwI");
        return question;
    }
}

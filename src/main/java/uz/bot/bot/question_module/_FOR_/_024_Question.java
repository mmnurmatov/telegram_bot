package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _024_Question {

    public int factorial(int n) {
        int f_1 = 1;
        int f_2 = 2;
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            sum = sum + f_1 + f_2;
            int tem = f_1;
            f_1 = f_2;
            f_2 = f_2 + tem;
        }
        return sum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = factorial(7);
        s += "Test 1  (7)  Kelgan javob  ";
        if (r_1 == 139) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = factorial(18);
        s += "\nTest 2  (10).  Kelgan javob ";
        if (r_2 == 28652) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n ,soni berilgan
        // betilgan birinchi n ta  fibanatchi ketma ketligining yig'indisini toping
        // Masalan: fibanachi:  0 1 2 3 5 8 13 ....


        System.out.println(new _024_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(24); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Berilgan birinchi n ta  fibanatchi\n" +
                "ketma ketligining yig'indisini toping.\n" +
                "Masalan: fibanachi:  0 1 2 3 5 8 13 .... \n\n" +
                "<code>  public int factorial(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("fibanatchi ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int factorial(int n) {\n" +
                "        int f_1 = 1;\n" +
                "        int f_2 = 2;\n" +
                "        int sum = 0;\n" +
                "\n" +
                "\n" +
                "        for (int i = 1; i &lt;= n; i++) {\n" +
                "            sum = sum + f_1 + f_2;\n" +
                "            int tem = f_1;\n" +
                "            f_1 = f_2;\n" +
                "            f_2 = f_2 + tem;\n" +
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
                "        int r_1 = factorial(7);\n" +
                "        s += \"Test 1  (7)  Kelgan javob  \";\n" +
                "        if (r_1 == 139) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = factorial(18);\n" +
                "        s += \"\\nTest 2  (10).  Kelgan javob \";\n" +
                "        if (r_2 == 28652) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgADoQEAAt2NUEjQ-rWpMpDRewI");
        return question;
    }

}

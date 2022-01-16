package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _021_Question {
    public int reverse(int n) {
        int temp;
        int reverseNum = 0;
        for (; true; ) {
            temp = n % 10;
            reverseNum = reverseNum * 10 + temp;

            n = n / 10;
            if (n == 0) {
                break;
            }
        }
        return reverseNum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = reverse(123);
        s += "Test 1  (123)  Kelgan javob  ";
        if (r_1 == 321) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = reverse(4531);
        s += "\nTest 2  (4531).  Kelgan javob ";
        if (r_2 == 1354) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = reverse(54321);
        s += "\nTest 3  (54321).  Kelgan javob ";
        if (r_3 == 12345) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n ,soni berilgan
        // shu sonni teskarisini toping
        // Masalan: n = 12345
        // uning teskarisi 54321;
        System.out.println(new _021_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(21); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml(" n soni berilgan.\n" +
                "Shu sonni teskarisini toping.\n" +
                "Masalan: n = 12345\n" +
                "uning teskarisi 54321; \n\n" +
                "<code>  public int reverse(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("raqamlar soni 3?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int reverse(int n) {\n" +
                "        int temp;\n" +
                "        int reverseNum = 0;\n" +
                "        for (; true; ) {\n" +
                "            temp = n % 10;\n" +
                "            reverseNum = reverseNum * 10 + temp;\n" +
                "\n" +
                "            n = n / 10;\n" +
                "            if (n == 0) {\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "        return reverseNum;\n" +
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
                "        int r_1 = reverse(123);\n" +
                "        s += \"Test 1  (123)  Kelgan javob  \";\n" +
                "        if (r_1 == 321) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = reverse(4531);\n" +
                "        s += \"\\nTest 2  (4531).  Kelgan javob \";\n" +
                "        if (r_2 == 1354) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = reverse(54321);\n" +
                "        s += \"\\nTest 3  (54321).  Kelgan javob \";\n" +
                "        if (r_3 == 12345) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD-wEAAmhmUEjjT7WxC33MfwI");
        return question;
    }

}

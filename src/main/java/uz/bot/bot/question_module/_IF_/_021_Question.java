package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _021_Question {

    public int min(int a, int b, int c) {
        int sum = a + b + c; // sonlarni yig'indisi
        int average = sum / 3; // o'rta qiymati
        return average;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = min(10, 10, 10);
        s += "Test 1  (10,10,10).  Kelgan javob  ";
        if (r_1 == 10) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = min(5, 2, 8);
        s += "\nTest 2  (5,2,8).  Kelgan javob ";
        if (r_2 == 5) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = min(14, 15, 1);
        s += "\nTest 3  (14,15,1).  Kelgan javob ";
        if (r_3 == 10) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = min(-7, -11, 0);
        s += "\nTest 4  (-7, -11,0).  Kelgan javob ";
        if (r_4 == -6) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Berilgan uchta sonning o'rtacha qiymatini hisoblovchi dastur yozing
        System.out.println(new _021_Question().testUserMethod());
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(21); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c sonlari berilgan.\n" +
                "Berilgan uchta sonning o'rtacha qiymatini \n" +
                " hisoblovchi dastur yozing \n " +
                " va shu sonni return qiling. \n\n" +
                "<code> public int min(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("o'rtacha qiymat ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int min(int a, int b, int c) {\n" +
                "        int sum = a + b + c; // sonlarni yig'indisi\n" +
                "        int average = sum / 3; // o'rta qiymati\n" +
                "        return average;\n" +
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
                "        int r_1 = min(10, 10, 10);\n" +
                "        s += \"Test 1  (10,10,10).  Kelgan javob  \";\n" +
                "        if (r_1 == 10) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = min(5, 2, 8);\n" +
                "        s += \"\\nTest 2  (5,2,8).  Kelgan javob \";\n" +
                "        if (r_2 == 5) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = min(14, 15, 1);\n" +
                "        s += \"\\nTest 3  (14,15,1).  Kelgan javob \";\n" +
                "        if (r_3 == 10) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = min(-7, -11, 0);\n" +
                "        s += \"\\nTest 4  (-7, -11,0).  Kelgan javob \";\n" +
                "        if (r_4 == -6) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD1QEAAt2NSEjphGgrkPCSbgI");
        return question;
    }

}

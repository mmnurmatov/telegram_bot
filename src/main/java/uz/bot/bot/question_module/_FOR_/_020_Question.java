package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _020_Question {
    public int sum(int n) {
        int sum = 0;
        for (; true; ) {
            sum += n % 10;
            n = n / 10;
            if (n == 0) {
                break;
            }
        }
        return sum;
        // aslida bu misolni while orqali ishlagan yaxshi edi.
        // lekin maqsadimiz for ni yaxshilab o'rganish.
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = sum(41);
        s += "Test 1  (41)  Kelgan javob  ";
        if (r_1 == 5) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = sum(123);
        s += "\nTest 2  (123).  Kelgan javob ";
        if (r_2 == 6) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = sum(4);
        s += "\nTest 3  (4).  Kelgan javob ";
        if (r_3 == 4) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = sum(54321);
        s += "\nTest 4  (54321).  Kelgan javob ";
        if (r_4 == 15) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muofaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n ,soni berilgan
        // shu sonni raqamlarini yig'indisini toping
        // oldingi misolda ishlatilmagan usulda !!!!
        System.out.println(new _020_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(20); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml(" n ,soni berilgan\n" +
                " shu sonni raqamlarini yig'indisini toping\n" +
                " oldingi misolda ishlatilmagan usulda !!!! \n\n" +
                "<code>  public int sum(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("raqamlar soni 3?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  public int sum(int n) {\n" +
                "        int sum = 0;\n" +
                "        for (; true; ) {\n" +
                "            sum += n % 10;\n" +
                "            n = n / 10;\n" +
                "            if (n == 0) {\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "        return sum;\n" +
                "        // aslida bu misolni while orqali ishlagan yaxshi edi.\n" +
                "        // lekin maqsadimiz for ni yaxshilab o'rganish.\n" +
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
                "        int r_1 = sum(41);\n" +
                "        s += \"Test 1  (41)  Kelgan javob  \";\n" +
                "        if (r_1 == 5) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = sum(123);\n" +
                "        s += \"\\nTest 2  (123).  Kelgan javob \";\n" +
                "        if (r_2 == 6) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = sum(4);\n" +
                "        s += \"\\nTest 3  (4).  Kelgan javob \";\n" +
                "        if (r_3 == 4) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = sum(54321);\n" +
                "        s += \"\\nTest 4  (54321).  Kelgan javob \";\n" +
                "        if (r_4 == 15) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muofaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD-gEAAmhmUEgCsYRGbQTMzAI");
        return question;
    }

}

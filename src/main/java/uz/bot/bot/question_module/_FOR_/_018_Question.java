package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _018_Question {

    public int count(int n) {
        int count = 0;
        for (int temp = n; temp != 0; temp = temp / 10) {
            count++;
        }
        return count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = count(13);
        s += "Test 1  (13)  Kelgan javob  ";
        if (r_1 == 2) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = count(356);
        s += "\nTest 2  (356).  Kelgan javob ";
        if (r_2 == 3) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = count(12345);
        s += "\nTest 3  (12345).  Kelgan javob ";
        if (r_3 == 5) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = count(3682591);
        s += "\nTest 4  (3682591).  Kelgan javob ";
        if (r_4 == 7) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n ,soni berilgan
        // shu sonni raqamlarini sonini aniqlang
        // misolni bitta for orqali ishlang
        System.out.println(new _018_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(18); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Shu sonni raqamlarini sonini aniqlang.\n" +
                "Misolni bitta for orqali ishlang. \n\n" +
                "<code>  public int count(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("raqamlar soni ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int count(int n) {\n" +
                "        int count = 0;\n" +
                "        for (int temp = n; temp != 0; temp = temp / 10) {\n" +
                "            count++;\n" +
                "        }\n" +
                "        return count;\n" +
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
                "        int r_1 = count(13);\n" +
                "        s += \"Test 1  (13)  Kelgan javob  \";\n" +
                "        if (r_1 == 2) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = count(356);\n" +
                "        s += \"\\nTest 2  (356).  Kelgan javob \";\n" +
                "        if (r_2 == 3) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = count(12345);\n" +
                "        s += \"\\nTest 3  (12345).  Kelgan javob \";\n" +
                "        if (r_3 == 5) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = count(3682591);\n" +
                "        s += \"\\nTest 4  (3682591).  Kelgan javob \";\n" +
                "        if (r_4 == 7) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD9gEAAmhmUEgAAfUIhexyGyQC");
        return question;
    }

}

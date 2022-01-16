package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _014_Question {

    public Boolean isPerfect(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }

        if (a == sum) {
            return true;
        } else {
            return false;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = isPerfect(6);
        s += "Test 1  (6)  Kelgan javob  ";
        if (r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = isPerfect(14);
        s += "\nTest 2  (14).  Kelgan javob ";
        if (!r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = isPerfect(28);
        s += "\nTest 3  (28).  Kelgan javob ";
        if (r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        Boolean r_4 = isPerfect(496);
        s += "\nTest 3  (496).  Kelgan javob ";
        if (r_4) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        Boolean r_5 = isPerfect(567);
        s += "\nTest 3  (567).  Kelgan javob ";
        if (!r_5) {
            s += " '" + r_5 + "' " + "  To'g'ri";
        } else {
            s += r_5 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a ,soni berilgan
        // shu son mukammal raqam yokiy yo'qmi shuni aniqlash
        // agar mukammal raqam bo'lsa true qayrasing
        // bo'lmasa false;
        // Maalan: (mukammal raqam) bo'linuvchilar  yig'indisida teng bo'ladigan son (o'zidan tahqari).
        // a = 6, uning bo'linuvchilari 1,2,3
        //  6 = 1 + 2 + 3   demak 6 ti raqami mukammal raqam hisoblanadi
        //

        System.out.println(new _014_Question().testUserMethod());
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(14); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml(" a soni berilgan.\n" +
                " Shu son mukammal raqam yokiy yo'qmi shuni aniqlang.\n" +
                " agar mukammal raqam bo'lsa true qayrasing\n" +
                " bo'lmasa false;\n" +
                " Maalan: (mukammal raqam) bo'linuvchilar \n " +
                " yig'indisiga teng bo'ladigan son (o'zidan tahqari).\n" +
                " a = 6, uning bo'linuvchilari 1,2,3\n" +
                " 6 = 1 + 2 + 3   demak 6 raqami murakkab raqam hisoblanadi\n\n" +
                "<code>   public Boolean isPerfect(int a) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle(" mukammal ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public Boolean isPerfect(int a) {\n" +
                "        int sum = 0;\n" +
                "        for (int i = 1; i &lt; a; i++) {\n" +
                "            if (a % i == 0) {\n" +
                "                sum = sum + i;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        if (a == sum) {\n" +
                "            return true;\n" +
                "        } else {\n" +
                "            return false;\n" +
                "        }\n" +
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
                "        Boolean r_1 = isPerfect(6);\n" +
                "        s += \"Test 1  (6)  Kelgan javob  \";\n" +
                "        if (r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = isPerfect(14);\n" +
                "        s += \"\\nTest 2  (14).  Kelgan javob \";\n" +
                "        if (!r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = isPerfect(28);\n" +
                "        s += \"\\nTest 3  (28).  Kelgan javob \";\n" +
                "        if (r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_4 = isPerfect(496);\n" +
                "        s += \"\\nTest 3  (496).  Kelgan javob \";\n" +
                "        if (r_4) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_5 = isPerfect(567);\n" +
                "        s += \"\\nTest 3  (567).  Kelgan javob \";\n" +
                "        if (!r_5) {\n" +
                "            s += \" '\" + r_5 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_5 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgADngEAAt2NUEjomvzBGmbbJwI");
        return question;
    }

}

package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _008_Question {

    public int sumBeetWeen(int a, int b) {
        int count = 0;
        int sum = 0;
        for (int i = a; i < b; i++) {
            if (i % 3 == 0) {
                count++; // buyerda count = count +1;  qilsak ham bo'ladi
                sum += i; // buyerda sum = sum + i;
            }
        }
        return sum + count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = sumBeetWeen(14, 26);
        s += "Test 1  (14,26)  Kelgan javob  ";
        if (r_1 == 82) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = sumBeetWeen(3, 52);
        s += "\nTest 2  (4, 81).  Kelgan javob ";
        if (r_2 == 476) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a va b sonlar berilgan
        //  a va b sonlar orasidagi 3 ga bo'linadigan sonlarni yig'indisi va sonini yig'indisini jo'nating

        System.out.println(new _008_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(8); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b sonlar berilgan.\n" +
                " a va b sonlar orasidagi 3 ga bo'linadigan \n" +
                "sonlarni yig'indisi va sonini yig'indisini return qiling. \n\n" +
                "<code>    public int sumBeetWeen(int a, int b) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("sonlar 3 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int sumBeetWeen(int a, int b) {\n" +
                "        int count = 0;\n" +
                "        int sum = 0;\n" +
                "        for (int i = a; i &lt; b; i++) {\n" +
                "            if (i % 3 == 0) {\n" +
                "                count++; \n" +
                "                sum += i; \n" +
                "            }\n" +
                "        }\n" +
                "        return sum + count;\n" +
                "    }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                " public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = sumBeetWeen(14, 26);\n" +
                "        s += \"Test 1  (14,26)  Kelgan javob  \";\n" +
                "        if (r_1 == 82) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = sumBeetWeen(3, 52);\n" +
                "        s += \"\\nTest 2  (4, 81).  Kelgan javob \";\n" +
                "        if (r_2 == 476) {\n" +
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
        question.setAnswerVideoLink("BAADAgADnAEAAt2NUEgrHORF6NAsyQI");
        return question;
    }
}

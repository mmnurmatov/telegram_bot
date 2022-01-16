package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _010_Question {
    public int positiveCount(int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = positiveCount(-1, 5);
        s += "Test 1  (-1, 5)  Kelgan javob  ";
        if (r_1 == 4) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = positiveCount(-23, 15);
        s += "\nTest 2  (-23, 15).  Kelgan javob ";
        if (r_2 == 14) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a va b sonlar berilgan
        //  a va b sonlar orasidagi musbat sonlar sonini toping

        System.out.println(new _010_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(10); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b sonlar berilgan.\n" +
                " a va b sonlari orasidagi musbat\n" +
                "sonlar sonini toping \n" +
                "va shuni return qiling. \n\n" +
                "<code>    public int countBeetWeen(int a, int b) {\n" +
                "       \n" +
                "    }</code>");
        question.setTitle("sonlar 3 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>   " +
                "public int positiveCount(int a, int b) {\n" +
                "        int count = 0;\n" +
                "        for (int i = a; i &lt; b; i++) {\n" +
                "            if (i &gt; 0) {\n" +
                "                count++;\n" +
                "            }\n" +
                "        }\n" +
                "        return count;\n" +
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
                "        int r_1 = positiveCount(-1, 5);\n" +
                "        s += \"Test 1  (-1, 5)  Kelgan javob  \";\n" +
                "        if (r_1 == 4) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = positiveCount(-23, 15);\n" +
                "        s += \"\\nTest 2  (-23, 15).  Kelgan javob \";\n" +
                "        if (r_2 == 14) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma muvaffaqiyatli muofaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgADnQEAAt2NUEhIBhFMpRv_UgI");
        return question;
    }
}

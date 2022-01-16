package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _006_Question {

    public int sumBeetWeen(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum = sum + i; // sum +=i;  qilsak ham bo'ladi
        }
        return sum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = sumBeetWeen(3, 9);
        s += "Test 1  (3,9)  Kelgan javob  ";
        if (r_1 == 33) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = sumBeetWeen(15, 66);
        s += "\nTest 2  (15, 66).  Kelgan javob ";
        if (r_2 == 2040) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a va b sonlar berilgan
        //  a va b sonlar orasidagi sonlar yig'indisini toping (a sonini inobatga oling)

        System.out.println(new _006_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(6); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b sonlar berilgan.\n" +
                " a va b sonlar orasidagi (butun) sonlar  \n" +
                "yig'indisini toping (a sonini inobatga oling)\n" +
                "va yig'indini return qiling\n\n" +
                "<code>    public int count(int a) {\n" +
                "       \n" +
                "    }</code>");
        question.setTitle("sonlar 2 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int sumBeetWeen(int a, int b) {\n" +
                "        int sum = 0;\n" +
                "        for (int i = a; i &lt; b; i++) {\n" +
                "            sum = sum + i; " +
                "            // sum +=i;  qilsak ham bo'ladi\n" +
                "        }\n" +
                "        return sum;\n" +
                "    } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                " public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = sumBeetWeen(3, 9);\n" +
                "        s += \"Test 1  (3,9)  Kelgan javob  \";\n" +
                "        if (r_1 == 33) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = sumBeetWeen(15, 66);\n" +
                "        s += \"\\nTest 2  (15, 66).  Kelgan javob \";\n" +
                "        if (r_2 == 2040) {\n" +
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
        question.setAnswerVideoLink("BAADAgAD7QEAAmhmUEhM3sxN56S9uAI");
        return question;
    }

}

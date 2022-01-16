package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _007_Question {

    public int countBeetWeen(int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                count++; // buyerda count = count +1;  qilsak ham bo'ladi
            }
        }
        return count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = countBeetWeen(7, 19);
        s += "Test 1  (7,19)  Kelgan javob  ";
        if (r_1 == 6) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = countBeetWeen(4, 81);
        s += "\nTest 2  (4, 81).  Kelgan javob ";
        if (r_2 == 39) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a va b sonlar berilgan
        //  a va b sonlar orasidagi juft  sonlarni sonini toping  (a sonini inobatga oling)

        System.out.println(new _007_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(7); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b sonlar berilgan\n" +
                " a va b sonlar orasidagi juft\n" +
                "sonlarni sonini toping  \n" +
                "(a sonini inobatga oling)\n\n" +
                "<code>   public int countBeetWeen(int a, int b) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("sonlar 2 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int countBeetWeen(int a, int b) {\n" +
                "        int count = 0;\n" +
                "        for (int i = a; i &lt; b; i++) {\n" +
                "            if (i % 2 == 0) {\n" +
                "                count++; \n" +
                "              // buyerda count = count +1;  qilsak ham bo'ladi\n" +
                "            }\n" +
                "        }\n" +
                "        return count;\n" +
                "    } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = countBeetWeen(7, 19);\n" +
                "        s += \"Test 1  (7,19)  Kelgan javob  \";\n" +
                "        if (r_1 == 6) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = countBeetWeen(4, 81);\n" +
                "        s += \"\\nTest 2  (4, 81).  Kelgan javob \";\n" +
                "        if (r_2 == 39) {\n" +
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
        question.setAnswerVideoLink("BAADAgAD7gEAAmhmUEjEFGPsk3M0rgI");
        return question;
    }
}

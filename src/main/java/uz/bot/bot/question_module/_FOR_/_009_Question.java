package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _009_Question {

    public int countBeetWeen(int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                // buyerda oddiy qilib 6 ga bo'linishini tekshirsak ham bo'lar edi.
                // 6 ga bo'lingan sonlarr 2 va 3 ga ham bo'linadi
                count++; // buyerda count = count +1;  qilsak ham bo'lad
            }
        }
        return count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = countBeetWeen(2, 9);
        s += "Test 1  (2,9)  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = countBeetWeen(14, 45);
        s += "\nTest 2  (14,45).  Kelgan javob ";
        if (r_2 == 5) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a va b sonlar berilgan
        //  a va b sonlar orasidagi 2 va 3 ga bo'linadigan sonlarning sonini jo'naring

        System.out.println(new _009_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(9); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b sonlar berilgan.\n" +
                " a va b sonlar orasidagi 2 va 3 ga " +
                "bo'linadigan sonlarning sonini return qiling. \n\n" +
                "<code>    public int countBeetWeen(int a, int b) {\n" +
                "       \n" +
                "    }</code>");
        question.setTitle("sonlar 3 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>   public int countBeetWeen(int a, int b) {\n" +
                "        int count = 0;\n" +
                "        for (int i = a; i &lt; b; i++) {\n" +
                "            if (i % 2 == 0 &&\n" +
                "                i % 3 == 0) {\n" +
                "                // buyerda oddiy qilib 6 ga bo'linishini\n" +
                "                // tekshirsak ham bo'lar edi.\n" +
                "                // 6 ga bo'lingan sonlar \n" +
                "                // 2 va 3 ga ham bo'linadi\n" +
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
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = countBeetWeen(2, 9);\n" +
                "        s += \"Test 1  (2,9)  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = countBeetWeen(14, 45);\n" +
                "        s += \"\\nTest 2  (14,45).  Kelgan javob \";\n" +
                "        if (r_2 == 5) {\n" +
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
        question.setAnswerVideoLink("BAADAgAD7wEAAmhmUEicKdEwFJMGywI");
        return question;
    }

}

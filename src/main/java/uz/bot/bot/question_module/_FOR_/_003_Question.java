package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _003_Question {

    public int sum(int a) {
        int sum = 0;
        // i = 0 ni hisobga olmasak ham bo'ladi
        for (int i = 1; i < a; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = sum(12);
        s += "Test 1  (12)  Kelgan javob  ";
        if (r_1 == 36) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = sum(27);
        s += "\nTest 2  (27).  Kelgan javob ";
        if (r_2 == 169) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a
        //  0 dam a gacha bo'lgan toq sonlar yig'indisini toping

        System.out.println(new _003_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(3); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a soni berilgan.\n" +
                "0 dam a gacha bo'lgan toq sonlar yig'indisini toping \n" +
                "va yig'indini return qiling.\n\n" +
                "<code>   public int sum(int a) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("toq sonlar yig'indisi ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                " public int sum(int a) {\n" +
                "        int sum = 0;\n" +
                "        // i = 0 ni hisobga olmasak ham bo'ladi\n" +
                "        for (int i = 1; i &lt; a; i++) {\n" +
                "            if(i % 2 == 1){\n" +
                "                sum = sum + i;\n" +
                "            }\n" +
                "        }\n" +
                "        return sum;\n" +
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
                "        int r_1 = sum(12);\n" +
                "        s += \"Test 1  (12)  Kelgan javob  \";\n" +
                "        if (r_1 == 36) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = sum(27);\n" +
                "        s += \"\\nTest 2  (27).  Kelgan javob \";\n" +
                "        if (r_2 == 169) {\n" +
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
        question.setAnswerVideoLink("BAADAgAD7AEAAmhmUEjoD53pKdUwbAI");
        return question;
    }
}

package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 25.01.2018.
 */
public class _005_Question {
    public int count(int a) {
        int count = 0;
        // i = 0 juft ham toq ham emas
        for (int i = 1; i < a; i++) {
            if (i % 2 == 0) {
                count = count + 1; // buyerda count++ qilsak ham bo'lar edi
            }
        }
        return count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = count(73);
        s += "Test 1  (73)  Kelgan javob  ";
        if (r_1 == 36) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = count(45);
        s += "\nTest 2  (45).  Kelgan javob ";
        if (r_2 == 22) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a
        //  0 dam a gacha bo'lgan juft sonlar soni toping

        System.out.println(new _005_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(5); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a soni berilgan.\n " +
                "0 dam a gacha bo'lgan\n" +
                "juft sonlar soni toping\n" +
                "va return qiling\n\n" +
                "<code>    public int count(int a) {\n" +
                "       \n" +
                "    }</code>");
        question.setTitle("juft sonlar ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                " public int count(int a) {\n" +
                "        int count = 0;\n" +
                "        // i = 0 juft ham toq ham emas\n" +
                "        for (int i = 1; i &lt; a; i++) {\n" +
                "            if (i % 2 == 0) {\n" +
                "                count = count + 1; \n" +
                "                // buyerda count++ qilsak ham bo'lar edi\n" +
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
                "        int r_1 = count(73);\n" +
                "        s += \"Test 1  (73)  Kelgan javob  \";\n" +
                "        if (r_1 == 36) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = count(45);\n" +
                "        s += \"\\nTest 2  (45).  Kelgan javob \";\n" +
                "        if (r_2 == 22) {\n" +
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
        question.setAnswerVideoLink("BAADAgADmgEAAt2NUEi3IBnGUR8fhAI");
        return question;
    }
}

package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _009_Question {

    public Boolean divisible(int a) {
        if (a % 3 == 0 && a % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = divisible(22);
        s += "Test 1  (22).  Kelgan javob  ";
        if (!r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = divisible(9);
        s += "\nTest 2  (9).  Kelgan javob ";
        if (!r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = divisible(12);
        s += "\nTest 3  (12).  Kelgan javob ";
        if (r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Berilgan son 3 va 4  ga bo'linadimi?
        System.out.println(new _009_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(9); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a soni berilgan. \n" +
                "Berilgan son 3 va 4  ga bo'linadimi? .\n" +
                "Agar bo'linsa true return qiling. \n" +
                "Agar bo'linmasa false return qiling.\n\n" +
                "<code>  public Boolean divisible(int a) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("3 va 4 ga bo'linadimi ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  public Boolean divisible(int a) {\n" +
                "        if (a % 3 == 0 && a % 4 == 0) {\n" +
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
                "        Boolean r_1 = divisible(22);\n" +
                "        s += \"Test 1  (22).  Kelgan javob  \";\n" +
                "        if (!r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = divisible(9);\n" +
                "        s += \"\\nTest 2  (9).  Kelgan javob \";\n" +
                "        if (!r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = divisible(12);\n" +
                "        s += \"\\nTest 3  (12).  Kelgan javob \";\n" +
                "        if (r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD0wEAAmhmUEhgZCmC_a1vDwI");
        return question;
    }
}

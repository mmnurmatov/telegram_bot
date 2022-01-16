package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _019_Question {

    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = min(3, 6);
        s += "Test 1  (3,6).  Kelgan javob  ";
        if (r_1 == 3) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = min(-4, 2);
        s += "\nTest 2  (-4,2).  Kelgan javob ";
        if (r_2 == -4) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = min(4, -5);
        s += "\nTest 3  (4, -5).  Kelgan javob ";
        if (r_3 == -5) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = min(-7, -11);
        s += "\nTest 4  (-7, -11).  Kelgan javob ";
        if (r_4 == -11) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Berilgan ikkita sondan minimum sonni toping;
        System.out.println(new _019_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(19); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b sonlari berilgan.\n" +
                "Berilgan ikkita sondan minimum sonni toping " +
                " va shu sonni return qiling. \n\n" +
                "<code>  public int min(int a, int b) {\n" +
                "       \n" +
                "    }</code>");
        question.setTitle("min ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int min(int a, int b) {\n" +
                "        if (a &lt; b) {\n" +
                "            return a;\n" +
                "        } else {\n" +
                "            return b;\n" +
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
                "        int r_1 = min(3, 6);\n" +
                "        s += \"Test 1  (3,6).  Kelgan javob  \";\n" +
                "        if (r_1 == 3) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = min(-4, 2);\n" +
                "        s += \"\\nTest 2  (-4,2).  Kelgan javob \";\n" +
                "        if (r_2 == -4) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = min(4, -5);\n" +
                "        s += \"\\nTest 3  (4, -5).  Kelgan javob \";\n" +
                "        if (r_3 == -5) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = min(-7, -11);\n" +
                "        s += \"\\nTest 4  (-7, -11).  Kelgan javob \";\n" +
                "        if (r_4 == -11) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD1AEAAt2NSEiRHHNiG8CfegI");
        return question;
    }
}

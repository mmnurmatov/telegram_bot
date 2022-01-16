package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _005_Question {


    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Trkshirish\n";

        int r_1 = max(5, 10);
        s += "Test 1  (5,10).  Kelgan javob  ";
        if (r_1 == 10) {
            s += " '10'  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = max(18, 12);
        s += "\nTest 2  (18,12).  Kelgan javob ";
        if (r_2 == 18) {
            s += " '18'  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = max(-1, 2);
        s += "\nTest 3  (-1,2).  Kelgan javob ";
        if (r_3 == 2) {
            s += " '2'  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = max(-4, -2);
        s += "\nTest 4  (-4,-2).  Kelgan javob ";
        if (r_4 == -2) {
            s += " '-2'  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Berilgan ikki ta sondan kattasini toping
        System.out.println(new _005_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(5); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml(" a va b sonlari berilgan. \n" +
                "Berilgan ikkita sondan kattasini return qiling.\n\n " +
                "<code>  public int max(int a, int b) {\n" +
                "        \n" +
                "    } </code>");
        question.setTitle("max");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> public int max(int a, int b) {\n" +
                "        if (a &gt; b) {\n" +
                "            return a;\n" +
                "        } else {\n" +
                "            return b;\n" +
                "        }\n" +
                "    } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "\n" + " public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = max(5, 10);\n" +
                "        s += \"Test 1  (5,10).  Kelgan javob  \";\n" +
                "        if (r_1 == 10) {\n" +
                "            s += \" '10'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = max(18, 12);\n" +
                "        s += \"\\nTest 2  (18,12).  Kelgan javob \";\n" +
                "        if (r_2 == 18) {\n" +
                "            s += \" '18'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = max(-1, 2);\n" +
                "        s += \"\\nTest 3  (-1,2).  Kelgan javob \";\n" +
                "        if (r_3 == 2) {\n" +
                "            s += \" '2'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = max(-4, -2);\n" +
                "        s += \"\\nTest 4  (-4,-2).  Kelgan javob \";\n" +
                "        if (r_4 == -2) {\n" +
                "            s += \" '-2'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgADzwEAAt2NSEhIp32Btfm1YAI");

        return question;
    }
}

package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 24.01.2018.
 */
public class _028_Question {

    public int check(int a, int b) {
        if (a > 0 && b > 0) {
            return 1;
        } else if (a < 0 && b < 0) {
            return 2;
        } else {
            return 3; // agar
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = check(3, 4);
        s += "Test 1  (3, 4)  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = check(-3, -1);
        s += "\nTest 2  (-3, -1).  Kelgan javob ";
        if (r_2 == 2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = check(-6, 4);
        s += "\nTest 3  (-6,4).  Kelgan javob ";
        if (r_3 == 3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a,b sonlar berilgan
        // agar ular ikkitasi ham musbat bo'lsa 1 ni jo'nating
        // gar ular ikkitasi ham manfiy bo'lsa 2 ni jo'nating
        // agar hohlagan bitta si musbat bo'lsa 3 ni jo'nating

        System.out.println(new _028_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(28); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b sonlar berilgan.\n" +
                "Agar ular ikkitasi ham musbat bo'lsa 1 ni return qiling.\n" +
                "Agar ular ikkitasi ham manfiy bo'lsa 2 ni return qiling.\n" +
                "Agar hohlagan bitta si musbat bo'lsa 3 ni return qiling.\n\n" +
                "<code>  public int check(int a, int b) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("musbat manfiy 2 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int check(int a, int b) {\n" +
                "        if (a &gt; 0 &amp;&amp;\n " +
                "            b &gt; 0) {\n" +
                "            return 1;\n" +
                "        } else if (a &lt; 0 &amp;&amp;\n" +
                "                   b &lt; 0) {\n" +
                "            return 2;\n" +
                "        } else {\n" +
                "            return 3;\n" +
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
                "        int r_1 = check(3, 4);\n" +
                "        s += \"Test 1  (3, 4)  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = check(-3, -1);\n" +
                "        s += \"\\nTest 2  (-3, -1).  Kelgan javob \";\n" +
                "        if (r_2 == 2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = check(-6, 4);\n" +
                "        s += \"\\nTest 3  (-6,4).  Kelgan javob \";\n" +
                "        if (r_3 == 3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD2gEAAt2NSEhEDPoT7czgWwI");
        return question;
    }
}

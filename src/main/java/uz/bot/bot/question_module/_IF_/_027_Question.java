package uz.gita.bot.question_module._IF_;


import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 24.01.2018.
 */
public class _027_Question {

    public Boolean check(int a, int b, int c, int d) {
        if (a > 5 && b > 5 && c > 5 && d > 5) {
            return true;
        } else {
            return false;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = check(3, 4, 7, 8);
        s += "Test 1  (3, 4, 7, 8)  Kelgan javob  ";
        if (!r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = check(19, 6, 9, 11);
        s += "\nTest 2  (19, 6, 9, 11).  Kelgan javob ";
        if (r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = check(177, -1, 44, 32);
        s += "\nTest 3  (177, -1, 44, 32).  Kelgan javob ";
        if (!r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a,b,c,d conlar berilgan
        // agar ular ning qiymati 5 dan katta bo'lsa true qaytaring
        // bo'lmasa false
        System.out.println(new _027_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(27); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c, d sonlar berilgan.\n" +
                "Agar ularning qiymati 5 dan katta bo'lsa true return qiling\n" +
                "bo'lmasa false return qiling. \n\n" +
                "<code>   public Boolean check(int a, int b, int c, int d) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("son 4 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>   " +
                "public Boolean check(int a, int b, int c, int d) {\n" +
                "        if (a &gt; 5 &amp;&amp; \n" +
                "            b &gt; 5 &amp;&amp;\n" +
                "            c &gt; 5 &amp;&amp; \n" +
                "            d &gt; 5) {\n" +
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
                "        Boolean r_1 = check(3, 4, 7, 8);\n" +
                "        s += \"Test 1  (3, 4, 7, 8)  Kelgan javob  \";\n" +
                "        if (!r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = check(19, 6, 9, 11);\n" +
                "        s += \"\\nTest 2  (19, 6, 9, 11).  Kelgan javob \";\n" +
                "        if (r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = check(177, -1, 44, 32);\n" +
                "        s += \"\\nTest 3  (177, -1, 44, 32).  Kelgan javob \";\n" +
                "        if (!r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD5AEAAmhmUEip16JYE4fy5QI");
        return question;
    }
}

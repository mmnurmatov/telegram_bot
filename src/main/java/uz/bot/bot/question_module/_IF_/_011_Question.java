package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _011_Question {

    public String check(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return "alpha";
        } else if (c >= '0' && c <= '9') {
            return "son";
        } else {
            return "other";
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        String r_1 = check('a');
        s += "Test 1  ('a').  Kelgan javob  ";
        if (r_1.equals("alpha")) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        String r_2 = check('2');
        s += "\nTest 2  ('2').  Kelgan javob ";
        if (r_2.equals("son")) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        String r_3 = check('P');
        s += "\nTest 3  ('J').  Kelgan javob ";
        if (r_3.equals("alpha")) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        String r_4 = check('{');
        s += "\nTest 4  ('?').  Kelgan javob ";
        if (r_4.equals("other")) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Check whether alphabet, Digit or special
        System.out.println(new _011_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(11); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("c char berilgan.\n" +
                "Berilgan  char Alfavit  yokiy raqam ekanligini aniqlang.\n" +
                "Agar alfavit bo'lsa 'alpha' ni return qiling, \n" +
                "Agar son bo'lsa 'son' ni return qiling.\n\n" +
                "<code> public String check(char c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("son yokiy alfavit ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public String check(char c) {\n" +
                "    if ( (c &gt;= 'a' && c &lt;= 'z') ||\n" +
                "         (c &gt;= 'A' && c &lt;= 'Z')){\n" +
                "          return \"alpha\";\n" +
                "      } else if (c &gt;= '0' && c &lt;= '9'){\n" +
                "          return \"son\";\n" +
                "      } else {\n" +
                "          return \"other\";\n" +
                "      }\n" +
                "  }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        String r_1 = check('a');\n" +
                "        s += \"Test 1  ('a').  Kelgan javob  \";\n" +
                "        if (r_1.equals(\"alpha\")) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_2 = check('2');\n" +
                "        s += \"\\nTest 2  ('2').  Kelgan javob \";\n" +
                "        if (r_2.equals(\"son\")) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_3 = check('P');\n" +
                "        s += \"\\nTest 3  ('J').  Kelgan javob \";\n" +
                "        if (r_3.equals(\"alpha\")) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_4 = check('{');\n" +
                "        s += \"\\nTest 4  ('?').  Kelgan javob \";\n" +
                "        if (r_4.equals(\"other\")) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD1AEAAmhmUEj8WyCahjcAAYYC");
        return question;
    }

}

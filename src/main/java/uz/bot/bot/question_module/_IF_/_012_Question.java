package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _012_Question {

    public String upperLowerCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return "lowerCase";
        } else if (c >= 'A' && c <= 'Z') {
            return "upperCase";
        } else {
            return "none";
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        String r_1 = upperLowerCase('q');
        s += "Test 1  ('q').  Kelgan javob  ";
        if (r_1.equals("lowerCase")) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        String r_2 = upperLowerCase('G');
        s += "\nTest 2  ('G').  Kelgan javob ";
        if (r_2.equals("upperCase")) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        String r_3 = upperLowerCase('?');
        s += "\nTest 3  ('?').  Kelgan javob ";
        if (r_3.equals("none")) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Check whether given charak ter is Uppar case or lower case
        System.out.println(new _012_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(12); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("c char berilgan.\n" +
                "Berilgan  char katta alfavit yokiy\n" +
                "kichik alfavit ekanlini aniqlang .\n" +
                "Agar alfavit kichik bo'lsa\n" +
                "'lowerCase' ni return qiling, \n" +
                "Agar alfavit katta bo'lsa\n" +
                "'upperCase' ni return qiling, \n" +
                "agar alfavit  bo'lmasa \n" +
                "'none' ni return qiling.\n\n" +
                "<code> public String upperLowerCase(char c) {\n" +
                "       \n" +
                "    }</code>");
        question.setTitle("katta kichik ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>" +
                "public String upperLowerCase(char c) {\n" +
                "   if (c &gt;= 'a' && c &lt;= 'z') {\n" +
                "         return \"lowerCase\";\n" +
                "      } else if (c &gt;= 'A' && c &lt;= 'Z') {\n" +
                "          return \"upperCase\";\n" +
                "      } else {\n" +
                "          return \"none\";\n" +
                "      }\n" +
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
                "        String r_1 = upperLowerCase('q');\n" +
                "        s += \"Test 1  ('q').  Kelgan javob  \";\n" +
                "        if (r_1.equals(\"lowerCase\")) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_2 = upperLowerCase('G');\n" +
                "        s += \"\\nTest 2  ('G').  Kelgan javob \";\n" +
                "        if (r_2.equals(\"upperCase\")) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_3 = upperLowerCase('?');\n" +
                "        s += \"\\nTest 3  ('?').  Kelgan javob \";\n" +
                "        if (r_3.equals(\"none\")) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD0gEAAt2NSEgyyL4Lck5pogI");
        return question;
    }

}

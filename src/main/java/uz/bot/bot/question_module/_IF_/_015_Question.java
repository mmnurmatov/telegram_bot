package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _015_Question {

    public Boolean isTriangle(int a, int b, int c) {

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            return true;
        } else {
            return false;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = isTriangle(5, 8, 12);
        s += "Test 1  (5,8,12).  Kelgan javob  ";
        if (r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = isTriangle(0, 9, 4);
        s += "\nTest 2  (0,9,4).  Kelgan javob ";
        if (!r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = isTriangle(0, 10, 17);
        s += "\nTest 3  (0, 10, 17).  Kelgan javob ";
        if (!r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        Boolean r_4 = isTriangle(10, 40, 45);
        s += "\nTest 4  (10, 40, 45).  Kelgan javob ";
        if (r_4) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Triangle is valid or not if sides given
        System.out.println(new _015_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(15); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml(" a,b,c sonlari berilgan .\n" +
                "Shu sonlar uchburchakning tomonlari\n" +
                "ekanligini aniqlang.\n" +
                "Agar kelgan sonlar uchburchakning tomonlari " +
                "bo'lsa ,true return qiling. \n " +
                "Bo'lmasa false return qiling .\n\n" +
                "<code>  public Boolean isTriangle(int a, int b, int c) {\n" +
                "\n" +
                "    }</code>");
        question.setTitle("uchburchak 2 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public Boolean isTriangle(int a, int b, int c) {\n" +
                "        if ( (a &lt; b + c) && \n" +
                "             (b &lt; a + c) && \n" +
                "             (c &lt; a + b)) {\n" +
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
                "        Boolean r_1 = isTriangle(5, 8, 12);\n" +
                "        s += \"Test 1  (5,8,12).  Kelgan javob  \";\n" +
                "        if (r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = isTriangle(0, 9, 4);\n" +
                "        s += \"\\nTest 2  (0,9,4).  Kelgan javob \";\n" +
                "        if (!r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = isTriangle(0, 10, 17);\n" +
                "        s += \"\\nTest 3  (0, 10, 17).  Kelgan javob \";\n" +
                "        if (!r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_4 = isTriangle(10, 40, 45);\n" +
                "        s += \"\\nTest 4  (10, 40, 45).  Kelgan javob \";\n" +
                "        if (r_4) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD1wEAAmhmUEhTFYuxRjbOUQI");
        return question;
    }
}

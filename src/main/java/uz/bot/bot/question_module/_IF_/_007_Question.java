package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _007_Question {

    public int positiveNegative(int a) {
        if (a > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = positiveNegative(5);
        s += "Test 1  (5).  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = positiveNegative(-13);
        s += "\nTest 2  (-13).  Kelgan javob ";
        if (r_2 == 0) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // sonning musbat yokiy  manfiy ligini aniqlash , musbat bo'lsa 1 return qilsin manfiy bo'lsa 0  return qilsin
        System.out.println(new _007_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(7); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a soni berilgan. \n" +
                "Sonning musbat yokiy  manfiy ligini aniqlang.\n" +
                "Agar musbat bo'lsa 1 return qiling. \n" +
                "Agar manfiy bo'lsa 0  return qiling.\n\n" +
                "<code> public int positiveNegative(int a) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("musbat / manfiy");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> public int positiveNegative(int a) {\n" +
                "        if (a &gt; 0) {\n" +
                "            return 1;\n" +
                "        } else {\n" +
                "            return 0;\n" +
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
                "        int r_1 = positiveNegative(5);\n" +
                "        s += \"Test 1  (5).  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = positiveNegative(-13);\n" +
                "        s += \"\\nTest 2  (-13).  Kelgan javob \";\n" +
                "        if (r_2 == 0) {\n" +
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
        question.setAnswerVideoLink("BAADAgAD0gEAAmhmUEjZEEQzRpWdkwI");
        return question;
    }
}

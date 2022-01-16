package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 24.01.2018.
 */
public class _025_Question {

    public int distance(int a) {
        if (a > 0) {
            // 0 dan katta bo'lsa o'zini jo'natamiz.
            return a;
        } else {
            // demak a manfiy. uni -1 ga ko'paytirib jo'natamiz;
            return -1 * a;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = distance(8);
        s += "Test 1  (8)  Kelgan javob  ";
        if (r_1 == 8) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = distance(-4);
        s += "\nTest 2  (-4).  Kelgan javob ";
        if (r_2 == 4) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Sonlar o'qida a nuqta berilgan
        // shu niqtadan 0 gacha bo'lgan masofani toping

        System.out.println(new _025_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(25); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("Sonlar o'qida a nuqta berilgan.\n" +
                "Shu nuqtadan 0 gacha bo'lgan masofani toping.\n\n" +
                "<code>  public int distance(int a) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("masofa 2 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int distance(int a) {\n" +
                "        if (a > 0) {\n" +
                "            // 0 dan katta bo'lsa o'zini jo'natamiz.\n" +
                "            return a;\n" +
                "        } else {\n" +
                "            // demak a manfiy. uni -1 ga ko'paytirib jo'natamiz;\n" +
                "            return -1 * a;\n" +
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
                "        int r_1 = distance(8);\n" +
                "        s += \"Test 1  (8)  Kelgan javob  \";\n" +
                "        if (r_1 == 8) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = distance(-4);\n" +
                "        s += \"\\nTest 2  (-4).  Kelgan javob \";\n" +
                "        if (r_2 == 4) {\n" +
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
        question.setAnswerVideoLink("BAADAgAD2AEAAt2NSEgU-2Jq1oj2zQI");
        return question;
    }
}

package uz.gita.bot.question_module._WHILE_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 15.02.2018.
 */
public class _003_Question {
    public int sum(int a) {
        int sum = 0;

        while (a != 0) {
            a--;
            sum += a;
        }
        return sum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = sum(10);
        s += "Test 1  (10)  Kelgan javob  ";
        if (r_1 == 45) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = sum(57);
        s += "\nTest 2  (57).  Kelgan javob ";
        if (r_2 == 1596) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }

    public static void main(String[] args) {
        // a
        //  0 dam a gacha bo'lgan sonlar yig'indisini toping

        System.out.println(new _003_Question().testUserMethod());
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(3); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.WHILE); //< QUESTION PARENT

        question.setQuestionContentHtml("a soni berilgan. " +
                "0 dam a gacha bo'lgan sonlar yig'indisini toping \n" +
                "va yig'indini return qiling.\n" +
                " a ni hisobga olmang. \n" +
                " Misolni while orqali ishlang. \n\n" +
                "<code>   public int sum(int a) {\n" +
                "        }\n" +
                "    }</code>");
        question.setTitle("yig'indi ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>" +
                "public int sum(int a) {\n" +
                "    int sum = 0;\n" +
                "    while (a != 0) {\n" +
                "        a--;\n" +
                "        sum += a;\n" +
                "    }\n" +
                "    return sum;\n" +
                " }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = sum(10);\n" +
                "        s += \"Test 1  (10)  Kelgan javob  \";\n" +
                "        if (r_1 == 45) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = sum(57);\n" +
                "        s += \"\\nTest 2  (57).  Kelgan javob \";\n" +
                "        if (r_2 == 1596) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgADCgIAAmhmUEjw2u5uReIz4gI");
        return question;
    }
}

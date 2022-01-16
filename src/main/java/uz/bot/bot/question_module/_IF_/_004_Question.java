package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _004_Question {

    public int whole(int a) {
        int n = a / 3;
        return n;
    }

    public String testUserMethod() {
        String s = "Code ni Trkshirish\n";

        int r_1 = whole(5);
        s += "Test 1  (a = 5).  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '1'  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = whole(18);
        s += "\nTest 2  (a = 18).  Kelgan javob ";
        if (r_2 == 6) {
            s += " '6'  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = whole(14);
        s += "\nTest 2  (a = 14).  Kelgan javob ";
        if (r_3 == 4) {
            s += " '4'  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // berilgan sonning 3 ga bo'lgandagi butun qismini toping
        System.out.println(new _004_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(4); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a soni berilgan.\n" +
                "Berilgan sonni 3 ga bo'lgandagi \n" +
                "butun qismini topib return qiling.\n\n " +
                "<code>   public int whole(int a) {\n" +
                "\n" +
                "    } </code>");
        question.setTitle("butun qsim");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  public int whole(int a) {\n" +
                "        int n = a / 3;\n" +
                "        return n;\n" +
                "    } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "\n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = whole(5);\n" +
                "        s += \"Test 1  (a = 5).  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '1'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = whole(18);\n" +
                "        s += \"\\nTest 2  (a = 18).  Kelgan javob \";\n" +
                "        if (r_2 == 6) {\n" +
                "            s += \" '6'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = whole(14);\n" +
                "        s += \"\\nTest 2  (a = 14).  Kelgan javob \";\n" +
                "        if (r_3 == 4) {\n" +
                "            s += \" '4'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgADyAEAAt2NSEjh6Vl2fgImVwI");
        return question;
    }
}

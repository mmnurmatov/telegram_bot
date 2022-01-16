package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _003_Question {

    public int remainder(int a) {
        int n = a % 2;
        return n;
    }

    public String testUserMethod() {
        String s = "Code ni Trkshirish\n";

        int r_1 = remainder(5);
        s += "Test 1  (a = 5).  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '1'  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = remainder(18);
        s += "\nTest 2  (a = 18).  Kelgan javob ";
        if (r_2 == 0) {
            s += " '0'  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // berilgan sonning 2 ga bo'lgandagi qoldig'ini return qiling

        System.out.println(new _003_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(3); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml(" a soni berilgan.\n " +
                "Berilgan sonning 2 ga bo'lgandagi \n" +
                "qoldig'i return qiling.\n\n " +
                "<code>  public int remainder(int a) {\n" +
                "\n" +
                "    } </code>");
        question.setTitle("qoldiq");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  public int remainder(int a) {\n" +
                "        int n = a % 2;\n" +
                "        return n;\n" +
                "    } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                        "\n" +
                        "        UserCodeThere \n" +
                        "\n" +
                        " public String testUserMethod() {\n" +
                        "        String s = \"Code ni Tekshirish\\n\";\n" +
                        "\n" +
                        "        int r_1 = remainder(5);\n" +
                        "        s += \"Test 1  (a = 5).  Kelgan javob  \";\n" +
                        "        if (r_1 == 1) {\n" +
                        "            s += \" '1'  To'g'ri\";\n" +
                        "        } else {\n" +
                        "            s += r_1 + \"   Xato \";\n" +
                        "            return s;\n" +
                        "        }\n" +
                        "\n" +
                        "        int r_2 = remainder(18);\n" +
                        "        s += \"\\nTest 2  (a = 18).  Kelgan javob \";\n" +
                        "        if (r_2 == 0) {\n" +
                        "            s += \" '0'  To'g'ri\";\n" +
                        "        } else {\n" +
                        "            s += r_2 + \"   Xato \";\n" +
                        "            return s;\n" +
                        "        }\n" +
                        "\n" +
                        "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                        "\n" +
                        "    }}"
        );
        question.setAnswerVideoLink("BAADAgADzgEAAmhmUEiM8ZLEMpUlZAI");

        return question;
    }
}

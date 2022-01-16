package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _015_Question {

    public int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = sum(5);
        s += "Test 1  (5)  Kelgan javob  ";
        if (r_1 == 55) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = sum(17);
        s += "\nTest 2  (17).  Kelgan javob ";
        if (r_2 == 1785) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = sum(3);
        s += "\nTest 3  (3).  Kelgan javob ";
        if (r_3 == 14) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n  soni berilgan
        // 1 4 9 16 ... n   shi ketma ketlikdagi sonlarni yiq'indisini  hisoblab return qiladigan
        //  dastur yozing.
        // Masalan n = 5
        // 1 + 4 + 9 + 16 + 25 = 55
        System.out.println(new _015_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(15); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml(" n  soni berilgan.\n" +
                "1 4 9 16 ... n   shu ketma ketlikdagi sonlarni yiq'indisini\n  " +
                "hisoblab return qiling. \n" +
                "Masalan n = 5\n" +
                "1 + 4 + 9 + 16 + 25 = 55\n\n" +
                "<code>  public int sum(int n) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("ketma ketlik ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int sum(int n) {\n" +
                "        int sum = 0;\n" +
                "        for (int i = 1; i &lt;= n; i++) {\n" +
                "            sum = sum + i * i;\n" +
                "        }\n" +
                "        return sum;\n" +
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
                "        int r_1 = sum(5);\n" +
                "        s += \"Test 1  (5)  Kelgan javob  \";\n" +
                "        if (r_1 == 55) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = sum(17);\n" +
                "        s += \"\\nTest 2  (17).  Kelgan javob \";\n" +
                "        if (r_2 == 1785) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = sum(3);\n" +
                "        s += \"\\nTest 3  (3).  Kelgan javob \";\n" +
                "        if (r_3 == 14) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD8wEAAmhmUEhBQsSRpmnBWAI");
        return question;
    }
}

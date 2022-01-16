package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _002_Question {

    public int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = min(new int[]{4, 2, 0, 6, 22, 8, 1});
        s += "Test 1  {4, 2, 1, 6, 22, 8, 1}  Kelgan javob  ";
        if (r_1 == 0) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = min(new int[]{44, 1, 8});
        s += "\nTest 2  {44, 1, 8} .  Kelgan javob ";
        if (r_2 == 1) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = min(new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});
        s += "\nTest 3  {4, 2, 5, 7, 1, 8, 12, 14, 8, -2}.  Kelgan javob ";
        if (r_3 == -1) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muofaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // array berilgan
        // o'sha massivdagi eng kichigini elementni toping
        // va return qiling
        System.out.println(new _002_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(2); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("Massive (array) berilgan.\n" +
                "O'sha massivdagi eng kichik elementni toping\n" +
                "va return qiling\n\n" +
                "<code>     public int min(int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle(" min ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>    " +
                "public int min(int array[]) {\n" +
                "    int min = array[0];\n" +
                "  for (int i = 1; i &lt; array.length; i++) {\n" +
                "      if (array[i] &lt; min) {\n" +
                "           min = array[i];\n" +
                "       }\n" +
                "    }\n" +
                "    return min;\n" +
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
                "        int r_1 = min(new int[]{4, 2, 0, 6, 22, 8, 1});\n" +
                "        s += \"Test 1  {4, 2, 1, 6, 22, 8, 1}  Kelgan javob  \";\n" +
                "        if (r_1 == 0) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = min(new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  {44, 1, 8} .  Kelgan javob \";\n" +
                "        if (r_2 == 1) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = min(new int[]{4, 2, 5, 7, -1, 8, 12, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  {4, 2, 5, 7, 1, 8, 12, 14, 8, -2}.  Kelgan javob \";\n" +
                "        if (r_3 == -1) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muofaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "    }}");
        return question;
    }
}

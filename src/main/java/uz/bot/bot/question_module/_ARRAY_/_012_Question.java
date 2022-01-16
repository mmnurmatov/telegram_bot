package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _012_Question {

    public int count(int n, int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }
        return count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = count(1, new int[]{1, 2, 1, 6, 22, 8, 1});
        s += "Test 1  (1,{1, 2, 1, 6, 22, 8, 1})  Kelgan javob  ";
        if (r_1 == 3) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = count(6, new int[]{44, 1, 8});
        s += "\nTest 2  (6,{44, 1, 8}) .  Kelgan javob ";
        if (r_2 == 0) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = count(2, new int[]{4, 2, 5, 7, 2, 8, 2, 14, 8, 2});
        s += "\nTest 3  (2,{4, 2, 5, 7, 2, 8, 2, 14, 8, 2}).  Kelgan javob ";
        if (r_3 == 4) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muofaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // n, array[] berilgan
        // Shu massivda nechta n soni borligini topib return qiling
        // masalan  n = 4 , array[2,4,6,4,]  buyerda   2 ta 4 raqami bor (2 ni return qilishingiz kerak)
        System.out.println(new _012_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(12); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("n, array[] berilgan.\n" +
                "Shu massivda nechta n soni borligini topib return qiling.\n" +
                "Masalan:  n = 4 , array[2,4,6,4,] \n" +
                "Buyerda   2 ta 4 raqami bor (2 ni return qilishingiz kerak)\n\n" +
                "<code>  public int count(int n, int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle(" son ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>\n " +
                "public int count(int n, int array[]) {\n" +
                "  int count = 0;\n" +
                "  for (int i = 0; i &lt; array.length; i++) {\n" +
                "     if (array[i] == n) {\n" +
                "        count++;\n" +
                "     }\n" +
                "   }\n" +
                "  return count;\n" +
                "}</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = count(1, new int[]{1, 2, 1, 6, 22, 8, 1});\n" +
                "        s += \"Test 1  (1,{1, 2, 1, 6, 22, 8, 1})  Kelgan javob  \";\n" +
                "        if (r_1 == 3) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = count(6, new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  (6,{44, 1, 8}) .  Kelgan javob \";\n" +
                "        if (r_2 == 0) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = count(2, new int[]{4, 2, 5, 7, 2, 8, 2, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  (2,{4, 2, 5, 7, 2, 8, 2, 14, 8, 2}).  Kelgan javob \";\n" +
                "        if (r_3 == 4) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muofaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "    }}");
        return question;
    }

}

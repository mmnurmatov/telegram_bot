package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 24.01.2018.
 */
public class _024_Question {

    public int distance(int a, int b) {
        // birinchi ulardan kattasini topamiz.
        if (a > b) {
            int c = a - b;
            return c; //  return a-b; desak ham bo'lar edi.)
        } else {
            return b - a;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = distance(8, 1);
        s += "Test 1  (8,1)  Kelgan javob  ";
        if (r_1 == 7) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = distance(1, 15);
        s += "\nTest 2  (1,15).  Kelgan javob ";
        if (r_2 == 14) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = distance(-3, 5);
        s += "\nTest 3  (-3,5).  Kelgan javob ";
        if (r_3 == 8) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = distance(3, -2);
        s += "\nTest 4  (3,-2).  Kelgan javob ";
        if (r_4 == 5) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        int r_5 = distance(-7, -1);
        s += "\nTest 4  (-7,-1).  Kelgan javob ";
        if (r_5 == 6) {
            s += " '" + r_5 + "' " + "  To'g'ri";
        } else {
            s += r_5 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Q 20;
        // Sonlar o'qida a,b sonlari berilgan ular
        // orasidagi masofani toping
        // masalan :(2,6)  bular orasidagi masofa 4
        //           (-2,6) bular orasidagi masofa 8 teng

        System.out.println(new _024_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(24); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("Sonlar o'qida a,b sonlari berilgan.\n" +
                "Ular orasidagi masofani toping.\n" +
                "Masalan : (2,6)  bular orasidagi masofa 4.\n" +
                "          (-2,6) bular orasidagi masofa 8 teng.\n\n" +
                "<code>  public int distance(int a, int b) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("masofa ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                " public int distance(int a, int b) {\n" +
                "        // birinchi ulardan kattasini topamiz.\n" +
                "        if (a &gt; b) {\n" +
                "            int c = a - b;\n" +
                "            return c; // return a-b; desak ham bo'lar edi.\n" +
                "        } else {\n" +
                "            return b - a;\n" +
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
                "        int r_1 = distance(8, 1);\n" +
                "        s += \"Test 1  (8,1)  Kelgan javob  \";\n" +
                "        if (r_1 == 7) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = distance(1, 15);\n" +
                "        s += \"\\nTest 2  (1,15).  Kelgan javob \";\n" +
                "        if (r_2 == 14) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = distance(-3, 5);\n" +
                "        s += \"\\nTest 3  (-3,5).  Kelgan javob \";\n" +
                "        if (r_3 == 8) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = distance(3, -2);\n" +
                "        s += \"\\nTest 4  (3,-2).  Kelgan javob \";\n" +
                "        if (r_4 == 5) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_5 = distance(-7, -1);\n" +
                "        s += \"\\nTest 4  (-7,-1).  Kelgan javob \";\n" +
                "        if (r_5 == 6) {\n" +
                "            s += \" '\" + r_5 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_5 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD4QEAAmhmUEgC-McwRgKRMQI");
        return question;
    }
}

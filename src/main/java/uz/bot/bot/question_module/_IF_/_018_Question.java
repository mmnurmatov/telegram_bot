package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _018_Question {

    public int pCount(int a, int b, int c) {
        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        return count;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = pCount(3, 6, 1);
        s += "Test 1  (3,6,1).  Kelgan javob  ";
        if (r_1 == 3) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = pCount(-4, 2, 9);
        s += "\nTest 2  (-4,2,9).  Kelgan javob ";
        if (r_2 == 2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = pCount(-1, 4, -5);
        s += "\nTest 3  (-1, 4, -5).  Kelgan javob ";
        if (r_3 == 1) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        int r_4 = pCount(-7, -11, -1);
        s += "\nTest 4  (-7, -11, -1).  Kelgan javob ";
        if (r_4 == 0) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Berilgan 3 ta sondan nechtasi musbat ekanligini aniqlovchi dastur yozing
        System.out.println(new _018_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(18); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml(" a, b, c sonlari berilgan.\n" +
                "Berilgan 3 ta sondan nechtasi musbat " +
                "ekanligini aniqlovchi dastur yozing.\n" +
                " va musbat sonlar sonini return qiling.\n\n" +
                "<code>  public int pCount(int a, int b, int c) {\n" +
                "\n" +
                "    }</code>");
        question.setTitle("nechtasi nusbat ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public int pCount(int a, int b, int c) {\n" +
                "        int count = 0;\n" +
                "        if (a > 0) {\n" +
                "            count++;\n" +
                "        }\n" +
                "        if (b > 0) {\n" +
                "            count++;\n" +
                "        }\n" +
                "        if (c > 0) {\n" +
                "            count++;\n" +
                "        }\n" +
                "        return count;\n" +
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
                "        int r_1 = pCount(3, 6, 1);\n" +
                "        s += \"Test 1  (3,6,1).  Kelgan javob  \";\n" +
                "        if (r_1 == 3) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = pCount(-4, 2, 9);\n" +
                "        s += \"\\nTest 2  (-4,2,9).  Kelgan javob \";\n" +
                "        if (r_2 == 2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = pCount(-1, 4, -5);\n" +
                "        s += \"\\nTest 3  (-1, 4, -5).  Kelgan javob \";\n" +
                "        if (r_3 == 1) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_4 = pCount(-7, -11, -1);\n" +
                "        s += \"\\nTest 4  (-7, -11, -1).  Kelgan javob \";\n" +
                "        if (r_4 == 0) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD2gEAAmhmUEiTBn06hmL3eQI");
        return question;
    }
}

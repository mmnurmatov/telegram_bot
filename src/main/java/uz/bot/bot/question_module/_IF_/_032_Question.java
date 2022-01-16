package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by BigMan on 24.01.2018.
 */
public class _032_Question {
    public int check(int a, int b, int c) {
        // masalan kelgan son 245;
        if (a > 0 && b > 0 && c > 0) {
            int son = a * 100 + b * 10 + c;
            // 2*100 + 4 *10 + 5;
            return son;
        } else {
            return 0;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = check(2, 4, 5);
        s += "Test 1  (2, 4, 5)  Kelgan javob  ";
        if (r_1 == 245) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = check(1, 2, 3);
        s += "\nTest 2  (1, 2, 3).  Kelgan javob ";
        if (r_2 == 123) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = check(7, 2, 5);
        s += "\nTest 3  (7, 2, 5).  Kelgan javob ";
        if (r_3 == 725) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }


        int r_4 = check(-3, 9, 4);
        s += "\nTest 2  (-3, 9, 4).  Kelgan javob ";
        if (r_4 == 0) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a,b,c sonlari berilgan shu sonlardan uch honali son yasang
        // masalan (3,6,2)  -> 362  va shuni qaytaring
        // agaar sonlardan hohlagan bittasi manfiy bo'lsa 0 ni qaytaring
        System.out.println(new _032_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(32); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b, c sonlari berilgan.\n" +
                "Shu sonlardan uch honali son yasang.\n" +
                "Masalan: (3,6,2)  -> 362  va shuni return qiling\n\n" +
                "<code>  public int check(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("son yasash ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int check(int a, int b, int c) {\n" +
                "      // masalan kelgan son 245;\n" +
                "      if (a &gt; 0 && b &gt; 0 && c &gt; 0) {\n" +
                "          int son = a * 100 + b * 10 + c;\n" +
                "          // 2*100 + 4 *10 + 5;\n" +
                "          return son;\n" +
                "      } else {\n" +
                "          return 0;\n" +
                "      }\n" +
                "   }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = check(2, 4, 5);\n" +
                "        s += \"Test 1  (2, 4, 5)  Kelgan javob  \";\n" +
                "        if (r_1 == 245) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = check(1, 2, 3);\n" +
                "        s += \"\\nTest 2  (1, 2, 3).  Kelgan javob \";\n" +
                "        if (r_2 == 123) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = check(7, 2, 5);\n" +
                "        s += \"\\nTest 3  (7, 2, 5).  Kelgan javob \";\n" +
                "        if (r_3 == 725) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        int r_4 = check(-3, 9, 4);\n" +
                "        s += \"\\nTest 2  (-3, 9, 4).  Kelgan javob \";\n" +
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
        question.setAnswerVideoLink("BAADAgADlgEAAt2NUEgWMWpWKKeW9AI");
        return question;
    }
}

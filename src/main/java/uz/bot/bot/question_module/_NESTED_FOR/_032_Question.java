package uz.gita.bot.question_module._NESTED_FOR;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _032_Question {

    public int palindromRange(int a, int b) {
        int count = 0; // palindrom sonlarni soni
        for (int i = a; i <= b; i++) {
            int temp = i;
            int reverseNum = 0;

            while (temp != 0) {
                reverseNum = reverseNum * 10 + temp % 10;
                temp = temp / 10;
            }

            if (i == reverseNum) {
                count++;
            }
        }
        return count;
    }


    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = palindromRange(10, 20);
        s += "Test 1  (10, 20)  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = palindromRange(10, 100);
        s += "\nTest 2  (10, 100).  Kelgan javob ";
        if (r_2 == 9) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = palindromRange(54, 255);
        s += "\nTest 3  (54, 255).  Kelgan javob ";
        if (r_3 == 21) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a , b sonlari berilgan (a,b eng kamida ikki honali son)
        // a dan b gacha bo'lgan palindrom sonlarni sonini aniqlab return qiling
        System.out.println(new _032_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(32); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("a, b sonlari berilgan. \n" +
                "(a, b eng kamida ikki honali son)\n" +
                "a dan b gacha bo'lgan palindrom sonlarni \n" +
                "sonini aniqlab return qiling.\n\n" +
                "<code>  public int palindromRange(int a, int b) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("oraliqdagi palindrom");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int palindromRange(int a, int b) {\n" +
                "   int count = 0; // palindrom sonlarni soni\n" +
                "   for (int i = a; i &lt;= b; i++) {\n" +
                "        int temp = i;\n" +
                "        int reverseNum = 0;\n" +
                "       while (temp != 0) {\n" +
                "          reverseNum = reverseNum * 10 + temp % 10;\n" +
                "           temp = temp / 10;\n" +
                "        }\n" +
                "        if (i == reverseNum) {\n" +
                "            count++;\n" +
                "        }\n" +
                "   }\n" +
                "   return count;\n" +
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
                "        int r_1 = palindromRange(10, 20);\n" +
                "        s += \"Test 1  (10, 20)  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = palindromRange(10, 100);\n" +
                "        s += \"\\nTest 2  (10, 100).  Kelgan javob \";\n" +
                "        if (r_2 == 9) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = palindromRange(54, 255);\n" +
                "        s += \"\\nTest 3  (54, 255).  Kelgan javob \";\n" +
                "        if (r_3 == 21) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        return question;
    }
}

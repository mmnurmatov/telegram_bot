package uz.gita.bot.question_module._WHILE_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _001_Question {

    public Boolean reverse(int n) {
        int temp = n;
        int reverseNum = 0;

        while (n != 0) {
            reverseNum = reverseNum * 10 + n % 10;
            n = n / 10;
        }
        if (temp == reverseNum) {
            return true;
        }

        return false;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = reverse(123);
        s += "Test 1  (123)  Kelgan javob  ";
        if (!r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = reverse(1221);
        s += "\nTest 2  (1221).  Kelgan javob ";
        if (r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = reverse(2341432);
        s += "\nTest 3  (2341432).  Kelgan javob ";
        if (r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }
        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // n ,soni berilgan
        // berilgan son palindrome  ekanligini aniqlang
        // Masalan: n = 12321 ( chap tomondan va o'ng tomondan o'qisa ham birhil bo'lishi kerak)
        // misolni while orqali ishlang
        System.out.println(new _001_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(1); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.WHILE); //< QUESTION PARENT

        question.setQuestionContentHtml(" n ,soni berilgan.\n" +
                "Berilgan son palindrome  ekanligini aniqlang.\n" +
                "Masalan: n = 12321\n" +
                "( chap tomondan va o'ng tomondan o'qisa ham \n" +
                "birhil bo'lishi kerak)." +
                "Misolni while orqali ishlang." +
                "<code>   public int sum(int a) {\n" +
                "        }\n" +
                "    }</code>");
        question.setTitle(" palindrom ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public Boolean reverse(int n) {\n" +
                "    int temp = n;\n" +
                "    int reverseNum = 0;\n" +
                "    while (n != 0) {\n" +
                "       reverseNum = reverseNum * 10 + n % 10;\n" +
                "        n = n / 10;\n" +
                "    }\n" +
                "    if (temp == reverseNum) {\n" +
                "        return true;\n" +
                "    }\n" +
                "     return false;\n" +
                " } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        Boolean r_1 = reverse(123);\n" +
                "        s += \"Test 1  (123)  Kelgan javob  \";\n" +
                "        if (!r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = reverse(1221);\n" +
                "        s += \"\\nTest 2  (1221).  Kelgan javob \";\n" +
                "        if (r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = reverse(2341432);\n" +
                "        s += \"\\nTest 3  (2341432).  Kelgan javob \";\n" +
                "        if (r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgADCQIAAmhmUEjmqqzrmgsUOwI");
        return question;
    }
}

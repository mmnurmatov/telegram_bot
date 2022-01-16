package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 27.01.2018.
 */
public class _022_Question {
    public Boolean reverse(int n) {
        int num = n;
        int temp;
        int reverseNum = 0;
        for (; true; ) {
            temp = num % 10;
            reverseNum = reverseNum * 10 + temp;

            num = num / 10;
            if (num == 0) {
                break;
            }
        }
        // biz bu misolda n ning teskarisini topamiz
        // agar n == n ning teskarisiga teng bo'lsa demak u palindrome;
        // Masalan  13131 = 13131 palindrome
        // agar 1234 = 4321 bu palindrom emas

        if (n == reverseNum) {
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
        // bu misolni while orqali ishlash yaxshiroq edi
        // lekin forni o'rganish uchun
        System.out.println(new _022_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(22); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("n soni berilgan.\n" +
                "Berilgan son palindrome  ekanligini aniqlang.\n" +
                "Masalan: n = 12321 ( chap tomondan va o'ng \n" +
                "Tomondan o'qisa ham birhil bo'lishi kerak)\n" +
                "Bu misolni while orqali ishlash yaxshiroq edi\n" +
                "lekin forni o'rganish uchun. \n\n" +
                "<code>  public Boolean reverse(int n) {\n" +
                "      \n" +
                "    }</code>");
        question.setTitle("raqamlar soni 3?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                " public Boolean reverse(int n) {\n" +
                "        int num = n;\n" +
                "        int temp;\n" +
                "        int reverseNum = 0;\n" +
                "        for (; true; ) {\n" +
                "            temp = num % 10;\n" +
                "            reverseNum = reverseNum * 10 + temp;\n" +
                "\n" +
                "            num = num / 10;\n" +
                "            if (num == 0) {\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "        // biz bu misolda n ning teskarisini topamiz\n" +
                "        // agar n == n ning teskarisiga teng bo'lsa " +
                "        // demak u palindrome;\n" +
                "        // Masalan  13131 = 13131 palindrome\n" +
                "        // agar 1234 = 4321 bu palindrom emas\n" +
                "\n" +
                "        if (n == reverseNum) {\n" +
                "            return true;\n" +
                "        }\n" +
                "\n" +
                "        return false;\n" +
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
        question.setAnswerVideoLink("BAADAgADoAEAAt2NUEgHDkgGIHEqKAI");
        return question;
    }
}

package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 09.02.2018.
 */
public class _022_Question {

    public Boolean check(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }


    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        Boolean r_1 = check(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
        s += "Test 1  ({1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6})  Kelgan javob  ";
        if (r_1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        Boolean r_2 = check(new int[]{4, 6, 1, 6, 8}, new int[]{44, 1, 8});
        s += "\nTest 2  ({4, 6, 1, 6, 8}, {44, 1, 8}) .  Kelgan javob ";
        if (!r_2) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        Boolean r_3 = check(new int[]{4, 5, 3, 2, 5}, new int[]{4, 5, 3, 2, 5});
        s += "\nTest 3  ({4, 5, 3, 2, 5}, {4, 5, 3, 2, 5}).  Kelgan javob ";
        if (r_3) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // a[], b[] massivlari berilgan
        // shu massivlarni o'zaro teng ekanligini aniqlang
        // agar ular teng bo'lsa true
        // bo'lmasa false qaytaring
        System.out.println(new _022_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(22); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("int a[], int b[] massivlari berilgan.\n" +
                "shu massivlarni o'zaro teng ekanligini aniqlang.\n" +
                "agar ular teng bo'lsa true.\n" +
                "bo'lmasa false qaytaring.\n\n" +
                "<code>   public Boolean check(int a[], int b[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle(" massivlar ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>" +
                "public Boolean check(int a[], int b[]) {\n" +
                "    for (int i = 0; i &lt; a.length; i++) {\n" +
                "         if (a[i] != b[i]) {\n" +
                "            return false;\n" +
                "        }\n" +
                "    }\n" +
                "  return true;\n" +
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
                "        Boolean r_1 = check(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});\n" +
                "        s += \"Test 1  ({1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6})  Kelgan javob  \";\n" +
                "        if (r_1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_2 = check(new int[]{4, 6, 1, 6, 8}, new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  ({4, 6, 1, 6, 8}, {44, 1, 8}) .  Kelgan javob \";\n" +
                "        if (!r_2) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        Boolean r_3 = check(new int[]{4, 5, 3, 2, 5}, new int[]{4, 5, 3, 2, 5});\n" +
                "        s += \"\\nTest 3  ({4, 5, 3, 2, 5}, {4, 5, 3, 2, 5}).  Kelgan javob \";\n" +
                "        if (r_3) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "    }}");
        return question;
    }


}

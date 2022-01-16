package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _016_Question {

    public String isTriangle(int a, int b, int c) {
        if (a == b && b == c) { // teng tomonli
            return "equilateral";
        } else if (a == b || b == c || c == a) { // teng yonli
            return "isosceles";
        } else { // ixtiyoriy
            return "scalene";
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        String r_1 = isTriangle(5, 8, 12);
        s += "Test 1  (5,8,12).  Kelgan javob  ";
        if (r_1.equals("scalene")) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        String r_2 = isTriangle(4, 9, 4);
        s += "\nTest 2  (4,9,4).  Kelgan javob ";
        if (r_2.equals("isosceles")) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        String r_3 = isTriangle(8, 10, 17);
        s += "\nTest 3  (8, 10, 17).  Kelgan javob ";
        if (r_3.equals("scalene")) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        String r_4 = isTriangle(10, 10, 10);
        s += "\nTest 4  (10, 10, 10).  Kelgan javob ";
        if (r_4.equals("equilateral")) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Uchburchakning 3 ta tomoni berilgan
        // shunda uchburkach ning qanday ekanligini aniqlang
        // equilateral - teng tomonli
        // isosceles  - teng yonli
        // scalene  ixtiyoriy
        System.out.println(new _016_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(16); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml(" a,b,c sonlari berilgan\n" +
                "Uchburchakning 3 ta tomoni berilgan.\n" +
                "Uchburkach ning shakli qanday ekanligini aniqlang.\n" +
                "Agar teng tomonli bo'lsa  'equilateral' return qiling.\n" +
                "Agar teng yonli bo'lsa  'isosceles' return qiling.\n" +
                "Agar ixtiyoriy  bo'lsa  'scalene'  return qiling.\n\n" +
                "<code> public String isTriangle(int a, int b, int c) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("uchburchak 3 ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> " +
                "public String isTriangle(int a, int b, int c) {\n" +
                "        if (a == b && \n" +
                "            b == c) { // teng tomonli\n" +
                "            return \"equilateral\";\n" +
                "        } else if (a == b || \n" +
                "                   b == c || \n" +
                "                   c == a) { // teng yonli\n" +
                "            return \"isosceles\";\n" +
                "        } else { // ixtiyoriy\n" +
                "            return \"scalene\";\n" +
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
                "        String r_1 = isTriangle(5, 8, 12);\n" +
                "        s += \"Test 1  (5,8,12).  Kelgan javob  \";\n" +
                "        if (r_1.equals(\"scalene\")) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_2 = isTriangle(4, 9, 4);\n" +
                "        s += \"\\nTest 2  (4,9,4).  Kelgan javob \";\n" +
                "        if (r_2.equals(\"isosceles\")) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_3 = isTriangle(8, 10, 17);\n" +
                "        s += \"\\nTest 3  (8, 10, 17).  Kelgan javob \";\n" +
                "        if (r_3.equals(\"scalene\")) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_4 = isTriangle(10, 10, 10);\n" +
                "        s += \"\\nTest 4  (10, 10, 10).  Kelgan javob \";\n" +
                "        if (r_4.equals(\"equilateral\")) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD2QEAAmhmUEioYSxLVbmVCQI");
        return question;
    }
}

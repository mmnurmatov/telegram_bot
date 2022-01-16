package uz.gita.bot.question_module._IF_;


import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _001_Question {

    public _001_Question() {

    }

    public String oddEven(int a) {
        if (a % 2 == 0) {
            return "juft";
        } else {
            return "toq";
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        String r_1 = oddEven(5);
        s += "Test 1  (a = 5)  Kelgan javob  ";
        if (r_1.equals("toq")) {
            s += " '" + r_1 + "'  To'g'ri";
        } else {
            s += " '" + r_1 + "' Xato";
            return s;
        }

        String r_2 = oddEven(8);
        s += "\nTest 2  (a = 8) Kelgan javob   ";
        if (r_2.equals("juft")) {
            s += " '" + r_2 + "'  To'g'ri";
        } else {
            s += " '" + r_2 + "' Xato";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }


    public static void main(String[] args) {
        // Sonning juft yoki toqligini aniqlang
        // agar  juft bo'lsa 'juft' so'zini qaytaring
        // agar toq bo'lsa 'toq' so'zini qaytaring
        System.out.println(new _001_Question().testUserMethod());
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(1); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("Sonning juft yoki toqligini aniqlang.\n" +
                "Agar  juft bo'lsa 'juft' so'zini return qiling.\n" +
                "Agar toq bo'lsa 'toq' so'zini return qiling. \n\n" +
                "<code> public String oddEven(int a) {\n" +
                "\n" +
                "    } </code>"
        );
        question.setTitle("toq yoki juft son");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> public String oddEven(int a) {\n" +
                "        if (a % 2 == 0) {\n" +
                "            return \"juft\";\n" +
                "        } else {\n" +
                "            return \"toq\";\n" +
                "        }\n" +
                "    } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "\n" +
                " public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        String r_1 = oddEven(5);\n" +
                "        s += \"Test 1  (a = 5)  Kelgan javob  \";\n" +
                "        if (r_1.equals(\"toq\")) {\n" +
                "            s += \" 'toq'  To'g'ri.\";\n" +
                "        } else {\n" +
                "            s += \" 'juft' Xato.\";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_2 = oddEven(8);\n" +
                "        s += \"\\nTest 2  (a = 8)  Kelgan javob  \";\n" +
                "        if (r_2.equals(\"juft\")) {\n" +
                "            s += \" 'juft'  To'g'ri.\";\n" +
                "        } else {\n" +
                "            s += \" 'toq' Xato.\";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");

        question.setAnswerVideoLink("BAADAgADuwEAAt2NSEgDspD1a9GrwQI");
        return question;

    }

}

package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 20.01.2018.
 */
public class _002_Question {

    public _002_Question() {

    }


    public int son(int a) {
        if (a > 10) {
            return a + 3;
        } else if (a < 10) {
            return a * 2;
        } else {
            return 22;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Trkshirish\n";

        int r_1 = son(3);
        s += "Test 1  (a = 3).  Kelgan javob  ";
        if (r_1 == 6) {
            s += " '6'  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = son(18);
        s += "\nTest 2  (a = 18).  Kelgan javob ";
        if (r_2 == 21) {
            s += " '21'  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = son(10);
        s += "\nTest 3  (a = 10).  Kelgan javob ";
        if (r_3 == 22) {
            s += " '22'  To'g'ri";
        } else {
            s += r_3 + " Xato ";
            return s;
        }


        int r_4 = son(-1);
        s += "\nTest 4  (a = -1).  Kelgan javob ";
        if (r_4 == -2) {
            s += " '-2'  To'g'ri";
        } else {
            s += r_4 + " Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }


    public static void main(String[] args) {
        //  berilgan son 10 dan katta bo'lsa unga 3 ni qo'shib  return qiling
        //  agar 10 dan kichik bo'lsa 2 ga ko'paytirib yuborsin
        //  agar 10 teng bo'lsa  22 sonini jo'natsin
        System.out.println(new _002_Question().testUserMethod());
    }


    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(2); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("Berilgan son 10 dan katta bo'lsa unga 3 ni qo'shib  return qiling.\n" +
                        "Agar 10 dan kichik bo'lsa 2 ga ko'paytirib return qiling.\n" +
                        "Agar 10 teng bo'lsa  22 sonini return qiling.\n\n" +
                        "<code>  public int son(int a) {\n" +
                        "        \n" +
                        "    } </code>"
        );
        question.setTitle("katta kichik");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  public int son(int a) {\n" +
                "        if (a &gt; 10) {\n" +
                "            return a + 3;\n" +
                "        } else if (a &lt; 10) {\n" +
                "            return a * 2;\n" +
                "        } else {\n" +
                "            return 22;\n" +
                "        }\n" +
                "    } </code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "\n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        int r_1 = son(3);\n" +
                "        s += \"Test 1  (a = 3).  Kelgan javob  \";\n" +
                "        if (r_1 == 6) {\n" +
                "            s += \" '6'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = son(18);\n" +
                "        s += \"\\nTest 2  (a = 18).  Kelgan javob \";\n" +
                "        if (r_2 == 21) {\n" +
                "            s += \" '21'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = son(10);\n" +
                "        s += \"\\nTest 3  (a = 10).  Kelgan javob \";\n" +
                "        if (r_3 == 22) {\n" +
                "            s += \" '22'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \" Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        int r_4 = son(-1);\n" +
                "        s += \"\\nTest 4  (a = -1).  Kelgan javob \";\n" +
                "        if (r_4 == -2) {\n" +
                "            s += \" '-2'  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \" Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgADzQEAAmhmUEhK0TVt3VV-DAI");
        return question;

    }

}

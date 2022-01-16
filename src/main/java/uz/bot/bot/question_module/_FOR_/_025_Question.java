package uz.gita.bot.question_module._FOR_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 03.02.2018.
 */
public class _025_Question {

    public void albhabets() {
        System.out.println("Ingliz tili alifbosi:");

        // Barcha ishoralar
//        for (int i = 0; i <= 255; i++) {
//            System.out.format("%1$-5d", i);
////            System.out.println((char) i);
//            System.out.format("%1$-2c", (char) i);
//            System.out.println();
//        }


        /**  KATTA_HARFLAR  */
        // A = 65 ....... B = 90 (1- uchul)
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%c\n", i);
        }
        // (1- uchul)
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }

        /* KICHIK_HARFLAR */
        // a = 97 ....... b = 122 (1- uchul)
        for (int i = 97; i <= 122; i++) {
            System.out.println((char) i);
        }
        // (1- uchul)
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        // for orqali ingliz tili alifbosini ekranga chiqaradigan dastur yozing
        new _025_Question().albhabets();
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(25); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.FOR); //< QUESTION PARENT

        question.setQuestionContentHtml("for orqali ingliz tili alifbosini.\n " +
                "ekranga chiqaradigan dastur yozing \n\n" +
                "<code>  public void albhabets() {\n" +
                "\n" +
                "    }</code>");
        question.setTitle("alifbo ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                " public void albhabets() {\n" +
                "        System.out.println(\"Ingliz tili alifbosi:\");\n" +
                "\n" +
                "        // Barcha ishoralar\n" +
                "//        for (int i = 0; i &lt;= 255; i++) {\n" +
                "//            System.out.format(\"%1$-5d\", i);\n" +
                "////            System.out.println((char) i);\n" +
                "//            System.out.format(\"%1$-2c\", (char) i);\n" +
                "//            System.out.println();\n" +
                "//        }\n" +
                "\n" +
                "\n" +
                "        /**  KATTA_HARFLAR  */\n" +
                "        // A = 65 ....... B = 90 (1- uchul)\n" +
                "        for (int i = 65; i &lt;= 90; i++) {\n" +
                "            System.out.printf(\"%c\\n\", i);\n" +
                "        }\n" +
                "        // (1- uchul)\n" +
                "        for (char c = 'A'; c &lt;= 'Z'; c++) {\n" +
                "            System.out.println(c);\n" +
                "        }\n" +
                "\n" +
                "        /* KICHIK_HARFLAR */\n" +
                "        // a = 97 ....... b = 122 (1- uchul)\n" +
                "        for (int i = 97; i &lt;= 122; i++) {\n" +
                "            System.out.println((char) i);\n" +
                "        }\n" +
                "        // (1- uchul)\n" +
                "        for (char i = 'a'; i &lt;= 'z'; i++) {\n" +
                "            System.out.println(i);\n" +
                "        }\n" +
                "\n" +
                "    }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(false);
        question.setAnswerVideoLink("BAADAgAD_QEAAmhmUEjhworX2mc2RQI");
        return question;
    }

}

package uz.gita.bot.question_module._IF_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _013_Question {
    public String weekDay(int week) {
        if (week == 1) {
            return "Monday";
        } else if (week == 2) {
            return "Tuesday";
        } else if (week == 3) {
            return "Wednesday";
        } else if (week == 4) {
            return "Thursday";
        } else if (week == 5) {
            return "Friday";
        } else if (week == 6) {
            return "Saturday";
        } else if (week == 7) {
            return "Sunday";
        } else {
            return "none";
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        String r_1 = weekDay(1);
        s += "Test 1  (1).  Kelgan javob  ";
        if (r_1.equals("Monday")) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        String r_2 = weekDay(2);
        s += "\nTest 2  (2).  Kelgan javob ";
        if (r_2.equals("Tuesday")) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        String r_3 = weekDay(3);
        s += "\nTest 3  (3).  Kelgan javob ";
        if (r_3.equals("Wednesday")) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        String r_4 = weekDay(4);
        s += "\nTest 4  (4).  Kelgan javob ";
        if (r_4.equals("Thursday")) {
            s += " '" + r_4 + "' " + "  To'g'ri";
        } else {
            s += r_4 + "   Xato ";
            return s;
        }

        String r_5 = weekDay(5);
        s += "\nTest 5  (5).  Kelgan javob ";
        if (r_5.equals("Friday")) {
            s += " '" + r_5 + "' " + "  To'g'ri";
        } else {
            s += r_5 + "   Xato ";
            return s;
        }

        String r_6 = weekDay(6);
        s += "\nTest 6  (6).  Kelgan javob ";
        if (r_6.equals("Saturday")) {
            s += " '" + r_6 + "' " + "  To'g'ri";
        } else {
            s += r_6 + "   Xato ";
            return s;
        }

        String r_7 = weekDay(7);
        s += "\nTest 7  (7).  Kelgan javob ";
        if (r_7.equals("Sunday")) {
            s += " '" + r_7 + "' " + "  To'g'ri";
        } else {
            s += r_7 + "   Xato ";
            return s;
        }

        String r_8 = weekDay(12);
        s += "\nTest 8  (12).  Kelgan javob ";
        if (r_8.equals("none")) {
            s += " '" + r_8 + "' " + "  To'g'ri";
        } else {
            s += r_8 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Program to print day name of week
        System.out.println(new _013_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(13); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT

        question.setQuestionContentHtml("Berilgan son hafta kunining\n" +
                "qaysi kuniga to'g'ri keladi .\n" +
                "Agar kelgan son 1 ga teng bo'lsa " +
                "'Monday' ni return qiling, \n" +
                "Agar kegan son ikkiga teng bo'lsa  " +
                "'Tuesday' return qiling va hz .., \n" +
                "Agar hafta kuniga to'g'ri kelmasa 'none'.\n\n" +
                "<code> public String weekDay(int week) {\n" +
                "\n" +
                "    }</code>");
        question.setTitle("hafta kunlari");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code> public String weekDay(int week) {\n" +
                "        if (week == 1) {\n" +
                "            return \"Monday\";\n" +
                "        } else if (week == 2) {\n" +
                "            return \"Tuesday\";\n" +
                "        } else if (week == 3) {\n" +
                "            return \"Wednesday\";\n" +
                "        } else if (week == 4) {\n" +
                "            return \"Thursday\";\n" +
                "        } else if (week == 5) {\n" +
                "            return \"Friday\";\n" +
                "        } else if (week == 6) {\n" +
                "            return \"Saturday\";\n" +
                "        } else if (week == 7) {\n" +
                "            return \"Sunday\";\n" +
                "        } else {\n" +
                "            return \"none\";\n" +
                "        }\n" +
                "    }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                " public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "\n" +
                "        String r_1 = weekDay(1);\n" +
                "        s += \"Test 1  (1).  Kelgan javob  \";\n" +
                "        if (r_1.equals(\"Monday\")) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_2 = weekDay(2);\n" +
                "        s += \"\\nTest 2  (2).  Kelgan javob \";\n" +
                "        if (r_2.equals(\"Tuesday\")) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_3 = weekDay(3);\n" +
                "        s += \"\\nTest 3  (3).  Kelgan javob \";\n" +
                "        if (r_3.equals(\"Wednesday\")) {\n" +
                "            s += \" '\" + r_3 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_3 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_4 = weekDay(4);\n" +
                "        s += \"\\nTest 4  (4).  Kelgan javob \";\n" +
                "        if (r_4.equals(\"Thursday\")) {\n" +
                "            s += \" '\" + r_4 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_4 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_5 = weekDay(5);\n" +
                "        s += \"\\nTest 5  (5).  Kelgan javob \";\n" +
                "        if (r_5.equals(\"Friday\")) {\n" +
                "            s += \" '\" + r_5 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_5 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_6 = weekDay(6);\n" +
                "        s += \"\\nTest 6  (6).  Kelgan javob \";\n" +
                "        if (r_6.equals(\"Saturday\")) {\n" +
                "            s += \" '\" + r_6 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_6 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_7 = weekDay(7);\n" +
                "        s += \"\\nTest 7  (7).  Kelgan javob \";\n" +
                "        if (r_7.equals(\"Sunday\")) {\n" +
                "            s += \" '\" + r_7 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_7 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        String r_8 = weekDay(12);\n" +
                "        s += \"\\nTest 8  (12).  Kelgan javob \";\n" +
                "        if (r_8.equals(\"none\")) {\n" +
                "            s += \" '\" + r_8 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_8 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muvaffaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        question.setAnswerVideoLink("BAADAgAD1gEAAmhmUEiZbdhZDLBdEwI");
        return question;
    }
}

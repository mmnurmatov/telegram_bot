package uz.gita.bot.question_module._ARRAY_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

/**
 * Created by Bigman on 04.02.2018.
 */
public class _020_Question {

    public int min(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // oldin massivni o'sish tartibida joylashtirib olamiz
        // demak eng kichigi 0 index da turgan bo'ladi
        // demak ikkinchi eng kichik son  1 indexta turadi
        return array[1];
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";

        int r_1 = min(new int[]{4, 2, 0, 6, 22, 8, 1});
        s += "Test 1  {4, 2, 1, 6, 22, 8, 1}  Kelgan javob  ";
        if (r_1 == 1) {
            s += " '" + r_1 + "' " + "  To'g'ri";
        } else {
            s += r_1 + "   Xato ";
            return s;
        }

        int r_2 = min(new int[]{44, 1, 8});
        s += "\nTest 2  {44, 1, 8} .  Kelgan javob ";
        if (r_2 == 8) {
            s += " '" + r_2 + "' " + "  To'g'ri";
        } else {
            s += r_2 + "   Xato ";
            return s;
        }

        int r_3 = min(new int[]{4, 20, 5, 7, -1, 8, 12, 14, 8, 2});
        s += "\nTest 3  {4, 20, 5, 7, -1, 8, 12, 14, 8, 2}.  Kelgan javob ";
        if (r_3 == 2) {
            s += " '" + r_3 + "' " + "  To'g'ri";
        } else {
            s += r_3 + "   Xato ";
            return s;
        }

        return s + "\n" + "Hamma Testlardan muvaffaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";
    }


    public static void main(String[] args) {
        // array berilgan
        // o'sha massivdagi eng kichik ikkinchi  elementni toping
        // masalan [1,3,6,4,7,2]
        // eng kichik 1
        // ikkinchi eng kichik 2
        System.out.println(new _020_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(20); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT

        question.setQuestionContentHtml("int array[]  berilgan.\n" +
                "O'sha massivdagi eng kichik ikkinchi  elementni return qiling.\n" +
                "Masalan: [1,3,6,4,7,2]\n" +
                "eng kichigi:  1\n" +
                "ikkinchi eng kichigi:  2\n\n" +
                "<code> public int min(int array[]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("  eng kichik ikkinchi  element ?");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  " +
                "public int min(int array[]) {\n" +
                "   for (int i = 0; i &lt; array.length; i++) {\n" +
                "    for (int j = i + 1; j &lt; array.length; j++) {\n" +
                "        if (array[i] &gt; array[j]) {\n" +
                "            int temp = array[i];\n" +
                "            array[i] = array[j];\n" +
                "            array[j] = temp;\n" +
                "        }\n" +
                "    }\n" +
                " }\n" +
                "\n" +
                "// oldin massivni o'sish tartibida joylashtirib olamiz\n" +
                "// demak eng kichigi 0 index da turgan bo'ladi\n" +
                "// demak ikkinchi eng kichik son  1 indexta turadi\n" +
                "  return array[1];\n" +
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
                "        int r_1 = min(new int[]{4, 2, 0, 6, 22, 8, 1});\n" +
                "        s += \"Test 1  {4, 2, 1, 6, 22, 8, 1}  Kelgan javob  \";\n" +
                "        if (r_1 == 1) {\n" +
                "            s += \" '\" + r_1 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_1 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_2 = min(new int[]{44, 1, 8});\n" +
                "        s += \"\\nTest 2  {44, 1, 8} .  Kelgan javob \";\n" +
                "        if (r_2 == 8) {\n" +
                "            s += \" '\" + r_2 + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += r_2 + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        int r_3 = min(new int[]{4, 20, 5, 7, -1, 8, 12, 14, 8, 2});\n" +
                "        s += \"\\nTest 3  {4, 20, 5, 7, -1, 8, 12, 14, 8, 2}.  Kelgan javob \";\n" +
                "        if (r_3 == 2) {\n" +
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

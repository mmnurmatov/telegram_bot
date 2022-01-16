package uz.gita.bot.question_module._MATRIX_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;

import java.util.Arrays;

/**
 * Created by Bigman on 10.02.2018.
 */
public class _003_Question {
    public int[][] subtract(int a[][], int b[][]) {
        int matrix[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = a[i][j] - b[i][j];
            }
        }
        return matrix;
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        a[0] = new int[]{4, 4, 4};
        a[1] = new int[]{4, 4, 4};
        a[2] = new int[]{4, 4, 4};

        b[0] = new int[]{1, 1, 1};
        b[1] = new int[]{1, 1, 1};
        b[2] = new int[]{1, 1, 1};


        int r_1[][] = subtract(a, b);
        s += "Test 1  (" + Arrays.deepToString(a) + "," + Arrays.deepToString(b) + ")  Kelgan javob  ";
        Boolean t_1 = false;
        if (r_1 != null) {
            t_1 = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (r_1[i][j] != 3) {
                        t_1 = false;
                    }
                }
            }
        }
        if (t_1) {
            s += " '" + Arrays.deepToString(r_1) + "' " + "  To'g'ri";
        } else {
            s += Arrays.deepToString(r_1) + "   Xato ";
            return s;
        }

        a[0] = new int[]{15, 15, 15};
        a[1] = new int[]{15, 15, 15};
        a[2] = new int[]{15, 15, 15};

        b[0] = new int[]{13, 13, 13};
        b[1] = new int[]{13, 13, 13};
        b[2] = new int[]{13, 13, 13};

        int r_2[][] = subtract(a, b);

        Boolean t_2 = false;
        if (r_2 != null) {
            t_2 = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (r_2[i][j] != 2) {
                        t_2 = false;
                    }
                }
            }
        }
        s += "\nTest 2  (" + Arrays.deepToString(a) + "," + Arrays.deepToString(b) + ").  Kelgan javob ";
        if (t_2) {
            s += " '" + Arrays.deepToString(r_2) + "' " + "  To'g'ri";
        } else {
            s += Arrays.deepToString(r_2) + "   Xato ";
            return s;
        }


        return s + "\n" + "Hamma Testlardan muofaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // a[][], b[][] matrix berilgan
        //  shu ikkita martixni ayirmasini toping
        // va hosil bo'lgan matrix return qiling
        // kelayotgan a va b matrix 3x3.
        System.out.println(new _003_Question().testUserMethod());
    }

    public static QuestionDto getQuestion() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(3); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.MATRIX); //< QUESTION PARENT

        question.setQuestionContentHtml("  a[][], b[][] matrix berilgan\n" +
                " shu ikkita martixni ayirmasini toping\n" +
                "va hosil bo'lgan matrixni return qiling.\n" +
                "Namuna: kelayotgan a va b matrix 3x3..\n" +
                "masalan\n" +
                " a matrix 3x3:\n" +
                "1 2 3\n" +
                "4 5 6\n" +
                "7 8 9\n" +
                "\n" +
                "b matrix 3x3:\n" +
                "9 8 7\n" +
                "6 5 4\n" +
                "3 2 1\n" +
                "Natija: \n" +
                " a-b =\n" +
                "-8 -6 -4\n" +
                "-2  0  2\n" +
                "4  6  8 \n\n" +
                "<code> public int[][] subtract(int a[][], int b[][]) {\n" +
                "        \n" +
                "    }</code>");
        question.setTitle("matrix larning ayirmasi");
        question.setQuestionState(QuestionState.HTML);

        question.setAnswerContentHtml("<code>  public int[][] subtract(int a[][], int b[][]) {\n" +
                "        int matrix[][] = new int[3][3];\n" +
                "        for (int i = 0; i &lt; 3; i++) {\n" +
                "            for (int j = 0; j &lt; 3; j++) {\n" +
                "                matrix[i][j] = a[i][j] - b[i][j];\n" +
                "            }\n" +
                "        }\n" +
                "        return matrix;\n" +
                "    }</code>");

        question.setAnswerState(QuestionState.HTML);
        question.setVisible(true);

        question.setHasTest(true);
        question.setTest("import java.util.Arrays;\n" +
                "public class ExampleClass {\n" +
                "\n" +
                "        UserCodeThere \n" +
                "public String testUserMethod() {\n" +
                "        String s = \"Code ni Tekshirish\\n\";\n" +
                "        int a[][] = new int[3][3];\n" +
                "        int b[][] = new int[3][3];\n" +
                "\n" +
                "        a[0] = new int[]{4, 4, 4};\n" +
                "        a[1] = new int[]{4, 4, 4};\n" +
                "        a[2] = new int[]{4, 4, 4};\n" +
                "\n" +
                "        b[0] = new int[]{1, 1, 1};\n" +
                "        b[1] = new int[]{1, 1, 1};\n" +
                "        b[2] = new int[]{1, 1, 1};\n" +
                "\n" +
                "\n" +
                "        int r_1[][] = subtract(a, b);\n" +
                "        s += \"Test 1  (\" + Arrays.deepToString(a) + \",\" + Arrays.deepToString(b) + \")  Kelgan javob  \";\n" +
                "        Boolean t_1 = false;\n" +
                "        if (r_1 != null) {\n" +
                "            t_1 = true;\n" +
                "            for (int i = 0; i < 3; i++) {\n" +
                "                for (int j = 0; j < 3; j++) {\n" +
                "                    if (r_1[i][j] != 3) {\n" +
                "                        t_1 = false;\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        if (t_1) {\n" +
                "            s += \" '\" + Arrays.deepToString(r_1) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += Arrays.deepToString(r_1) + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        a[0] = new int[]{15, 15, 15};\n" +
                "        a[1] = new int[]{15, 15, 15};\n" +
                "        a[2] = new int[]{15, 15, 15};\n" +
                "\n" +
                "        b[0] = new int[]{13, 13, 13};\n" +
                "        b[1] = new int[]{13, 13, 13};\n" +
                "        b[2] = new int[]{13, 13, 13};\n" +
                "\n" +
                "        int r_2[][] = subtract(a, b);\n" +
                "\n" +
                "        Boolean t_2 = false;\n" +
                "        if (r_2 != null) {\n" +
                "            t_2 = true;\n" +
                "            for (int i = 0; i < 3; i++) {\n" +
                "                for (int j = 0; j < 3; j++) {\n" +
                "                    if (r_2[i][j] != 2) {\n" +
                "                        t_2 = false;\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        s += \"\\nTest 2  (\" + Arrays.deepToString(a) + \",\" + Arrays.deepToString(b) + \").  Kelgan javob \";\n" +
                "        if (t_2) {\n" +
                "            s += \" '\" + Arrays.deepToString(r_2) + \"' \" + \"  To'g'ri\";\n" +
                "        } else {\n" +
                "            s += Arrays.deepToString(r_2) + \"   Xato \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        return s + \"\\n\" + \"Hamma Testlardan muofaqiyatli o'tdi. \\n \\\" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \\\"\";\n" +
                "\n" +
                "    }}");
        return question;
    }

}

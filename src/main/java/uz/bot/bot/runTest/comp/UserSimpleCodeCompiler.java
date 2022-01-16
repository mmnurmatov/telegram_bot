package uz.gita.bot.runTest.comp;

import uz.gita.bot.runTest.comp.util.MethodInvocationUtils;
import uz.gita.bot.runTest.comp.util.RuntimeCompiler;

public class UserSimpleCodeCompiler {
    public static void main(String[] args) throws Exception {
        simpleExample();
//        twoClassExample();
//        useLoadedClassExample();

    }

    /**
     * Simple example: Shows how to add and compile a class, and then
     * invoke a static method on the loaded class.
     */
    private static void simpleExample() {
        String classNameA = "ExampleClass";
//        String codeA =
//                "public class ExampleClass {" + "\n" +
//                        " public  String world() {\n" +
//                        "   int n = exampleMethod(\"aa\"); " +
//                        "    System.out.println(n); " +
//                        "        return \"abcd\";\n" +
//                        "    }" +
//                        "    public  int exampleMethod(String name) {" + "\n" +
//                        "        System.out.println(\"Hello12121212121, \"+name);" + "\n" +
//                        "     return 1;" +
//                        "    }" + "\n" +
//                        "}" + "\n";
        String codeA = "public class ExampleClass {\n" +
                "\n" +
                "    public int findMax(int a, int b) {\n" +
                "        if (a > b) {\n" +
                "            return a;\n" +
                "        } else {\n" +
                "            return b;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public String test() {\n" +
                "        int a1 = 3, b1 = 5;\n" +
                "        int a2 = 7, b2 = 2;\n" +
                "        int a3 = -1, b3 = 2;\n" +
                "        int a4 = 11, b4 = -7;\n" +
                "        int a5 = -6, b5 = -2;\n" +
                "        String s = \"\";\n" +
                "\n" +
                "        // TEST 1\n" +
                "        int r_1 = findMax(a1, b1);\n" +
                "        if (r_1 == b1) {\n" +
                "            s += \"Test 1 ->  a = \" + a1 + \" , b = \" + b1 + \"  \" + \" kelgan javob = \" + \" to'g'ri o'tdi. \\n\";\n" +
                "        } else {\n" +
                "            s += \"Test 1 ->  a = \" + a1 + \" , b = \" + b1 + \")\" + \" hato  o'tdi \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        // TEST 2\n" +
                "        int r_2 = findMax(a2, b2);\n" +
                "        if (r_2 == a2) {\n" +
                "            s += \"Test 2 ->  a = \" + a2 + \" , b = \" + b2 + \")\" + \" to'g'ri o'tdi. \\n\";\n" +
                "        } else {\n" +
                "            s += \"Test 2 ->  a = \" + a2 + \" , b = \" + b2 + \")\" + \" hato  o'tdi \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        // TEST 3\n" +
                "        int r_3 = findMax(a3, b3);\n" +
                "        if (r_3 == b3) {\n" +
                "            s += \"Test 3 ->  a = \" + a3 + \" , b = \" + b3 + \")\" + \" to'g'ri o'tdi. \\n\";\n" +
                "        } else {\n" +
                "            s += \"Test 3 ->  a = \" + a3 + \" , b = \" + b3 + \")\" + \" hato  o'tdi \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        // TEST 4\n" +
                "        int r_4 = findMax(a4, b4);\n" +
                "        if (r_4 == a4) {\n" +
                "            s += \"Test 4 ->  a = \" + a4 + \" , b = \" + b4 + \")\" + \" to'g'ri o'tdi. \\n\";\n" +
                "        } else {\n" +
                "            s += \"Test 4 ->  a = \" + a4 + \" , b = \" + b4 + \")\" + \" hato  o'tdi \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        // TEST 5\n" +
                "        int r_5 = findMax(a5, b5);\n" +
                "        if (r_5 == b5) {\n" +
                "            s += \"Test 5 ->  a = \" + a5 + \" , b = \" + b5 + \")\" + \" to'g'ri o'tdi. \\n\";\n" +
                "        } else {\n" +
                "            s += \"Test 5 ->  a = \" + a5 + \" , b = \" + b5 + \")\" + \" hato  o'tdi \";\n" +
                "            return s;\n" +
                "        }\n" +
                "\n" +
                "        return s;\n" +
                "    }\n}";

        RuntimeCompiler r = new RuntimeCompiler();
        r.addClass(classNameA, codeA);
        r.compile();

//        MethodInvocationUtils.invokeStaticMethod(
//                r.getCompiledClass(classNameA),
//                "exampleMethod", "exampleParameter");

        MethodInvocationUtils.invokeMethod(
                r.getCompiledClass(classNameA),
                "test");
        //System.out.println(object);
    }
}

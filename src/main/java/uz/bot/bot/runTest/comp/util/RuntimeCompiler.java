package uz.gita.bot.runTest.comp.util;

import uz.gita.bot.runTest.comp.CodeCompilerDto;
import javax.tools.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RuntimeCompiler {

    /**
     * The Java Compiler
     */
    private final JavaCompiler javaCompiler;

    /**
     * The mapping from fully qualified class names to the class data
     */
    public static final Map<String, byte[]> classData;

    /**
     * A class loader that will look up classes in the {@link #classData}
     */
    private final MapClassLoader mapClassLoader;

    /**
     * The JavaFileManager that will handle the compiled classes, and
     * eventually put them into the {@link #classData}
     */
    private final ClassDataFileManager classDataFileManager;

    /**
     * The compilation units for the next compilation task
     */
    private final List<JavaFileObject> compilationUnits;

    static {
        classData = new LinkedHashMap<String, byte[]>();
    }

    /**
     * Creates a new RuntimeCompiler
     *
     * @throws NullPointerException If no JavaCompiler could be obtained.
     *                              This is the case when the application was not started with a JDK,
     *                              but only with a JRE. (More specifically: When the JDK tools are
     *                              not in the classpath).
     */
    public RuntimeCompiler() {
        this.javaCompiler = ToolProvider.getSystemJavaCompiler();
        if (javaCompiler == null) {
            throw new NullPointerException(
                    "No JavaCompiler found. Make sure to run this with "
                            + "a JDK, and not only with a JRE");
        }
        //this.classData = new LinkedHashMap<String, byte[]>();
        this.mapClassLoader = new MapClassLoader();
        this.classDataFileManager =
                new ClassDataFileManager(
                        javaCompiler.getStandardFileManager(null, null, null));
        this.compilationUnits = new ArrayList<JavaFileObject>();
    }

    /**
     * Add a class with the given name and source code to be compiled
     * with the next call to {@link #compile()}
     *
     * @param className The class name
     * @param code      The code of the class
     */
    public void addClass(String className, String code) {
        String javaFileName = className + ".java";
        JavaFileObject javaFileObject =
                new MemoryJavaSourceFileObject(javaFileName, code);
        compilationUnits.add(javaFileObject);
    }

    /**
     * Compile all classes that have been added by calling
     * {@link #addClass(String, String)}
     *
     * @return Whether the compilation succeeded
     */
    public CodeCompilerDto compile() {
        CodeCompilerDto result = new CodeCompilerDto();

        DiagnosticCollector<JavaFileObject> diagnosticsCollector =
                new DiagnosticCollector<JavaFileObject>();
        JavaCompiler.CompilationTask task =
                javaCompiler.getTask(null, classDataFileManager,
                        diagnosticsCollector, null, null,
                        compilationUnits);
        boolean success = task.call();
        compilationUnits.clear();

        result.setIsOk(success);//< SET CODE_HAS_ERROR_OR_NOT

        for (Diagnostic<?> diagnostic : diagnosticsCollector.getDiagnostics()) {
            System.out.println(
                    diagnostic.getKind() + " : " +
                            diagnostic.getMessage(null));
            System.out.println(
                    "Line " + diagnostic.getLineNumber() +
                            " of " + diagnostic.getSource());
            System.out.println();
            result.setErrMsg(diagnostic.getKind() + ": " + diagnostic.getMessage(null));
            break;
        }
        return result;
    }


    /**
     * Obtain a class that was previously compiled by adding it with
     * {@link #addClass(String, String)} and calling {@link #compile()}.
     *
     * @param className The class name
     * @return The class. Returns <code>null</code> if the compilation failed.
     */
    public Class<?> getCompiledClass(String className) {
        return mapClassLoader.findClass(className);
    }
}


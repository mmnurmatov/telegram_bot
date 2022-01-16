package uz.gita.bot.runTest.comp.util;

import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

public class MemoryJavaClassFileObject extends SimpleJavaFileObject {
    /**
     * The name of the class represented by the file object
     */
    private final String className;

    /**
     * Create a new java file object that represents the specified class
     *
     * @param className THe name of the class
     */
    protected MemoryJavaClassFileObject(String className) {
        super(URI.create("string:///" + className + ".class"),
                Kind.CLASS);
        this.className = className;
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        return new ClassDataOutputStream(className);
    }
}

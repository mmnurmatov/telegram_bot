package uz.gita.bot.runTest.comp.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ClassDataOutputStream extends OutputStream {
    /**
     * The name of the class that the received class data represents
     */
    private final String className;

    /**
     * The output stream that will receive the class data
     */
    private final ByteArrayOutputStream baos;

    /**
     * Creates a new output stream that will store the class
     * data for the class with the given name
     *
     * @param className The class name
     */
    protected ClassDataOutputStream(String className) {
        this.className = className;
        this.baos = new ByteArrayOutputStream();

    }

    @Override
    public void write(int b) throws IOException {
        baos.write(b);
    }

    @Override
    public void close() throws IOException {
        RuntimeCompiler.classData.put(className, baos.toByteArray());
        super.close();
    }
}

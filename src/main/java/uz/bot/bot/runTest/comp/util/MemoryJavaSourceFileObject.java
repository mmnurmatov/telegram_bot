package uz.gita.bot.runTest.comp.util;

import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.net.URI;

public class MemoryJavaSourceFileObject extends SimpleJavaFileObject {

    /**
     * The source code of the class
     */
    private final String code;

    /**
     * Creates a new in-memory representation of a Java file
     *
     * @param fileName The file name
     * @param code     The source code of the file
     */
    protected MemoryJavaSourceFileObject(String fileName, String code) {
        super(URI.create("string:///" + fileName), Kind.SOURCE);
        this.code = code;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors)
            throws IOException {
        return code;
    }
}

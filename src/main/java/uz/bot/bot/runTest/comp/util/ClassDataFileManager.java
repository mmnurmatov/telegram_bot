package uz.gita.bot.runTest.comp.util;

import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import java.io.IOException;

public class ClassDataFileManager extends ForwardingJavaFileManager<StandardJavaFileManager> {
    /**
     * Create a new file manager that delegates to the given file manager
     *
     * @param standardJavaFileManager The delegate file manager
     */
    protected ClassDataFileManager(
            StandardJavaFileManager standardJavaFileManager) {
        super(standardJavaFileManager);
    }

    @Override
    public JavaFileObject getJavaFileForOutput(final Location location,
                                               final String className, JavaFileObject.Kind kind, FileObject sibling)
            throws IOException {
        return new MemoryJavaClassFileObject(className);
    }
}

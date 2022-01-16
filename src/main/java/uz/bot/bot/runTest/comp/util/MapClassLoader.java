package uz.gita.bot.runTest.comp.util;

public class MapClassLoader extends ClassLoader {
    @Override
    public Class<?> findClass(String name) {
        byte[] b = RuntimeCompiler.classData.get(name);
        return defineClass(name, b, 0, b.length);
    }
}
package io.github.ivan100kg.lesson13.examples;

import org.springframework.beans.factory.annotation.Qualifier;

public class CppCodeCreator implements com.geekbrains.spring.current.CodeCreator {
    private io.github.ivan100kg.lesson13.examples.ClassNameGenerator classNameGenerator;

    public CppCodeCreator(io.github.ivan100kg.lesson13.examples.ClassNameGenerator classNameGenerator) {
        this.classNameGenerator = classNameGenerator;
    }

    public String getClassExample() {
        return "public class " + classNameGenerator.getRandomClassName() + " {\nprivate:\n   String name;\n   ...\n}";
    }
}

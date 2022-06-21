package io.github.ivan100kg.lesson13.current;

public class JavaCodeCreator implements com.geekbrains.spring.current.CodeCreator {
    ClassNameGenerator classNameGenerator;

    public void setClassNameGenerator(ClassNameGenerator classNameGenerator) {
        this.classNameGenerator = classNameGenerator;
    }

    public String getClassExample() {
        return "public class " + classNameGenerator.generateClassName() + " {\n\n}";
    }
}

package io.github.ivan100kg.lesson13.examples;

public class JavaCodeCreator implements com.geekbrains.spring.current.CodeCreator {
    private io.github.ivan100kg.lesson13.examples.ClassNameGenerator classNameGenerator;

    public io.github.ivan100kg.lesson13.examples.ClassNameGenerator getClassNameGenerator() {
        return classNameGenerator;
    }

    public void setClassNameGenerator(io.github.ivan100kg.lesson13.examples.ClassNameGenerator classNameGenerator) {
        this.classNameGenerator = classNameGenerator;
    }

    public String getClassExample() {
        return "public class " + classNameGenerator.getRandomClassName() + " {\n   private String name;\n   ...\n}";
    }
}

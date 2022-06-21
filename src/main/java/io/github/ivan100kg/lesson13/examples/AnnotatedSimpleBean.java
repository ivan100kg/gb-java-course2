//package io.github.ivan100kg.lesson13.examples;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component // ("annotatedSimpleBean")
//// @Scope("prototype")
//public class AnnotatedSimpleBean {
//    @Autowired
//    private io.github.ivan100kg.lesson13.current.ClassNameGenerator classNameGenerator;
//
//    @Value("initial string")
//    private String data;
//
//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }
//
//    public io.github.ivan100kg.lesson13.current.ClassNameGenerator getClassNameGenerator() {
//        return classNameGenerator;
//    }
//
////    @Autowired
//    public void setClassNameGenerator(io.github.ivan100kg.lesson13.current.ClassNameGenerator classNameGenerator) {
//        this.classNameGenerator = classNameGenerator;
//    }
//
//    @Autowired
//    public AnnotatedSimpleBean(io.github.ivan100kg.lesson13.current.ClassNameGenerator classNameGenerator) {
//        this.classNameGenerator = classNameGenerator;
//    }
//
//    public void printRandomClassName() {
//        System.out.println(classNameGenerator.getRandomClassName());
//    }
//}

//package io.github.ivan100kg.lesson13.examples;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan("io.github.ivan100kg.lesson13")
//public class AppConfig {
//    /*
//    <bean id="javaCodeCreator" class="com.geekbrains.spring.examples.JavaCodeCreator">
//        <property name="classNameGenerator">
//            <ref bean="animalsClassNameGenerator" />
//        </property>
//    </bean>
//
//    <bean id="animalsClassNameGenerator" class="com.geekbrains.spring.examples.AnimalsClassNameGenerator">
//
//    </bean>
//     */
//
//    @Bean("animalsClassNameGenerator")
//    public io.github.ivan100kg.lesson13.examples.ClassNameGenerator animalsClassNameGenerator() {
//        io.github.ivan100kg.lesson13.examples.ClassNameGenerator classNameGenerator = new io.github.ivan100kg.lesson13.current.AnimalsClassNameGenerator();
//        return classNameGenerator;
//    }
//
//    @Bean("javaCodeCreator")
//    public com.geekbrains.spring.current.CodeCreator javaCodeCreator() {
//        io.github.ivan100kg.lesson13.current.CodeCreator codeCreator = new com.geekbrains.spring.current.JavaCodeCreator();
//        ((io.github.ivan100kg.lesson13.current.JavaCodeCreator) codeCreator).setClassNameGenerator(animalsClassNameGenerator());
//        return codeCreator;
//    }
//}

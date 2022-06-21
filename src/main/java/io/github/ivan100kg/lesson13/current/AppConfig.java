//package io.github.ivan100kg.lesson13.current;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan("io.github.ivan100kg.lesson13.current")
//public class AppConfig {
//    /*
//    <bean id="javaCodeCreator" class="com.geekbrains.spring.current.JavaCodeCreator">
//        <property name="classNameGenerator">
//            <ref bean="animalsClassNameGenerator" />
//        </property>
//    </bean>
//
//    <bean id="simpleBean" class="com.geekbrains.spring.current.SimpleBean"/>
//     */
//
//    @Bean
//    public com.geekbrains.spring.current.CodeCreator javaCodeCreator() {
//        com.geekbrains.spring.current.JavaCodeCreator codeCreator = new com.geekbrains.spring.current.JavaCodeCreator();
//        codeCreator.setClassNameGenerator(animalsClassNameGenerator());
//        return codeCreator;
//    }
//
//    @Bean
//    public com.geekbrains.spring.current.ClassNameGenerator animalsClassNameGenerator() {
//        com.geekbrains.spring.current.ClassNameGenerator classNameGenerator = new com.geekbrains.spring.current.AnimalsClassNameGenerator();
//        return classNameGenerator;
//    }
//
//    @Bean
//    public com.geekbrains.spring.current.SimpleBean simpleBean() {
//        com.geekbrains.spring.current.SimpleBean simpleBean = new com.geekbrains.spring.current.SimpleBean();
//        return simpleBean;
//    }
//}

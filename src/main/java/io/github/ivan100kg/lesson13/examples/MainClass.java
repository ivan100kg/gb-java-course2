package io.github.ivan100kg.lesson13.examples;


import io.github.ivan100kg.lesson13.current.my.AnotherBean;
import io.github.ivan100kg.lesson13.current.my.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "myContext.xml"
        );

        AnotherBean anotherBean = context.getBean(AnotherBean.class, "anotherBean");
        anotherBean.invokeSimpleBeanMethod();

        context.close();
    }
}

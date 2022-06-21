//package io.github.ivan100kg.lesson13.current.simple;
//
//import com.geekbrains.spring.current.AnnotatedBean;
//import com.geekbrains.spring.current.AppConfig;
//import com.geekbrains.spring.current.CodeCreator;
//import com.geekbrains.spring.current.SimpleBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class App {
//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        com.geekbrains.spring.current.simple.ShopService shopService = context.getBean("shopService", com.geekbrains.spring.current.simple.ShopService.class);
//        shopService.buy();
//        ((AnnotationConfigApplicationContext) context).close();
//    }
//}

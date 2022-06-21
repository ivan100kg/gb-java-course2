package io.github.ivan100kg.lesson13.current.simple;

import org.springframework.stereotype.Component;

@Component
public class BeanInterfaceImpl implements com.geekbrains.spring.current.simple.BeanInterface {
    public void doSomething() {
        System.out.println(1);
    }
}

package io.github.ivan100kg.lesson13.current.my;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("simpleBean")
public class SimpleBean {
    @Value("${val}")
    private int value;

    public SimpleBean() {
        System.out.println("SimpleBean is created");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void doSomething() {
        System.out.println("Simple Bean print = " + value);
    }
}

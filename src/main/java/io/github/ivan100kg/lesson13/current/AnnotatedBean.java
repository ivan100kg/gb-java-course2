package io.github.ivan100kg.lesson13.current;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedBean {
    @Autowired
    io.github.ivan100kg.lesson13.current.SimpleBean simpleBean;

    public void example() {
        simpleBean.doSomething();
    }
}

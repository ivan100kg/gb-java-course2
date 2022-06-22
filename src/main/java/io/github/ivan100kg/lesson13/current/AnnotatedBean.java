package io.github.ivan100kg.lesson13.current;

import io.github.ivan100kg.lesson13.current.my.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedBean {
    @Autowired
    SimpleBean simpleBean;

    public void example() {
        simpleBean.doSomething();
    }
}

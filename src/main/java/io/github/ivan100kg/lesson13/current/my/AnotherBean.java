package io.github.ivan100kg.lesson13.current.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnotherBean {
    SimpleBean simpleBean;

    @Autowired
    public AnotherBean(@Qualifier("simpleBean") SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
        System.out.println("AnotherBean is created");
    }

    public void invokeSimpleBeanMethod() {
        simpleBean.doSomething();
    }
}

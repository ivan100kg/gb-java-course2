package io.github.ivan100kg.lesson13.current.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShopService {
    private com.geekbrains.spring.current.simple.ProductService productService;
    private com.geekbrains.spring.current.simple.OrderService orderService;
    private com.geekbrains.spring.current.simple.MailService mailService;
    private com.geekbrains.spring.current.simple.BeanInterface beanInterface;
    private com.geekbrains.spring.current.simple.BeanInterface beanInterface2;

    @Autowired
    @Qualifier("beanInterfaceImpl")
    public void setBeanInterface(com.geekbrains.spring.current.simple.BeanInterface beanInterface) {
        this.beanInterface = beanInterface;
    }

    @Autowired
    @Qualifier("advBeanInterfaceImpl")
    public void setBeanInterface2(com.geekbrains.spring.current.simple.BeanInterface beanInterface2) {
        this.beanInterface2 = beanInterface2;
    }

    @Autowired
    public void setProductService(com.geekbrains.spring.current.simple.ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    public void setOrderService(com.geekbrains.spring.current.simple.OrderService orderService) {
        this.orderService = orderService;
    }

    @Autowired
    public void setMailService(com.geekbrains.spring.current.simple.MailService mailService) {
        this.mailService = mailService;
    }

    public void buy() {
        productService.getProducts();
        orderService.createOrder();
        mailService.sendMail();
        beanInterface.doSomething();
    }
}

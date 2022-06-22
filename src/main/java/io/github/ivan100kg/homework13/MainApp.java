package io.github.ivan100kg.homework13;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContextNW.xml"
        );

        OrderService oService = context.getBean(OrderService.class, "orderService");
        Cart cart = context.getBean(Cart.class, "cart");
//        service.getOrder(cart);
        ProductService pService = context.getBean(ProductService.class, "productService");
//        System.out.println(pService.findByTitle("Milk"));
        cart.addProduct(pService.findByTitle("Milk"));
        cart.addProduct(pService.findByTitle("Vodka"));
        cart.addProduct(pService.findByTitle("Bananas"));
        oService.getOrder(cart);

        context.close();
    }
}

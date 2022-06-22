package io.github.ivan100kg.homework13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService oService = context.getBean(OrderService.class, "orderService");
//        Cart cart = context.getBean(Cart.class, "cart");
//        ProductService pService = context.getBean(ProductService.class, "productService");
//        cart.addProduct(pService.findByTitle("Milk"));
//        cart.addProduct(pService.findByTitle("Vodka"));
//        cart.addProduct(pService.findByTitle("Bananas"));
//        oService.getOrder(cart);
//        Product product = context.getBean("product", Product.class);
//        System.out.println(product);

        Cart cart = context.getBean("cart", Cart.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        cart.addProduct(productService.findByTitle("Vodka"));
        cart.addProduct(productService.findByTitle("Milk"));
        cart.printAll();
        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.getOrder();
//        productService.printAll();

        context.close();
    }
}

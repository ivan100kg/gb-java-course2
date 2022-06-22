package io.github.ivan100kg.homework13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private Cart cart;
    public OrderService() {
        System.out.println("OrderService is created");
    }

    @Autowired
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void getOrder() {
        if (cart.getProducts() != null) {
            cart.getProducts().forEach(p -> System.out.print(p.getTitle() + " "));
            System.out.println();
            System.out.print("Cost: ");
            System.out.println(cart.getProducts().stream().mapToDouble(Product::getCost).sum());
        } else {
            System.out.println("Cart is empty");
        }
    }


}

package io.github.ivan100kg.homework13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public OrderService() {
        System.out.println("OrderService is created");
    }

    public void getOrder(Cart cart) {
        cart.getProducts().forEach(p -> System.out.print(p.getTitle() + " "));
        System.out.println();
        System.out.print("Cost: ");
        System.out.println(cart.getProducts().stream().mapToDouble(Product::getCost).sum());
    }


}

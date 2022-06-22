package io.github.ivan100kg.homework13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Cart {
    private List<Product> products;

    public Cart() {
        System.out.println("Cart is created");
    }

    public void addProduct(Product product) {
        if (products == null) {
            products = new ArrayList<>();
        }
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void printAll() {
        if(products != null) {
            products.forEach(System.out::println);
        } else {
            System.out.println("Cart is empty!");
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}

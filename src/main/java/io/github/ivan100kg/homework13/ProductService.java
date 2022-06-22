package io.github.ivan100kg.homework13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductService {
    private List<Product> products;
    private Map<String, Product> map;

    public ProductService() {
        System.out.println("Create products");
        products = new ArrayList<>();
        map = new HashMap<>();
        products.add(new Product(1, "Bananas", 140));
        products.add(new Product(2, "Vodka", 270));
        products.add(new Product(3, "Beer", 67));
        products.add(new Product(4, "Bread", 27));
        products.add(new Product(5, "Meat", 230));
        products.add(new Product(6, "Burger", 120));
        products.add(new Product(7, "Fri", 55));
        products.add(new Product(8, "Cookies", 30));
        products.add(new Product(9, "Potato", 45));
        products.add(new Product(10, "Milk", 60));
        for (Product product : products) {
            map.put(product.getTitle(), product);
        }
    }

    public void printAll() {
        products.forEach(System.out::println);
    }

    public Product findByTitle(String title) {
        return map.get(title);
    }
}

package io.github.ivan100kg.homework11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            Person person1 = new Person("Ivan");
//            Person person2 = new Person("Olga");
//            Person person3 = new Person("Lisa");
//
//            Product product1 = new Product("Bread", 28);
//            Product product2 = new Product("Beer", 67);
//            Product product3 = new Product("Cookies", 21);
//            Product product4 = new Product("Vodka", 279);
//            Product product5 = new Product("Meat", 230);
//            Product product6 = new Product("Tea", 120);
//            Product product7 = new Product("Fish", 150);
//            Product product8 = new Product("Milk", 75);
//            Product product9 = new Product("Ice Cream", 55);
//
            session.beginTransaction();         // BEGIN
//
//            person1.addProduct(product1);
//            person1.addProduct(product4);
//            person1.addProduct(product8);
//            person2.addProduct(product6);
//            person2.addProduct(product1);
//            person2.addProduct(product4);
//            person3.addProduct(product5);
//            person3.addProduct(product7);
//            person3.addProduct(product2);
//
//            product9.addPerson(person1);
//            product9.addPerson(person2);
//            product9.addPerson(person3);
//
//            session.persist(person1);
//            session.persist(person2);
//            session.persist(person3);
//            session.persist(product9);

            Person person = session.get(Person.class, 5);
            System.out.println(person);
            person.getProducts().forEach(System.out::println);
            System.out.println("--------------------------------");
            Product product = session.get(Product.class, 15);
            System.out.println(product);
            product.getPeople().forEach(System.out::println);
            System.out.println("--------------------------------");
//            session.remove(person);
//            session.remove(product);
//            person.addProduct(product);


            session.getTransaction().

                    commit();  // COMMIT
        }
    }
}

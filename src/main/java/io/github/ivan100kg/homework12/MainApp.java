package io.github.ivan100kg.homework12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Item.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

            for (int i = 0; i < 8; i++) {
                new Thread(() -> {
                    for (int j = 0; j < 20000; j++) {
                        session.beginTransaction();         // BEGIN
                        Item item = session.get(Item.class, (int) ((Math.random() * (40 - 1)) + 1));
                        item.setVal(item.getVal() + 1);
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        session.getTransaction().commit();  // COMMIT
                    }
                }).start();
            }


        }
    }
}

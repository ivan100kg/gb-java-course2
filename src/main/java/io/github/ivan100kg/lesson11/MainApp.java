package io.github.ivan100kg.lesson11;

import io.github.ivan100kg.lesson11.enttity.Catalog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Catalog.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
            session.beginTransaction();         // BEGIN

            Catalog catalog = new Catalog("Fantasy #14");
            session.persist(catalog);

            session.getTransaction().commit();  // COMMIT
        }
    }
}

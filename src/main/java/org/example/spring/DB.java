package org.example.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class DB {
    private final SessionFactory factory;
    private Session session;

    public DB() {
        Configuration config = new Configuration();
        config.configure();
        factory = config.buildSessionFactory();
    }

    public void save(Wallet wallet) {
        session = factory.openSession();
        session.beginTransaction();
        session.save(wallet);
        session.getTransaction().commit();
    }

    public void load(){
        session = factory.openSession();
        session.beginTransaction();


        List<Wallet> list =
                session.createQuery("FROM Wallet", Wallet.class).getResultList();

    }
}


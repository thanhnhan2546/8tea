package com.github.qquang24t5._8tea.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Database {

    private static Database instance;
    private final SessionFactory sessionFactory;

    private Database() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }

    public SessionFactory getSessionFactory() {
        return instance.sessionFactory;
    }

}

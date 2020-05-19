package com.javawro27.hibernate_hw;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory mySessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("/hibernate.cfg.xml");

            mySessionFactory = configuration.buildSessionFactory();
        } catch( HibernateException he){
            System.err.println(he.getMessage());
            System.exit(376);
            throw he;
        }
    }

    public static SessionFactory getMySessionFactory() {
        return mySessionFactory;
    }
}

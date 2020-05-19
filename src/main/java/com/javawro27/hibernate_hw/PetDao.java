package com.javawro27.hibernate_hw;

import com.javawro27.hibernate_hw.model.Pet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PetDao {

    public void saveOrUpdate (Pet pet){
        SessionFactory sessionFactory = HibernateUtil.getMySessionFactory();
        Transaction transaction = null;

        try (Session session = sessionFactory.openSession()){
            transaction = session.beginTransaction();
            session.saveOrUpdate(pet);
            transaction.commit();

        } catch (HibernateException he){
            if (transaction != null){
                transaction.rollback();
            }
        }
    }
}

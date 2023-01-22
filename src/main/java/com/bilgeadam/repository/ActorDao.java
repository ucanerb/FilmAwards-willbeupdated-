package com.bilgeadam.repository;

import com.bilgeadam.Entity.Actor;
import com.bilgeadam.utils.HibernateUtil;
import org.hibernate.Session;

public class ActorDao {
    private Session session = null;
    public void save(Actor actor){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(actor);
            session.getTransaction().commit();
            System.out.println(actor.getFullName()+" isimli oyuncu veri tabanına eklendi.");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}

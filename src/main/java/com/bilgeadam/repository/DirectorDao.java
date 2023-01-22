package com.bilgeadam.repository;

import com.bilgeadam.Entity.Actor;
import com.bilgeadam.Entity.Director;
import com.bilgeadam.utils.HibernateUtil;
import org.hibernate.Session;

public class DirectorDao {
    private Session session = null;
    public void save(Director director){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(director);
            session.getTransaction().commit();
            System.out.println(director.getDirectorName()+" isimli yönetmen veri tabanına eklendi.");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}

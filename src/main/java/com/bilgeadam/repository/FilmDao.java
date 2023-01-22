package com.bilgeadam.repository;

import com.bilgeadam.Entity.Director;
import com.bilgeadam.Entity.Film;
import com.bilgeadam.utils.HibernateUtil;
import org.hibernate.Session;

public class FilmDao {

    private Session session = null;
    public void save(Film film){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(film);
            session.getTransaction().commit();
            System.out.println(film.getFilmName()+" isimli film veri tabanına eklendi.");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}

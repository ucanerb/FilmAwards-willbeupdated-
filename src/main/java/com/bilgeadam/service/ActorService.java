package com.bilgeadam.service;

import com.bilgeadam.Entity.Actor;
import com.bilgeadam.Entity.Award;
import com.bilgeadam.Entity.Film;
import com.bilgeadam.repository.ActorDao;
import com.bilgeadam.utils.HibernateUtil;

import java.util.Arrays;

public class ActorService {
    static ActorDao actorDao = new ActorDao();

    public static void main(String[] args) {
       // HibernateUtil.getSessionFactory();

        save();
    }
    public static void save(){


        try{
           Film film1 = new Film("Film2");
            Award award1 = new Award("Award2");

            Actor actor1 = new Actor("Sam Smith", Arrays.asList(film1),Arrays.asList(award1));
            actorDao.save(actor1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

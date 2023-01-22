package com.bilgeadam.service;

import com.bilgeadam.Entity.Award;
import com.bilgeadam.Entity.Director;
import com.bilgeadam.Entity.Film;
import com.bilgeadam.repository.DirectorDao;

import java.util.Arrays;

public class DirectorService {
    static DirectorDao directorDao = new  DirectorDao();
    public static void main(String[] args) {
        save();
    }

    public static void save(){
try {
    Film f1 = new Film("Film2");
    Award aw1 = new Award("award11");
    Director d1 = new Director("Yönetmen1", Arrays.asList(f1), aw1);
    directorDao.save(d1);
}catch (Exception e){
    e.printStackTrace();
}
}
}

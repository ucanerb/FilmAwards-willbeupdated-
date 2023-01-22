package com.bilgeadam.service;

import com.bilgeadam.Entity.*;
import com.bilgeadam.repository.FilmDao;

import java.util.Arrays;

public class FilmService {
    static FilmDao filmDao = new FilmDao();

    public static void main(String[] args) {
        save();
    }

    public static void save() {
        try {
            Director director1 = new Director("Yönetmen2");
            Actor actor1 = new Actor("Oyuncu2");
            FilmCategory filmCategory1 = new FilmCategory("Kategori 2");
            Award award1 = new Award("Award2");
            Film film1 = new Film("Film2",Arrays.asList(actor1), Arrays.asList(award1), Arrays.asList(filmCategory1), director1);
            filmDao.save(film1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


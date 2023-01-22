package com.bilgeadam.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String filmName;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Actor> actor;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Award> award;
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FilmCategory> filmCategory;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Director director;


    public Film(String filmName) {
        this.filmName = filmName;
    }

    public Film(Integer id, String filmName, List<Actor> actor, List<Award> award, List<FilmCategory> filmCategory, Director director) {
        this.id = id;
        this.filmName = filmName;
        this.actor = actor;
        this.award = award;
        this.filmCategory = filmCategory;
        this.director = director;
    }

    public Film(String filmName, List<Actor> actor, List<Award> award, List<FilmCategory> filmCategory, Director director) {
        this.filmName = filmName;
        this.actor = actor;
        this.award = award;
        this.filmCategory = filmCategory;
        this.director = director;
    }
}


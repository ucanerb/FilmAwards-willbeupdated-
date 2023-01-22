package com.bilgeadam.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Film> films;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Award> awards;

    public Actor(String fullName) {
        this.fullName = fullName;
    }

    public Actor(String fullName, List<Film> films, List<Award> awards) {
        this.fullName = fullName;
        this.films = films;
        this.awards = awards;
    }

    public Actor(Integer id, String fullName, List<Film> films, List<Award> awards) {
        this.id = id;
        this.fullName = fullName;
        this.films = films;
        this.awards = awards;
    }
}

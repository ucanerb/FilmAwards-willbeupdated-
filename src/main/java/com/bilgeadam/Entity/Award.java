package com.bilgeadam.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Award {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String awardName;


    public Award(Integer id, String awardName) {
        this.id = id;
        this.awardName = awardName;

    }

    public Award(String awardName) {
        this.awardName = awardName;

    }


}

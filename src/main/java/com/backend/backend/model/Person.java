package com.backend.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String profession;
    private String description;
    
    public Person()
    {

    }

    public Person( Long id, String name, String profession, String description)
    {
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.description = description;
    }
    
}


package com.backend.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String title;
    private String state;
    private String average;
    private String link;
    
    
    public Education()
    {

    }

    public Education( Long id, String name, String title, String state, String average, String link)
    {
        this.id = id;
        this.name = name;
        this.title = title;
        this.state = state;
        this.average = average;
        this.link = link;
    }
    
}




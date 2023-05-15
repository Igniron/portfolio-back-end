
package com.backend.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String description;
    private String link;
    private String img;
    
    
    public Project()
    {

    }

    public Project( Long id, String title, String description, String link, String img)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.link = link;
        this.img = img;
    }
    
}

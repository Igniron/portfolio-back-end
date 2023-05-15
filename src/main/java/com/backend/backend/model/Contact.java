
package com.backend.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contact {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String home;
    private String location;
    private String phone;
    private String email;
    private String instagram;
    private String twitter;
    private String linkedin;
    private String github;
  
    
    public Contact()
    {

    }

    public Contact( Long id, String home, String location, String phone, String email, String instagram, String twitter, String linkedin, String github)
    {
        this.id = id;
        this.home = home;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.instagram = instagram;
        this.twitter = twitter;
        this.linkedin = linkedin;
        this.github = github;
    }
    
    
}

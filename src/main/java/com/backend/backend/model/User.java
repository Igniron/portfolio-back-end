
package com.backend.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;




@Getter @Setter
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String user;
    private String password;
    
    
    public User ()
    {
        
    }
    
    public User( Long id, String user, String password)
    {
        this.id = id;
        this.user = user;
        this.password = password;
    }
            
}

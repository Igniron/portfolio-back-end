
package com.backend.backend.service;


import com.backend.backend.model.Person;

public interface IPersonService {
    
    public Person getPerson(Long id);
    public void updatePerson (Person per);
    
}

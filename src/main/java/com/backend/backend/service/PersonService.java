
package com.backend.backend.service;

import com.backend.backend.model.Person;
import com.backend.backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService{

    @Autowired
    public PersonRepository persRepo;
    
    @Override
    public Person getPerson(Long id) 
    {
        return persRepo.findById(id).orElse(null);
    }

    @Override
    public void updatePerson(Person per) {
        
    }
    
    
}

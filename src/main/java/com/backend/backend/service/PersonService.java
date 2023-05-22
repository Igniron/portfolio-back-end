
package com.backend.backend.service;

import com.backend.backend.model.Person;
import com.backend.backend.repository.PersonRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService{

    

    @Autowired
    public PersonRepository persRepo;
    
    @Override
    public Person getPerson(Long id) {
        Optional<Person> optionalPerson = persRepo.findById(id);
        return optionalPerson.orElse(null);
    }

    @Override
    public void updatePerson(Person per) {
        
        persRepo.save(per);
        
    }
    
    
}

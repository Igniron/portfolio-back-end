
package com.backend.backend.service;


import com.backend.backend.model.Person;
import java.util.List;

public interface IPersonService {
    
    public List<Person> getPerson();
    
    public void updatePerson (Person per);
    
}

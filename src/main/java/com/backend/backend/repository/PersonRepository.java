
package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.backend.model.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
    
    
    
}

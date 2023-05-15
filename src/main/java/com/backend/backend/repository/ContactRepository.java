
package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.backend.model.Contact;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
    
}

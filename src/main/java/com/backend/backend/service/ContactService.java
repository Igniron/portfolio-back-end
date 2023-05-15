
package com.backend.backend.service;

import com.backend.backend.model.Contact;
import com.backend.backend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService{

    @Autowired
    public ContactRepository conRepo;
    
    @Override
    public Contact getContact(Long id) {
        return conRepo.findById(id).orElse(null);
    }

    @Override
    public void updateContact() {
        
    }
    
}

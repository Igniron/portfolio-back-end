
package com.backend.backend.service;

import com.backend.backend.model.Contact;
import com.backend.backend.repository.ContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService{

    

    @Autowired
    public ContactRepository conRepo;
    
    @Override
    public List<Contact> getContact() {
       return conRepo.findAll();
    }

    @Override
    public void updateContact(Contact con) {
        conRepo.save(con);
    }
    
}

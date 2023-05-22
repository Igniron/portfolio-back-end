
package com.backend.backend.service;

import com.backend.backend.model.Contact;


public interface IContactService {
    
    public Contact getContact(Long id);
    
    public void updateContact (Contact con);
}


package com.backend.backend.service;

import com.backend.backend.model.Contact;
import java.util.List;


public interface IContactService {
    
    public List<Contact> getContact();
    public void updateContact (Contact con);
}

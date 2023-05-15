
package com.backend.backend.service;

import com.backend.backend.model.Contact;
import java.util.List;


public interface IContactService {
    
    public Contact getContact(Long id);
    public void updateContact ();
}

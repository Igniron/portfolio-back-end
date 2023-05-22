
package com.backend.backend.service;

import com.backend.backend.model.User;
import com.backend.backend.repository.UserRepository;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



@Service
public class UserService implements IUserService{

    @Autowired
    public UserRepository userRepo;

    @Override
    public List<User> getUser() {
        return userRepo.findAll();
    }
    
    
    
    
    
    
}

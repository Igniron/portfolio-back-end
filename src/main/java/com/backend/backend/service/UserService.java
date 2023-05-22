
package com.backend.backend.service;

import com.backend.backend.model.User;
import com.backend.backend.repository.UserRepository;

import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



@Service
public class UserService implements IUserService{

    @Autowired
    public UserRepository userRepo;

    @Override
    public User getUser(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        return optionalUser.orElse(null);
    }
    
    
    
    
    
    
}


package com.backend.backend.service;

import com.backend.backend.model.Education;
import com.backend.backend.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{

    @Autowired
    public EducationRepository eduRepo;
    
    
    @Override
    public List<Education> getEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void createEducation(Education edu) {
           eduRepo.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void updateEducation() {
        
    }
    
}

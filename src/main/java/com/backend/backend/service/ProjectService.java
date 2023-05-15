
package com.backend.backend.service;


import com.backend.backend.model.Project;
import com.backend.backend.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService{

    @Autowired
    public ProjectRepository proRepo;
    
    
    @Override
    public List<Project> getProject() {
        return proRepo.findAll();
    }

    @Override
    public void createProject(Project pro) {
        proRepo.save(pro);
    }

    @Override
    public void deleteProject(Long id) {
       proRepo.deleteById(id);
    }

    @Override
    public void updateProject() {
        
    }
    
    
    
}


package com.backend.backend.service;

import com.backend.backend.model.Project;
import java.util.List;



public interface IProjectService {
    
    public List<Project> getProject();
    public void createProject (Project pro);
    public void deleteProject (Long id);
    public void updateProject (Project pro);
    
}


package com.backend.backend.service;

import com.backend.backend.model.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> getEducation();
    public void createEducation (Education edu);
    public void deleteEducation (Long id);
    public void updateEducation ();
    
}

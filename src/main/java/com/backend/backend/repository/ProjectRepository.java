
package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.backend.model.Project;



@Repository
public interface ProjectRepository  extends JpaRepository<Project, Long>{
    
}

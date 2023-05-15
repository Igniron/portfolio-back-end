
package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.backend.model.Education;



@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{
    
}

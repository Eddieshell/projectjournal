/*
 * JpaRespository interface for ProjectUpdate
 * Handles all basic CRUD funtions.
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.ProjectUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Eddie
 */
public interface ProjectUpdateRepository extends JpaRepository<ProjectUpdate,Integer> {
    
    
}

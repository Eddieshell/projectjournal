/*
 * JpaREpository interface for UserProject
 * Handles all basic CRUD funtions.
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.UserProject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Eddie
 */
public interface UserProjectRepository extends JpaRepository<UserProject, Integer> {
    
}

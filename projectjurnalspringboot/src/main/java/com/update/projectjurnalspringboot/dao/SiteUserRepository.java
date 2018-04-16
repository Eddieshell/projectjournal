/*
 * JpaRepository interface for SiteUser
 * Handles all basic CRUD funtions.
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Eddie
 */
public interface SiteUserRepository extends JpaRepository<SiteUser, String>{
    
}

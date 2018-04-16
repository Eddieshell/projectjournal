/*
 * JpaRepository Interface for PersonProfile
 * Handles all basic CRUD funtions.
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.PersonProfile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Eddie
 */
public interface PersonProfileRepository extends JpaRepository<PersonProfile, Integer> {
    
}

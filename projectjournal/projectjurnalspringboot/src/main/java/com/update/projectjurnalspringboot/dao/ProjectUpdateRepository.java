/*
<<<<<<< HEAD
 * JpaRespository interface for ProjectUpdate
 * Handles all basic CRUD funtions.
=======
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
>>>>>>> 44b3f02fcf162eb0c364c0a91b826d8717958890
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

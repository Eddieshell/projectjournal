/*
<<<<<<< HEAD
 * JpaREpository interface for UserProject
 * Handles all basic CRUD funtions.
=======
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
>>>>>>> 44b3f02fcf162eb0c364c0a91b826d8717958890
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.UserProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Eddie
 */
@Repository
public interface UserProjectRepository extends JpaRepository<UserProject, Integer> {
    
}

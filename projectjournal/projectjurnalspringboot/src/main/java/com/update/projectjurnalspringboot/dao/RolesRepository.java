/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Eddie
 */

public interface RolesRepository extends JpaRepository<Roles, Integer> {
    
}

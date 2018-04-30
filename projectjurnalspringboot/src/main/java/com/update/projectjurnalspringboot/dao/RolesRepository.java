/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Eddie
 */
@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.update.projectjurnalspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

/**
 *
 * @author Eddie
 */
@Entity
public class UserType {
    
    @Id    
    private int userTypeID; 
    
    @Column
    private String type;

    public int getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}

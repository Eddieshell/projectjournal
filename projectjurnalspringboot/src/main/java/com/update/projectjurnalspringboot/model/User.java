/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.update.projectjurnalspringboot.model;

import java.util.Objects;

/**
 *
 * @author Eddie
 */
public class User {
    
    private String userName;
    private int userType;
    private PersonProfile PersonProfile;
    private String password;
    private int roleID;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public PersonProfile getPersonProfile() {
        return PersonProfile;
    }

    public void setPersonProfile(PersonProfile PersonProfile) {
        this.PersonProfile = PersonProfile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.userName);
        hash = 97 * hash + this.userType;
        hash = 97 * hash + Objects.hashCode(this.PersonProfile);
        hash = 97 * hash + Objects.hashCode(this.password);
        hash = 97 * hash + this.roleID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.userType != other.userType) {
            return false;
        }
        if (this.roleID != other.roleID) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.PersonProfile, other.PersonProfile)) {
            return false;
        }
        return true;
    }
    
    
    
}

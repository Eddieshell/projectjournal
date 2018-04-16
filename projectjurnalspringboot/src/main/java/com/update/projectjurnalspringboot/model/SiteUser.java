/*
 * The SiteUser Model tracks and allows access to registard and logged in 
 * SiteUsers. UserName is a unique field and is used as the User ID. Spring
 * Security uses User ID to track User and Permissions.
 */
package com.update.projectjurnalspringboot.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * --Site User Model--
 * JPA Annotations
 * Getter & Setters
 * Equals and HashCode Overrides
 * @author Eddie
 */
@Entity
public class SiteUser {
    
    @Id    
    private String userName;

    @Column
    private int userType;

    @OneToMany
    private PersonProfile PersonProfile;

    @Column
    private String password;

    @Column
    private int roleID;

    @OneToMany
    private List<UserProject> userProjects;

    //Getters and Setters for the SiteUser Class    
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

    public List<UserProject> getUserProjects() {
        return userProjects;
    }

    public void setUserProjects(List<UserProject> userProjects) {
        this.userProjects = userProjects;
    }

    //HasCode and Equals Override for the SiteUser Class
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.userName);
        hash = 83 * hash + this.userType;
        hash = 83 * hash + Objects.hashCode(this.PersonProfile);
        hash = 83 * hash + Objects.hashCode(this.password);
        hash = 83 * hash + this.roleID;
        hash = 83 * hash + Objects.hashCode(this.userProjects);
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
        final SiteUser other = (SiteUser) obj;
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
        if (!Objects.equals(this.userProjects, other.userProjects)) {
            return false;
        }
        return true;
    }

}

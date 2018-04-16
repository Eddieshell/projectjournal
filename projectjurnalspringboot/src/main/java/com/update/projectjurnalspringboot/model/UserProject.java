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
public class UserProject {
    
    private int projectID;
    private String ProjectTitle;
    private String projectDiscription;
    private int projectOwnerID;

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getProjectTitle() {
        return ProjectTitle;
    }

    public void setProjectTitle(String ProjectTitle) {
        this.ProjectTitle = ProjectTitle;
    }

    public String getProjectDiscription() {
        return projectDiscription;
    }

    public void setProjectDiscription(String projectDiscription) {
        this.projectDiscription = projectDiscription;
    }

    public int getProjectOwnerID() {
        return projectOwnerID;
    }

    public void setProjectOwnerID(int projectOwnerID) {
        this.projectOwnerID = projectOwnerID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.projectID;
        hash = 17 * hash + Objects.hashCode(this.ProjectTitle);
        hash = 17 * hash + Objects.hashCode(this.projectDiscription);
        hash = 17 * hash + this.projectOwnerID;
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
        final UserProject other = (UserProject) obj;
        if (this.projectID != other.projectID) {
            return false;
        }
        if (this.projectOwnerID != other.projectOwnerID) {
            return false;
        }
        if (!Objects.equals(this.ProjectTitle, other.ProjectTitle)) {
            return false;
        }
        if (!Objects.equals(this.projectDiscription, other.projectDiscription)) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
 * UserProject Model controls the data for projects being tracked by 
 * a SiteUser. SiteUsers can have many UserProjects's
 */
package com.update.projectjurnalspringboot.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * -- UserProject Model--
 * JPA Annotations
 * Getter & Setters
 * Equals and HashCode Overrides
 * @author Eddie
 */

@Entity
public class UserProject {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int projectID;
    
    @Column
    private String ProjectTitle;
    
    @Column
    private String projectDiscription;
    
    @Column
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

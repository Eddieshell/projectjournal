/*
 * ProjectUpdates are the user updates created on a project
 * a project can have many Updates. Updates are identified
 * by an auto-generated ID integer. And will be displayed
 * in chronalogical order by LocalDate.
 */
package com.update.projectjurnalspringboot.model;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * -- projectUpdate Model--
 * JPA Annotations
 * Getter & Setters
 * Equals and HashCode Overrides
 * @author Eddie
 */

@Entity
public class projectUpdate {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int projectUpdateID;
    
    @Column
    private LocalDate projectUpdateDate;
    
    @Column    
    private String projectUpdateTitle;
    
    @Column
    private String projectUpdate;
    
    @Column
    private int projectID;

    public int getProjectUpdateID() {
        return projectUpdateID;
    }

    public void setProjectUpdateID(int projectUpdateID) {
        this.projectUpdateID = projectUpdateID;
    }

    public LocalDate getProjectUpdateDate() {
        return projectUpdateDate;
    }

    public void setProjectUpdateDate(LocalDate projectUpdateDate) {
        this.projectUpdateDate = projectUpdateDate;
    }

    public String getProjectUpdateTitle() {
        return projectUpdateTitle;
    }

    public void setProjectUpdateTitle(String projectUpdateTitle) {
        this.projectUpdateTitle = projectUpdateTitle;
    }

    public String getProjectUpdate() {
        return projectUpdate;
    }

    public void setProjectUpdate(String projectUpdate) {
        this.projectUpdate = projectUpdate;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.projectUpdateID;
        hash = 41 * hash + Objects.hashCode(this.projectUpdateDate);
        hash = 41 * hash + Objects.hashCode(this.projectUpdateTitle);
        hash = 41 * hash + Objects.hashCode(this.projectUpdate);
        hash = 41 * hash + this.projectID;
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
        final projectUpdate other = (projectUpdate) obj;
        if (this.projectUpdateID != other.projectUpdateID) {
            return false;
        }
        if (this.projectID != other.projectID) {
            return false;
        }
        if (!Objects.equals(this.projectUpdateTitle, other.projectUpdateTitle)) {
            return false;
        }
        if (!Objects.equals(this.projectUpdate, other.projectUpdate)) {
            return false;
        }
        if (!Objects.equals(this.projectUpdateDate, other.projectUpdateDate)) {
            return false;
        }
        return true;
    }
    
    
    
}

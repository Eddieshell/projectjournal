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
public class PersonProfile {
    
    private int personProfileID;
    private String firstName;
    private String lastName;
    private String personEmailAddress;
    private String personProfileImageLink;

    public int getPersonProfileID() {
        return personProfileID;
    }

    public void setPersonProfileID(int personProfileID) {
        this.personProfileID = personProfileID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonEmailAddress() {
        return personEmailAddress;
    }

    public void setPersonEmailAddress(String personEmailAddress) {
        this.personEmailAddress = personEmailAddress;
    }

    public String getPersonProfileImageLink() {
        return personProfileImageLink;
    }

    public void setPersonProfileImageLink(String personProfileImageLink) {
        this.personProfileImageLink = personProfileImageLink;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.personProfileID;
        hash = 79 * hash + Objects.hashCode(this.firstName);
        hash = 79 * hash + Objects.hashCode(this.lastName);
        hash = 79 * hash + Objects.hashCode(this.personEmailAddress);
        hash = 79 * hash + Objects.hashCode(this.personProfileImageLink);
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
        final PersonProfile other = (PersonProfile) obj;
        if (this.personProfileID != other.personProfileID) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.personEmailAddress, other.personEmailAddress)) {
            return false;
        }
        if (!Objects.equals(this.personProfileImageLink, other.personProfileImageLink)) {
            return false;
        }
        return true;
    }
    
    
    
}

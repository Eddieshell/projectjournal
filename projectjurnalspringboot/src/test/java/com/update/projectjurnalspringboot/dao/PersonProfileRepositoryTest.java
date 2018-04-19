/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.PersonProfile;
import java.util.List;
import java.util.Optional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Eddie
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonProfileRepositoryTest {
    
    @Autowired
    private PersonProfileRepository dao;
    
    public PersonProfileRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dao.deleteAll();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void insertProfile() {
        PersonProfile p = new PersonProfile();
        
        p.setFirstName("Eddie");
        p.setLastName("shell");
        p.setPersonEmailAddress("me@me.com");
        
        dao.save(p);
        Optional<PersonProfile> fromDB = dao.findById(p.getPersonProfileID());
        
        assertEquals(p, fromDB.get());
    }
    
}

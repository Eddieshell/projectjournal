/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.update.projectjurnalspringboot.dao;

import com.update.projectjurnalspringboot.model.ProjectUpdate;
import com.update.projectjurnalspringboot.model.SiteUser;
import com.update.projectjurnalspringboot.model.UserProject;
import java.time.LocalDate;
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
public class ProjectUpdateRepositoryTest {
    
    @Autowired
    ProjectUpdateRepository dao;
    
    @Autowired
    UserProjectRepository project;
    
    @Autowired
    SiteUserRepository user;
    
    public ProjectUpdateRepositoryTest() {
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
    public void createProjectUpdate() {
        Optional<SiteUser> u = user.findById("fakeuser");        
        
        UserProject up = new UserProject();
        
        String projectOwner = u.get().getUserName();
        
        up.setProjectTitle("Test");
        up.setProjectDiscription("The spoon ran away with the moon");
        up.setProjectOwnerID(projectOwner);  
        project.save(up);
        
        Optional<UserProject> fromDb = project.findById(up.getProjectID());
        
        
        assertEquals(up, fromDb.get());
        
        
        
        
    }
    
}

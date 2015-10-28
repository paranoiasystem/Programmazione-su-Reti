/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.studentiejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;

/**
 *
 * @author diego
 */
@Singleton
@LocalBean
@DataSourceDefinition(
name = "java:global/jdbc/sample",
className = "com.mysql.jdbc.Driver",
user = "root",
password = "root"
)
public class DatabasePopulator {

    @EJB
    private StudentEJB remote;
    private Student s1, s2;
    
    @PostConstruct
    private void populateDB(){
        s1 = new Student("123", "Diego", "Avella", 12);
        s2 = new Student("321", "Marco", "Ferraioli", 10);
        remote.createStudent(s1);
        remote.createStudent(s2);
    }
    
    @PreDestroy
    private void destroyDB(){
       remote.removeStudent(s1);
       remote.removeStudent(s2);
    }
}

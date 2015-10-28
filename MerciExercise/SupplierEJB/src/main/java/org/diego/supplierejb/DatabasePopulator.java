/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.supplierejb;

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
@DataSourceDefinition
(
className = "com.mysql.jdbc.Driver",
name = "java:global/jdbc/sample",
user = "root",
password= "root"
)
public class DatabasePopulator {
    
    @EJB
    private SupplyEJB remote;
    private Supply s1, s2;
    
    @PostConstruct
    private void populateDB(){
        s1 = new Supply("Diego", "Avella", "Anti-Borghesia Spa", "089", 30);
        s2 = new Supply("Dario", "Tecchia", "Sugar Spa", "088", 20);
        remote.createSupply(s1);
        remote.createSupply(s2);
    }
    
    @PreDestroy
    private void deleteDB(){
        remote.removeSupply(s1);
        remote.removeSupply(s2);
    }

    
}

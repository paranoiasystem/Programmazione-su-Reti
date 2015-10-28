/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.cdmodule;

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
password = "root"
)
public class DatabasePopulator {
    
    @EJB
    private CDEJB populator;
    private Cd cd_1, cd_2; 
    
    @PostConstruct
    private void populateDB(){
        cd_1 = new Cd("primo", "Pino Daniele", 13.5, "I so Pazz");
        cd_2 = new Cd("secondo", "Adriano Celentano", 10.6, "Quel Punto");
        populator.createCd(cd_1);
        populator.createCd(cd_2);
    }
    
    @PreDestroy
    private void cleanDB(){
        populator.deleteCd(cd_1);
        populator.deleteCd(cd_2);
    }
    
    
    
}

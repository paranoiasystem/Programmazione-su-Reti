/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diego.supplierejb;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DatabaseProducer {
    
    @Produces
    @PersistenceContext(unitName = "org.diego_SupplierEJB_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

}

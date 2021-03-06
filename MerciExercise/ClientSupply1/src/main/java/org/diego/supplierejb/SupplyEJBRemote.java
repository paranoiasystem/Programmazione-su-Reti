/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.supplierejb;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author diego
 */
@Remote
public interface SupplyEJBRemote {
    
    Supply createSupply(Supply s);
    Supply updateSupply(Supply s);
    void removeSupply(Supply s);
    List<Supply> findAll();
    List<Supply> findForName(String name);
    List<Supply> findForlastName(String lastName);
    Supply findForId(int id);
    List<Supply> findForOrder(int maxOrder);
    Supply order(int id);
    
}

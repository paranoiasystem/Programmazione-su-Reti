/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.cdmodule;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author diego
 */
@Remote
public interface CDEJBRemote {
    
    List<Cd> findAllCds();
    Cd createCd(Cd cd);
    Cd updateCd(Cd cd);
    void deleteCd(Cd cd);
    List<Cd> findForAuthor(String author);
    List<Cd> findForId(String id);
    Cd updatePrice(String id, double value);
    
}

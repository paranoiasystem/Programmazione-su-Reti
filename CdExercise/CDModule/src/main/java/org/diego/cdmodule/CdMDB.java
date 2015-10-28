/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.cdmodule;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;

    
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author diego
 */
@MessageDriven(mappedName = "jms/javaee7/Topic", activationConfig = {
    @ActivationConfigProperty(propertyName="acknowledgeMode",propertyValue="Auto-acknowledge")
})
public class CdMDB implements MessageListener {
    
    @EJB
    private CDEJBRemote remote;
    
    
    public CdMDB() {
    }
    
    @Override
    public void onMessage(Message message) {
        try{
        String mex = message.getBody(String.class);
        String[] arg = mex.split("-");
        remote.updatePrice(arg[0], Double.parseDouble(arg[1]));
        System.out.println("CD Aggiornato!");
        }catch(JMSException e){
            e.printStackTrace();
        }
    }
    
}

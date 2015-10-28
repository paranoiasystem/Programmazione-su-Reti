/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diego.clientupdate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client_2 {
    
    public static void main(String[] args) throws NamingException, IOException{
        Context ctx = new InitialContext();
        ConnectionFactory factory = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
        System.out.println("Inizializzazione...");
        System.out.println("Aggiorna i prezzi dei CD. nome-nuovoprezzo");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while(!(line=bf.readLine()).equals("quit")){
            try(JMSContext con = factory.createContext()){
                con.createProducer().send(topic, line);
            }
        }
        System.exit(0);
    }

}

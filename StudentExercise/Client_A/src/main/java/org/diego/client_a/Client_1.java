/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diego.client_a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.diego.studentiejb.Student;


public class Client_1 {
    
    private static final String HELP = "[ID]:[NUMBER] per aggiornare gli esami di uno studente, quit per uscire\n";
    
    public static void main(String[] args) throws NamingException, IOException{
        Context ctx = new InitialContext();
        ConnectionFactory factory = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
        String line = null;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("!help for list of commands");
        while(!(line = bf.readLine()).equals("quit")){
          if(line.equals("!help")){
              System.out.println(HELP);
          }else if(line.matches("\\d+:\\d+")){
              try(JMSContext c = factory.createContext()){
                  Student s = new Student();
                  String[] values = line.split(":");
                  s.setId(values[0]);
                  s.setNumberOfExams(Integer.parseInt(values[1]));
                  c.createProducer().send(topic, s);
              }
          }else{
              System.out.println("Comando non valido!");
          }
        }
        System.exit(0);
    }

}

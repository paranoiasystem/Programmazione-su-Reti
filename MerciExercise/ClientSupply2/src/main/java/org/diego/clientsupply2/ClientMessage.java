/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.clientsupply2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;

import javax.jms.JMSContext;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientMessage {
    
    private static final String HELP = "!quit per uscire, [ordina!]-[id per effettuare ordine]";

    public static void main(String[] args) throws IOException, NamingException {
        Context ctx = new InitialContext();
        ConnectionFactory factory = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
        System.out.println("Client inizializzato. !help per i comandi");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = bf.readLine()).equals("!quit")) {
            if (line.matches("ordina-\\d+")) {
                try (JMSContext context = factory.createContext()) {
                    context.createProducer().send(topic, line.substring(7));
                }
            } else if (line.equals("!help")) {
                System.out.println(HELP);
            } else {
                System.out.println("Comando non valido!");
            }
        }
    }

}

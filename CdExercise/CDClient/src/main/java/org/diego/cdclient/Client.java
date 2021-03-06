/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.cdclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.diego.cdmodule.CDEJBRemote;
import org.diego.cdmodule.Cd;

public class Client {
    

    public static void main(String[] args) throws NamingException, IOException {
        Context ctx = new InitialContext();
        CDEJBRemote remote = (CDEJBRemote) ctx.lookup("java:global/CDModule/CDEJB!org.diego.cdmodule.CDEJBRemote");
        Cd cd_1 = new Cd("primo", "Massimo Ranieri", 8.5, "Rose rosse");
        Cd cd_2 = new Cd("secondo", "Claudio Baglioni", 9.0, "Piccolo grande amore");
        Cd cd_3 = new Cd("terzo", "Iron Maiden", 10.0, "fear of the Dark");
        remote.createCd(cd_1);
        remote.createCd(cd_3);
        remote.createCd(cd_2);
        String line = null;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Comandi: find, id:(inserisci id), author:(inserisci autore)");
        while (!(line = bf.readLine()).equals("quit")) {
            if (line.equals("find")) {
                List<Cd> list = remote.findAllCds();
                for(Cd cds: list){System.out.println(cds);}
            }
            if(line.startsWith("id:")){
                String arg[] = line.split(":");
                if(arg.length == 2){
                System.out.println("Cerco i CD");
                List<Cd> list = remote.findForId(arg[1]);
                for(Cd cds: list){System.out.println(cds);}
                }
            }
            if(line.contains("author:")){
                System.out.println("Risultati per Ricerca per autore");
                String[] arg = line.split(":");
                List<Cd> list = remote.findForAuthor(arg[1]);
                for(Cd cds: list){System.out.println(cds);}
            }
        }
        System.exit(0);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diego.clientpopulate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.diego.studentiejb.Student;
import org.diego.studentiejb.StudentEJBRemote;

public class ClientDatabase{
    public static void main(String[] args) throws NamingException, IOException{
    Context ctx = new InitialContext();
    StudentEJBRemote remote = (StudentEJBRemote) ctx.lookup("java:global/StudentiEJB/StudentEJB!org.diego.studentiejb.StudentEJBRemote");
    remote.createStudent(new Student("4", "Marco", "Ferraioli", 12));
    remote.createStudent(new Student("5", "Angelo", "Passaro", 9));
    remote.createStudent(new Student("6", "Diego", "Avella", 10));
    String line = null;
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Client inizializzato: find per trovare gli studenti");
    while(!(line=bf.readLine()).equals("!quit")){
        switch(line){
            case "find": List<Student> list = remote.findAllStudent(); for(Student x: list){System.out.println(x);}
        }
    }
    System.exit(0);
    }

}

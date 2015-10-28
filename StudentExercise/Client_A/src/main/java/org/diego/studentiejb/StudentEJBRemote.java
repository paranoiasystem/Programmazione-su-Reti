/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diego.studentiejb;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author diego
 */
@Remote
public interface StudentEJBRemote {
    
    Student createStudent(Student aStudent);
    Student updateStudent(Student astudent);
    void removeStudent(Student aStudent);
    List<Student> findForLastName(String lastName);
    List<Student> findAllStudent();
    Student updateNumberOfExams(int number, String id);
    List<Student> findForId(String id);
    
}



package org.diego.clientweb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentEJB", targetNamespace = "http://studentiejb.diego.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentEJB {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.diego.clientweb.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createStudent", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.CreateStudent")
    @ResponseWrapper(localName = "createStudentResponse", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.CreateStudentResponse")
    @Action(input = "http://studentiejb.diego.org/StudentEJB/createStudentRequest", output = "http://studentiejb.diego.org/StudentEJB/createStudentResponse")
    public Student createStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        Student arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeStudent", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.RemoveStudent")
    @ResponseWrapper(localName = "removeStudentResponse", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.RemoveStudentResponse")
    @Action(input = "http://studentiejb.diego.org/StudentEJB/removeStudentRequest", output = "http://studentiejb.diego.org/StudentEJB/removeStudentResponse")
    public void removeStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        Student arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.diego.clientweb.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateStudent", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.UpdateStudent")
    @ResponseWrapper(localName = "updateStudentResponse", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.UpdateStudentResponse")
    @Action(input = "http://studentiejb.diego.org/StudentEJB/updateStudentRequest", output = "http://studentiejb.diego.org/StudentEJB/updateStudentResponse")
    public Student updateStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        Student arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.diego.clientweb.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findForLastName", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.FindForLastName")
    @ResponseWrapper(localName = "findForLastNameResponse", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.FindForLastNameResponse")
    @Action(input = "http://studentiejb.diego.org/StudentEJB/findForLastNameRequest", output = "http://studentiejb.diego.org/StudentEJB/findForLastNameResponse")
    public List<Student> findForLastName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns org.diego.clientweb.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateNumberOfExams", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.UpdateNumberOfExams")
    @ResponseWrapper(localName = "updateNumberOfExamsResponse", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.UpdateNumberOfExamsResponse")
    @Action(input = "http://studentiejb.diego.org/StudentEJB/updateNumberOfExamsRequest", output = "http://studentiejb.diego.org/StudentEJB/updateNumberOfExamsResponse")
    public Student updateNumberOfExams(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<org.diego.clientweb.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudents", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.GetStudents")
    @ResponseWrapper(localName = "getStudentsResponse", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.GetStudentsResponse")
    @Action(input = "http://studentiejb.diego.org/StudentEJB/getStudentsRequest", output = "http://studentiejb.diego.org/StudentEJB/getStudentsResponse")
    public List<Student> getStudents();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.diego.clientweb.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findForId", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.FindForId")
    @ResponseWrapper(localName = "findForIdResponse", targetNamespace = "http://studentiejb.diego.org/", className = "org.diego.clientweb.FindForIdResponse")
    @Action(input = "http://studentiejb.diego.org/StudentEJB/findForIdRequest", output = "http://studentiejb.diego.org/StudentEJB/findForIdResponse")
    public List<Student> findForId(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

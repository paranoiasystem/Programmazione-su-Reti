
package org.diego.clientweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.diego.clientweb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RemoveStudent_QNAME = new QName("http://studentiejb.diego.org/", "removeStudent");
    private final static QName _UpdateNumberOfExams_QNAME = new QName("http://studentiejb.diego.org/", "updateNumberOfExams");
    private final static QName _FindForIdResponse_QNAME = new QName("http://studentiejb.diego.org/", "findForIdResponse");
    private final static QName _FindForLastName_QNAME = new QName("http://studentiejb.diego.org/", "findForLastName");
    private final static QName _CreateStudent_QNAME = new QName("http://studentiejb.diego.org/", "createStudent");
    private final static QName _RemoveStudentResponse_QNAME = new QName("http://studentiejb.diego.org/", "removeStudentResponse");
    private final static QName _UpdateStudentResponse_QNAME = new QName("http://studentiejb.diego.org/", "updateStudentResponse");
    private final static QName _UpdateNumberOfExamsResponse_QNAME = new QName("http://studentiejb.diego.org/", "updateNumberOfExamsResponse");
    private final static QName _GetStudentsResponse_QNAME = new QName("http://studentiejb.diego.org/", "getStudentsResponse");
    private final static QName _UpdateStudent_QNAME = new QName("http://studentiejb.diego.org/", "updateStudent");
    private final static QName _CreateStudentResponse_QNAME = new QName("http://studentiejb.diego.org/", "createStudentResponse");
    private final static QName _GetStudents_QNAME = new QName("http://studentiejb.diego.org/", "getStudents");
    private final static QName _FindForLastNameResponse_QNAME = new QName("http://studentiejb.diego.org/", "findForLastNameResponse");
    private final static QName _FindForId_QNAME = new QName("http://studentiejb.diego.org/", "findForId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.diego.clientweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudents }
     * 
     */
    public GetStudents createGetStudents() {
        return new GetStudents();
    }

    /**
     * Create an instance of {@link CreateStudentResponse }
     * 
     */
    public CreateStudentResponse createCreateStudentResponse() {
        return new CreateStudentResponse();
    }

    /**
     * Create an instance of {@link UpdateNumberOfExamsResponse }
     * 
     */
    public UpdateNumberOfExamsResponse createUpdateNumberOfExamsResponse() {
        return new UpdateNumberOfExamsResponse();
    }

    /**
     * Create an instance of {@link UpdateStudentResponse }
     * 
     */
    public UpdateStudentResponse createUpdateStudentResponse() {
        return new UpdateStudentResponse();
    }

    /**
     * Create an instance of {@link UpdateStudent }
     * 
     */
    public UpdateStudent createUpdateStudent() {
        return new UpdateStudent();
    }

    /**
     * Create an instance of {@link GetStudentsResponse }
     * 
     */
    public GetStudentsResponse createGetStudentsResponse() {
        return new GetStudentsResponse();
    }

    /**
     * Create an instance of {@link FindForLastNameResponse }
     * 
     */
    public FindForLastNameResponse createFindForLastNameResponse() {
        return new FindForLastNameResponse();
    }

    /**
     * Create an instance of {@link FindForId }
     * 
     */
    public FindForId createFindForId() {
        return new FindForId();
    }

    /**
     * Create an instance of {@link FindForIdResponse }
     * 
     */
    public FindForIdResponse createFindForIdResponse() {
        return new FindForIdResponse();
    }

    /**
     * Create an instance of {@link RemoveStudent }
     * 
     */
    public RemoveStudent createRemoveStudent() {
        return new RemoveStudent();
    }

    /**
     * Create an instance of {@link UpdateNumberOfExams }
     * 
     */
    public UpdateNumberOfExams createUpdateNumberOfExams() {
        return new UpdateNumberOfExams();
    }

    /**
     * Create an instance of {@link CreateStudent }
     * 
     */
    public CreateStudent createCreateStudent() {
        return new CreateStudent();
    }

    /**
     * Create an instance of {@link RemoveStudentResponse }
     * 
     */
    public RemoveStudentResponse createRemoveStudentResponse() {
        return new RemoveStudentResponse();
    }

    /**
     * Create an instance of {@link FindForLastName }
     * 
     */
    public FindForLastName createFindForLastName() {
        return new FindForLastName();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "removeStudent")
    public JAXBElement<RemoveStudent> createRemoveStudent(RemoveStudent value) {
        return new JAXBElement<RemoveStudent>(_RemoveStudent_QNAME, RemoveStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNumberOfExams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "updateNumberOfExams")
    public JAXBElement<UpdateNumberOfExams> createUpdateNumberOfExams(UpdateNumberOfExams value) {
        return new JAXBElement<UpdateNumberOfExams>(_UpdateNumberOfExams_QNAME, UpdateNumberOfExams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindForIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "findForIdResponse")
    public JAXBElement<FindForIdResponse> createFindForIdResponse(FindForIdResponse value) {
        return new JAXBElement<FindForIdResponse>(_FindForIdResponse_QNAME, FindForIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindForLastName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "findForLastName")
    public JAXBElement<FindForLastName> createFindForLastName(FindForLastName value) {
        return new JAXBElement<FindForLastName>(_FindForLastName_QNAME, FindForLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "createStudent")
    public JAXBElement<CreateStudent> createCreateStudent(CreateStudent value) {
        return new JAXBElement<CreateStudent>(_CreateStudent_QNAME, CreateStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "removeStudentResponse")
    public JAXBElement<RemoveStudentResponse> createRemoveStudentResponse(RemoveStudentResponse value) {
        return new JAXBElement<RemoveStudentResponse>(_RemoveStudentResponse_QNAME, RemoveStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "updateStudentResponse")
    public JAXBElement<UpdateStudentResponse> createUpdateStudentResponse(UpdateStudentResponse value) {
        return new JAXBElement<UpdateStudentResponse>(_UpdateStudentResponse_QNAME, UpdateStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNumberOfExamsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "updateNumberOfExamsResponse")
    public JAXBElement<UpdateNumberOfExamsResponse> createUpdateNumberOfExamsResponse(UpdateNumberOfExamsResponse value) {
        return new JAXBElement<UpdateNumberOfExamsResponse>(_UpdateNumberOfExamsResponse_QNAME, UpdateNumberOfExamsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "getStudentsResponse")
    public JAXBElement<GetStudentsResponse> createGetStudentsResponse(GetStudentsResponse value) {
        return new JAXBElement<GetStudentsResponse>(_GetStudentsResponse_QNAME, GetStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "updateStudent")
    public JAXBElement<UpdateStudent> createUpdateStudent(UpdateStudent value) {
        return new JAXBElement<UpdateStudent>(_UpdateStudent_QNAME, UpdateStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "createStudentResponse")
    public JAXBElement<CreateStudentResponse> createCreateStudentResponse(CreateStudentResponse value) {
        return new JAXBElement<CreateStudentResponse>(_CreateStudentResponse_QNAME, CreateStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "getStudents")
    public JAXBElement<GetStudents> createGetStudents(GetStudents value) {
        return new JAXBElement<GetStudents>(_GetStudents_QNAME, GetStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindForLastNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "findForLastNameResponse")
    public JAXBElement<FindForLastNameResponse> createFindForLastNameResponse(FindForLastNameResponse value) {
        return new JAXBElement<FindForLastNameResponse>(_FindForLastNameResponse_QNAME, FindForLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindForId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentiejb.diego.org/", name = "findForId")
    public JAXBElement<FindForId> createFindForId(FindForId value) {
        return new JAXBElement<FindForId>(_FindForId_QNAME, FindForId.class, null, value);
    }

}

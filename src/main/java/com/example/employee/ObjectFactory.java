//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.04 at 10:41:48 PM IST 
//


package com.example.employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.employee package. 
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

    private final static QName _RemoveEmployeeResponse_QNAME = new QName("http://www.example.com/employee", "RemoveEmployeeResponse");
    private final static QName _GetAllEmployeesRequest_QNAME = new QName("http://www.example.com/employee", "GetAllEmployeesRequest");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://www.example.com/employee", "GetEmployeeResponse");
    private final static QName _GetEmployeeRequest_QNAME = new QName("http://www.example.com/employee", "GetEmployeeRequest");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://www.example.com/employee", "GetAllEmployeesResponse");
    private final static QName _RemoveEmployeeRequest_QNAME = new QName("http://www.example.com/employee", "RemoveEmployeeRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveEmployeeResponse }
     * 
     */
    public RemoveEmployeeResponse createRemoveEmployeeResponse() {
        return new RemoveEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployeesRequest }
     * 
     */
    public GetAllEmployeesRequest createGetAllEmployeesRequest() {
        return new GetAllEmployeesRequest();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeRequest }
     * 
     */
    public GetEmployeeRequest createGetEmployeeRequest() {
        return new GetEmployeeRequest();
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link RemoveEmployeeRequest }
     * 
     */
    public RemoveEmployeeRequest createRemoveEmployeeRequest() {
        return new RemoveEmployeeRequest();
    }

    /**
     * Create an instance of {@link EmployeeDetails }
     * 
     */
    public EmployeeDetails createEmployeeDetails() {
        return new EmployeeDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/employee", name = "RemoveEmployeeResponse")
    public JAXBElement<RemoveEmployeeResponse> createRemoveEmployeeResponse(RemoveEmployeeResponse value) {
        return new JAXBElement<RemoveEmployeeResponse>(_RemoveEmployeeResponse_QNAME, RemoveEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/employee", name = "GetAllEmployeesRequest")
    public JAXBElement<GetAllEmployeesRequest> createGetAllEmployeesRequest(GetAllEmployeesRequest value) {
        return new JAXBElement<GetAllEmployeesRequest>(_GetAllEmployeesRequest_QNAME, GetAllEmployeesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/employee", name = "GetEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/employee", name = "GetEmployeeRequest")
    public JAXBElement<GetEmployeeRequest> createGetEmployeeRequest(GetEmployeeRequest value) {
        return new JAXBElement<GetEmployeeRequest>(_GetEmployeeRequest_QNAME, GetEmployeeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/employee", name = "GetAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/employee", name = "RemoveEmployeeRequest")
    public JAXBElement<RemoveEmployeeRequest> createRemoveEmployeeRequest(RemoveEmployeeRequest value) {
        return new JAXBElement<RemoveEmployeeRequest>(_RemoveEmployeeRequest_QNAME, RemoveEmployeeRequest.class, null, value);
    }

}

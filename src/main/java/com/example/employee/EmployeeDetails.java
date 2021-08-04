//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.04 at 10:41:48 PM IST 
//


package com.example.employee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employeename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eircode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDetails", propOrder = {
    "employeeid",
    "employeename",
    "location",
    "eircode"
})
public class EmployeeDetails {

    protected int employeeid;
    @XmlElement(required = true)
    protected String employeename;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String eircode;

    /**
     * Gets the value of the employeeid property.
     * 
     */
    public int getEmployeeid() {
        return employeeid;
    }

    /**
     * Sets the value of the employeeid property.
     * 
     */
    public void setEmployeeid(int value) {
        this.employeeid = value;
    }

    /**
     * Gets the value of the employeename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeename() {
        return employeename;
    }

    /**
     * Sets the value of the employeename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeename(String value) {
        this.employeename = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the eircode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEircode() {
        return eircode;
    }

    /**
     * Sets the value of the eircode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEircode(String value) {
        this.eircode = value;
    }

}

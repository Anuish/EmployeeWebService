package com.example.employee;

public class Employee {
    public int employeeId;
    public String employeeName;
    public String location;
    public String eircode;


    public Employee(int employeeId, String employeeName, String location, String eircode) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.location = location;
        this.eircode = eircode;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getLocation() {
        return location;
    }

    public String getEircode() {
        return eircode;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }
}

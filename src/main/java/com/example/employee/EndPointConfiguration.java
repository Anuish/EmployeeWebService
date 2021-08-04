package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import java.util.List;
import java.util.stream.Collectors;

@Endpoint
public class EndPointConfiguration {
    @Autowired
    EmployeeServiceImpl services;


    @PayloadRoot(namespace = "http://www.example.com/employee", localPart = "GetEmployeeRequest")
    @ResponsePayload
    public JAXBElement<GetEmployeeResponse> getEmployee(@RequestPayload GetEmployeeRequest request){
        GetEmployeeResponse response = new GetEmployeeResponse();
        Employee employee = services.getEmployee(request.getEmployeeId());
        response.setEmployeeDetails(mapEmployee(employee));
        return new ObjectFactory().createGetEmployeeResponse(response);
    }

    @PayloadRoot(namespace = "http://www.example.com/employee", localPart = "GetAllEmployeesRequest")
    @ResponsePayload
    public JAXBElement<GetAllEmployeesResponse> getAllEmployees(@RequestPayload GetAllEmployeesRequest request){
        GetAllEmployeesResponse response = new GetAllEmployeesResponse();
        List<EmployeeDetails> allEmployeeDetails = services.getAllEmployees()
                .stream().map(emp -> mapEmployee(emp))
                .collect(Collectors.toList());
        response.getEmployeeDetails().addAll(allEmployeeDetails);
        return new ObjectFactory().createGetAllEmployeesResponse(response);

    }

    @PayloadRoot(namespace = "http://www.example.com/employee", localPart = "RemoveEmployeeRequest")
    @ResponsePayload
    public JAXBElement<RemoveEmployeeResponse> removeEmployee(@RequestPayload RemoveEmployeeRequest request){
        RemoveEmployeeResponse response = new RemoveEmployeeResponse();
        boolean status = services.removeEmployee(request.getEmployeeid());
        response.setStatus(status);
        return new ObjectFactory().createRemoveEmployeeResponse(response);
    }


    private EmployeeDetails mapEmployee(Employee employee) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setEmployeeid(employee.getEmployeeId());
        employeeDetails.setEmployeename(employee.getEmployeeName());
        employeeDetails.setLocation(employee.getLocation());
        employeeDetails.setEircode(employee.getEircode());
        return employeeDetails;
    }
}

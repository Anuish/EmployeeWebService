package com.example.employee;

import java.util.ArrayList;
import java.util.List;

public class OfflineRepository {
    public static List<Employee> getEmployees(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(123, "Madu", "Carlow", "C01 D5G1"));
        empList.add(new Employee(124, "Clare", "Dublin", "D02 G2A6"));
        empList.add(new Employee(125, "Dino", "Cork", "C09 D5G5"));
        empList.add(new Employee(126, "Abbie", "Sligo", "S01 F5P3"));
        empList.add(new Employee(127, "Gaby", "Limerick", "L01 L1G9"));
        return empList;

    }
}

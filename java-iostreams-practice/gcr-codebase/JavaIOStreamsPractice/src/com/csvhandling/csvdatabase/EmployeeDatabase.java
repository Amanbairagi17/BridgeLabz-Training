package com.csvhandling.csvdatabase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDatabase {
    List<Employee> employees;
    public EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void show() {
    	for(Employee employee : employees) {
    		System.out.println(employee);
    	}
    }
}
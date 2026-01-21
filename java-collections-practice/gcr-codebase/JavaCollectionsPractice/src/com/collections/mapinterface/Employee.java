package com.collections.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {

            // if department not present
            if (!map.containsKey(emp.department)) {
                map.put(emp.department, new ArrayList<>());
            }

            // add employee to department list
            map.get(emp.department).add(emp);
        }

        System.out.println(map);
    }
}

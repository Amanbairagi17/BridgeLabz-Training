package com.jsondata.databasetojsonreport;

import java.util.*;

public class DummyDatabase {

    public static List<Employee> getEmployees() {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Aman", "IT", 60000));
        list.add(new Employee(2, "Rahul", "HR", 45000));
        list.add(new Employee(3, "Neha", "Finance", 70000));

        return list;
    }
}

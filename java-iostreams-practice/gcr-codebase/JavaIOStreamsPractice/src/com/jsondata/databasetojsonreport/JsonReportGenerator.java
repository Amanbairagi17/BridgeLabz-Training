package com.jsondata.databasetojsonreport;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;

public class JsonReportGenerator {

    public static void main(String[] args) throws Exception {

        // pretend this came from database
        List<Employee> employees = DummyDatabase.getEmployees();

        ObjectMapper mapper = new ObjectMapper();

        // generate JSON report file
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("src/jsonfiles/employee-report.json"), employees);

        System.out.println("JSON report generated");
    }
}

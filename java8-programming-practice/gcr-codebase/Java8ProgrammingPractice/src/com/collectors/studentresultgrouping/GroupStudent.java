package com.collectors.studentresultgrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class GroupStudent {
	public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Aman", "A"),
                new Student("Neha", "B"),
                new Student("Ravi", "A"),
                new Student("Priya", "C"),
                new Student("Vikas", "B")
        );

        Map<String, List<String>> groupedStudents =
                students.stream()
                        .collect(groupingBy(
                                Student::getGradeLevel,
                                mapping(Student::getName, toList())
                        ));

        groupedStudents.forEach((grade, names) ->
                System.out.println(grade + " -> " + names));
    }
}

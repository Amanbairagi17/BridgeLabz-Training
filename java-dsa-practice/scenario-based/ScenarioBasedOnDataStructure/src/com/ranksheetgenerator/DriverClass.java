package com.ranksheetgenerator;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
		// District 1 (already sorted)
        List<Student> d1 = new ArrayList<>();
        d1.add(new Student(1, "Aman", 95));
        d1.add(new Student(2, "Ravi", 90));
        d1.add(new Student(3, "Neha", 85));

        // District 2 (already sorted)
        List<Student> d2 = new ArrayList<>();
        d2.add(new Student(4, "Karan", 98));
        d2.add(new Student(5, "Simran", 90));
        d2.add(new Student(6, "Rahul", 80));

        // District 3 (already sorted)
        List<Student> d3 = new ArrayList<>();
        d3.add(new Student(7, "Pooja", 100));
        d3.add(new Student(8, "Vikas", 92));

        List<List<Student>> districts = new ArrayList<>();
        districts.add(d1);
        districts.add(d2);
        districts.add(d3);

        MergeList mergeList = new MergeList(districts);
        List<Student> resultList = mergeList.mergeAll();
       
        int rank = 1;
        for (Student s : resultList) {
            System.out.println(
                "Rank " + rank + " : " +
                s.name + "  Marks : " + s.marks
            );
            rank++;
        }
	}
}

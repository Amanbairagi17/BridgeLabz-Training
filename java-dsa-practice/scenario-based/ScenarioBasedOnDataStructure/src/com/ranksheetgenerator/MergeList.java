package com.ranksheetgenerator;

import java.util.ArrayList;
import java.util.List;

public class MergeList {

	//list of district that store couple of list of students score
	List<List<Student>>districts = new ArrayList<>();
	 
	
	public MergeList(List<List<Student>>districts) {
		this.districts = districts;
	}
	
	//method for iterate through on all lists
	public List<Student> mergeAll() {

        while (districts.size() > 1) {

            List<Student> list1 = districts.remove(0);
            List<Student> list2 = districts.remove(0);

            List<Student> merged = merge(list1, list2);

            districts.add(merged);
        }

        return districts.get(0);
    }
	
	//merger two sorted list in descending order
	public List<Student> merge(List<Student> left, List<Student> right) {

		List<Student> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {

            // sort by marks (descending)
            if (left.get(i).marks > right.get(j).marks) {
                result.add(left.get(i));
                i++;
            }
            else if (left.get(i).marks < right.get(j).marks) {
                result.add(right.get(j));
                j++;
            }
            else {
                // equal marks → maintain stability
                result.add(left.get(i));
                i++;
            }
        }

        // remaining elements
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
	
//	public void printFinalList(){
//		// Print rank sheet
//        System.out.println("STATE RANK LIST\n");
//
//        int rank = 1;
//        for (Student s : result) {
//            System.out.println(
//                "Rank " + rank + " : " +
//                s.name + "  Marks = " + s.marks
//            );
//            rank++;
//        }
//	}
}

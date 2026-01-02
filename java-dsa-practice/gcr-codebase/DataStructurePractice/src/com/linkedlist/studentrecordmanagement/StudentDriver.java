package com.linkedlist.studentrecordmanagement;

public class StudentDriver {
	public static void main(String[] args) {
		//create a singly linked list
		StudentLinkedList list = new StudentLinkedList();
		
		//adding linked node in linked list
		list.addAtBegining(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Rohan", 21, 'B');
        list.addAtPosition(3, "Sita", 19, 'A',2);
        
        //display detail
        list.dispalyDetail();
        
        //search by rollNo
        list.searchRoll(2);
        //update grade
        list.updateGrade(2, 'A');
        //delete by rollNo
        list.deleteByRoll(1);

        System.out.println("\nAfter Updates:");
        list.dispalyDetail();
	}
}

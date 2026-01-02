package com.linkedlist.studentrecordmanagement;

public class StudentDriver {
	public static void main(String[] args) {
		StudentLinkedList list = new StudentLinkedList();
		list.addAtBegining(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Rohan", 21, 'B');
        list.addAtPosition(3, "Sita", 19, 'A',2);
        
        list.dispalyDetail();

        list.searchRoll(2);
        list.updateGrade(2, 'A');
        list.deleteByRoll(1);

        System.out.println("\nAfter Updates:");
        list.dispalyDetail();
	}
}

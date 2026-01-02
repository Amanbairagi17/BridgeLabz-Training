package com.linkedlist.studentrecordmanagement;

public class StudentLinkedList {
	private StudentNode head;
	
	//adding student at begining of the list
	public void addAtBegining(int rollNo, String name, int age, char grade) {
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		newNode.next = head;
		head = newNode;
	}
	
	//adding student at end of the list
	public void addAtEnd(int rollNo, String name, int age, char grade) {
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		
		if(head == null) head = newNode;
		StudentNode temp = head;
		
		while(temp.next != null) temp = temp.next;
		temp.next = newNode;
	}
	
	//add at given index (1-based indexing)
	public void addAtPosition(int rollNo, String name, int age, char grade, int position) {
		if(position <= 1) {
			 addAtBegining(rollNo, name, age, grade);
			 return;
		}
		
		StudentNode temp = head;
		
		for(int i=0 ; i<position && temp != null ; i++) {
			temp = temp.next;
		}
		
		if(temp == null) return;
		
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	//deleted by roll No 
	public void deleteByRoll(int roll) {
		//if head is null
		if(head == null) return;
		
		//if we have only node
		if(head.rollNo == roll) {
			head = head.next;
			return;
		}
		
		StudentNode curr = head;
		//traversing to the previous of the deleted node
		while(curr.next != null && curr.next.rollNo != roll) {
			curr = curr.next;
		}
		//pointing curr node after a node
		if(curr.next != null) curr.next = curr.next.next;
	}
	
	//search by rollNo
	public void searchRoll(int roll) {
		StudentNode temp = head;
		
		while(temp != null) {
			if(temp.rollNo == roll) {
				System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Student not found !!");
	}
	
	//updating grade
	public void updateGrade(int roll, char grade) {
		StudentNode temp = head;
		
		while(temp != null) {
			if(temp.rollNo == roll) {
				temp.grade = grade;
				return;
			}
			temp = temp.next;
		}
	}
	
	//Display all details
	public void dispalyDetail() {
		StudentNode temp = head;
        if (temp == null) {
            System.out.println("No student records");
            return;
        }
        while (temp != null) {
            System.out.println(
                "Roll: " + temp.rollNo +
                ", Name: " + temp.name +
                ", Age: " + temp.age +
                ", Grade: " + temp.grade
            );
            temp = temp.next;
        }
	}

}

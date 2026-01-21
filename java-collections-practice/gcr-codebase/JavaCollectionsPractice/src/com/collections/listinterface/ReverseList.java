package com.collections.listinterface;

import java.util.ArrayList;

public class ReverseList {
	public static void reverseList(ArrayList<Integer> list) {
		int n = list.size()-1;
		
		int i=0 ;
		int j=n;
		
		while(i<j) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j,temp);
			i++;
			j--;
		}
	}
	
	public static Node reverseLinkedList(Node head) {
		Node temp = head;
		Node prev = null;
		Node next = null;
		
		while(temp != null) {
			next = temp.next;
			temp.next = prev;
			
			prev = temp;
			temp = next;
			
		}
		
		return prev;
	}
	
	
	public static void print(Node head) {
		if(head == null) System.out.println("List is null");
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(78);
		Node e = new Node(23);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(8);
		list.add(20);
		list.add(76);
		list.add(85);
		list.add(84);
		
		System.out.println(a.data);
		Node head = reverseLinkedList(a);
		print(head);
		
		reverseList(list);
		System.out.println(list);
		
		
	}
}

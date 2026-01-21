package com.collections.listinterface;

public class FindNthFromEnd {
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
	
	private static Node findNode(Node head, int k) {
		Node temp = head;
		
		while(temp != null && --k>0) {
			temp = temp.next;
		}
		return temp;
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
		
		Node head = reverseLinkedList(a);
		Node newHead = findNode(head, 2);
		System.out.println(newHead.data);
	}
}

package com.linkedlist;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public class Main {
	public static void print(Node head) {
		while(head != null) {
			System.out.print(head.data + "->");
		 	head = head.next;
		}
	}
	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(13);
		node1.next = node2;
		Node node3 = new Node(15);
		node2.next = node3;
		Node node4 = new Node(16);
		node3.next = node4;
		
		print(node1);
		
		
	}
}

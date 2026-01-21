package com.collections.queueinterface;

import java.net.Socket;

public class CircularBuffer {
	private int[] buffer;
	private int rear;
	private int front;
	private int count;
	private int size;
	
	public CircularBuffer(int size) {
		this.size = size;
		this.buffer = new int[size];
		this.rear = 0;
		this.front = 0;
		this.count =0;
	}
	
	public void insert(int num) {
		if(count == size) {
			front = (front + 1) % size;
		}else {
			count++;
		}
		buffer[rear] = num;
		rear = (rear + 1) % size;
	}
	
	public void display() {
		System.out.print("Buffer [ ");
		 for (int i = 0; i < count; i++) {
	            int index = (front + i) % size;
	            System.out.print(buffer[index] + " ");
	        }
		 System.out.println("]");
	}
	
	public static void main(String[] args) {
		CircularBuffer c = new CircularBuffer(3);
		c.insert(4);
		c.insert(34);
		c.insert(9);
		c.display();
		c.insert(34);
		c.display();
		c.insert(23);
		c.display();
	}
}

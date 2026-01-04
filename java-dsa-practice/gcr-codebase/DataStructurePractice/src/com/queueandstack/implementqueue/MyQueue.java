package com.queueandstack.implementqueue;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	//method to add num in queue
	void add(int num) {
		//if stack is empty then add element
		if(stack1.size() == 0) stack1.add(num);
		else {//remove all element from stack 1 add in stack 2
			while(stack1.size() > 0) {
				stack2.add(stack1.pop());
			}
			
			stack1.add(num);// add element in stack1
			// now remove all element from stack 2 add in stack 1
			while(stack2.size() > 0) {
				stack1.add(stack2.pop());
			}
		}
	}
	
	//return peek element
	int peek() {
		return stack1.peek();
	}
	
	//delete element from stack1
	int pop() {
		return stack1.pop();
	}
	
	//check if stack is empty or not
	boolean empty() {
		if(stack1.isEmpty()) return true;
		return false;
		
	}

	@Override
	public String toString() {
		return "MyQueue : " + stack1 ;
	}
	
}

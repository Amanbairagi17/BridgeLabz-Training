package com.roundaboutvehicleflow;

import java.nio.channels.Pipe.SourceChannel;
import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {
	private VehicleNode headNode = null;
	private VehicleNode tailNode = null;
	private Queue<String> waitingQueue = new LinkedList<String>();
	
	private final int MAX_SIZE_QUEUE = 5;
	
    // Add vehicle to waiting queue
	void addVehicle(String vehicleNumber) {
		if(waitingQueue.size() == MAX_SIZE_QUEUE) {
			System.out.println("Vehicle not entered, Queue size full");
			return;
		}
		
		waitingQueue.offer(vehicleNumber);
		System.out.println("Vehicle number " +vehicleNumber+ " is added ");
	}
	
    // Move vehicle from queue to roundabout
	void enterRoundabout() {
		if(waitingQueue.isEmpty()) {
			System.out.println("No Vehicle available in queue, Queue underflow !!");
			return;
		}
		
		String vehicleNumber = waitingQueue.poll();
		VehicleNode vehicleNode = new VehicleNode(vehicleNumber);
		
		if(headNode == null) {// head is null then add node with head node and move tail to node and connect it with head node for circular linkedlist
			headNode = tailNode = vehicleNode;
			tailNode = headNode;
			tailNode.nextNode = headNode;//circular linkedlist
		}
		else {// if head is not null then first add node after tail node move node to tail and connect tail with head
			tailNode.nextNode = vehicleNode;
			tailNode = vehicleNode;
			tailNode.nextNode = headNode;
		}
		
		System.out.println("Vehicle number " +vehicleNumber + " is added to roungabout....");
	}
	
	//remove vehicle from roundabout
	void removeFromRoundabout(String vehicleNumber) {
		if(headNode == null) {//when linkedlist is empty
			System.out.println("No vehicle found !!");
			//System.out.println("Vehicle number" + vehicleNumber+ " removed from Roundabout");
			return;
		}
		
		VehicleNode currNode = headNode, prevNode = tailNode;
		
		do {//currNode matches with given vehicle number
			if(currNode.vehicleNumber.equalsIgnoreCase(vehicleNumber)) {
				if(headNode == currNode && tailNode == currNode) { // if head and tail point to the same one Only one node exist in linkedlist
					headNode = tailNode = null;
				}else {
					if(currNode == headNode ) headNode = headNode.nextNode; //if curr equal to head then move head node to next 
					if(currNode == tailNode) tailNode = prevNode; // if curr equals to tail then move it prev 
					
					prevNode.nextNode = currNode.nextNode;
					tailNode.nextNode = headNode;
				}
				System.out.println("Vehicle number" + vehicleNumber+ " removed from Roundabout");
				return;
			}
			prevNode = currNode;// prev shifting currNode 
			currNode = currNode.nextNode; // curr going to the next Node
			
			System.out.println("No Vehicle found with "+vehicleNumber+ " vehicle number");
		}while(currNode != headNode);
	}
	
	//print roundabout
	void printRoundabout() {
		if(headNode == null) {
			System.out.println("No vehicle available yet, Round about is empty");
			return;
		}
		
		VehicleNode tempNode = headNode;
		
		do {
			System.out.println(tempNode.vehicleNumber +" -> ");
			tempNode = tempNode.nextNode;
		}while(tempNode != headNode);
		System.out.println("Back to Start!!");
	}
	
	//print availble vehicle in wiating queue
	void printQueue() {
		System.out.println("Availble vehicle in queue : " +waitingQueue);
	}
}

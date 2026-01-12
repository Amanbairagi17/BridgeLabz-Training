package com.customerqueuemanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallCenterManager {
	//Queue for normal people
	private Queue<Customer> normalQueue = new LinkedList<>();
 
	//Queue for priority customer (VIP customer)
    private PriorityQueue<Customer> vipQueue = new PriorityQueue<>(
        (a, b) -> Long.compare(a.arrivalTime, b.arrivalTime)
    );

    //map for frequency of call 
    private HashMap<String, Integer> freqencyCall = new HashMap<>();
    
    
	//incoming call
	void receiveCall(Customer customer) {
        if (customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP call added: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal call added: " + customer.name);
        }

        freqencyCall.put(customer.id, freqencyCall.getOrDefault(customer.id, 0) + 1);
    }
	
	// Handle next call
    void handleNextCall() {
        Customer next;

        if (!vipQueue.isEmpty()) {
            next = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            next = normalQueue.poll();
        } else {
            System.out.println("No calls to handle");
            return;
        }

        System.out.println("Handling call from: " + next.name +
            (next.isVIP ? " (VIP)" : " (Normal)")
        );
    }
    
    // Show call statistics
    void showCallStats() {
        if (freqencyCall.isEmpty()) {
            System.out.println("No call records available");
            return;
        }

        System.out.println("\n--- Monthly Call Count ---");
        for (Map.Entry<String, Integer> entry : freqencyCall.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey()
                    + " | Calls: " + entry.getValue());
        }
    }
}

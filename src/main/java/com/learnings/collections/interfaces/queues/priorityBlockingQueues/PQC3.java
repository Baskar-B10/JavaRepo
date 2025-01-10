package com.learnings.collections.interfaces.queues.priorityBlockingQueues;// Java program to demonstrate
// PriorityBlockingQueue(int initialCapacity) 
// constructor 

import java.util.concurrent.PriorityBlockingQueue; 

public class PQC3 {

	public static void main(String[] args) 
	{ 
		// define capacity of PriorityBlockingQueue 
		int capacity = 15; 

		// create object of PriorityBlockingQueue 
		// using PriorityBlockingQueue(int initialCapacity) 
		// constructor 
		PriorityBlockingQueue<Integer> pbq 
			= new PriorityBlockingQueue<Integer>(capacity); 

		// add numbers 
		pbq.add(1); 
		pbq.add(2); 
		pbq.add(3); 

		// print queue 
		System.out.println("PriorityBlockingQueue:" + pbq); 
	} 
}

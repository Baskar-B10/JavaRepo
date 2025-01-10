package com.learnings.collections.interfaces.queues.priorityBlockingQueues;// Java program to demonstrate adding elements
// to the PriorityBlockingQueue 

import java.util.concurrent.PriorityBlockingQueue; 

public class AddingElementsExample { 

	public static void main(String[] args) 
	{ 
		// define capacity of PriorityBlockingQueue 
		int capacity = 15; 

		// create object of PriorityBlockingQueue 
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

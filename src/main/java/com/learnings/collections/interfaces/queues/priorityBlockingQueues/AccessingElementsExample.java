package com.learnings.collections.interfaces.queues.priorityBlockingQueues;// Java Program Demonstrate accessing
// elements of PriorityBlockingQueue 

import java.util.concurrent.PriorityBlockingQueue; 

public class AccessingElementsExample { 
	public static void main(String[] args) 
	{ 
		// define capacity of PriorityBlockingQueue 
		int capacityOfQueue = 5; 

		// create object of PriorityBlockingQueue 
		PriorityBlockingQueue<Integer> PrioQueue 
			= new PriorityBlockingQueue<Integer>( 
				capacityOfQueue); 

		// Add elements to PriorityBlockingQueue 
		PrioQueue.add(464161); 
		PrioQueue.add(416165); 

		// print PrioQueue 
		System.out.println("PrioQueue: " + PrioQueue); 

		// get head of PriorityBlockingQueue 
		int head = PrioQueue.peek(); 

		// print head of PriorityBlockingQueue 
		System.out.println("Head of Queue: " + head); 
	} 
}

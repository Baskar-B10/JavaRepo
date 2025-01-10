package com.learnings.collections.interfaces.queues.priorityBlockingQueues;// Java program to demonstrate removing
// elements from the PriorityBlockingQueue 

import java.util.concurrent.PriorityBlockingQueue; 

public class RemovingElementsExample { 

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

		// remove all the elements 
		pbq.clear(); 

		// print queue 
		System.out.println("PriorityBlockingQueue:" + pbq); 
	} 
}

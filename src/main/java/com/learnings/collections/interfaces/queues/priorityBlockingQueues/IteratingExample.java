package com.learnings.collections.interfaces.queues.priorityBlockingQueues;// Java Program Demonstrate iterating
// over PriorityBlockingQueue 

import java.util.concurrent.PriorityBlockingQueue; 
import java.util.*; 

public class IteratingExample { 
	public static void main(String[] args) 
	{ 

		// define capacity of PriorityBlockingQueue 
		int capacityOfQueue = 5; 

		// create object of PriorityBlockingQueue 
		PriorityBlockingQueue<String> names 
			= new PriorityBlockingQueue<String>( 
				capacityOfQueue); 

		// Add names of students of girls college 
		names.add("Geeks"); 
		names.add("forGeeks"); 
		names.add("A"); 
		names.add("Computer"); 
		names.add("Portal"); 

		// Call iterator() method of PriorityBlockingQueue 
		Iterator iteratorVals = names.iterator(); 

		// Print elements of iterator 
		// created from PriorityBlockingQueue 
		System.out.println("The Names are:"); 

		while (iteratorVals.hasNext()) { 
			System.out.println(iteratorVals.next()); 
		} 
	} 
}

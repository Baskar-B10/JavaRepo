package com.learnings.collections.interfaces.queues.arrayBlockingQueue;// Java Program to Demonstrate iterating
// over ArrayBlockingQueue. 

import java.util.concurrent.ArrayBlockingQueue; 
import java.util.*; 

public class TraversingExample { 

	public static void main(String[] args) 
	{ 
		// Define capacity of ArrayBlockingQueue 
		int capacity = 5; 

		// Create object of ArrayBlockingQueue 
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity); 

		// Add 5 elements to ArrayBlockingQueue 
		queue.offer("User"); 
		queue.offer("Employee"); 
		queue.offer("Manager"); 
		queue.offer("Analyst"); 
		queue.offer("HR"); 

		// Print queue 
		System.out.println("Queue is " + queue); 

		// Call iterator() method and Create an iterator 
		Iterator iteratorValues = queue.iterator(); 

		// Print elements of iterator 
		System.out.println("\nThe iterator values:"); 
		while (iteratorValues.hasNext()) { 
			System.out.println(iteratorValues.next()); 
		} 
	} 
}

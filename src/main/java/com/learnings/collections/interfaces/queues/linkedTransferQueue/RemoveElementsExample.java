package com.learnings.collections.interfaces.queues.linkedTransferQueue;// Java Program Demonstrate removing
// elements of LinkedTransferQueue 

import java.util.concurrent.LinkedTransferQueue; 

class RemoveElementsExample { 
	public static void main(String[] args) 
	{ 
		// Initializing the queue 
		LinkedTransferQueue<Integer> queue 
			= new LinkedTransferQueue<Integer>(); 

		// Adding elements to this queue 
		for (int i = 1; i <= 5; i++) 
			queue.add(i); 

		// Printing the elements of the queue 
		System.out.println( 
			"The elements in the queue are:"); 
		for (Integer i : queue) 
			System.out.print(i + " "); 

		// remove() method will remove the specified 
		// element from the queue 
		queue.remove(1); 
		queue.remove(5); 

		// Printing the elements of the queue 
		System.out.println("\nRemaining elements in queue : "); 
		for (Integer i : queue) 
			System.out.print(i + " "); 
	} 
}

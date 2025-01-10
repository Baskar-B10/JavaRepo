package com.learnings.collections.interfaces.queues.arrayBlockingQueue;// Java program to demonstrate accessing
// elements of ArrayBlockingQueue 

import java.util.concurrent.ArrayBlockingQueue; 

public class AccessingElementsExample { 

	public static void main(String[] args) 
	{ 

		// Define capacity of ArrayBlockingQueue 
		int capacity = 5; 

		// Create object of ArrayBlockingQueue 
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity); 

		// Add element to ArrayBlockingQueue 
		queue.add(23); 
		queue.add(32); 
		queue.add(45); 
		queue.add(12); 

		// Print queue after adding numbers 
		System.out.println("After adding numbers queue is "); 
		System.out.println(queue); 

		// Print head of queue using peek() method 
		System.out.println("Head of queue " + queue.peek()); 
	} 
}

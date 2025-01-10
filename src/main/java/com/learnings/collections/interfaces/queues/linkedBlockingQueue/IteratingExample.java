package com.learnings.collections.interfaces.queues.linkedBlockingQueue;// Java Program Demonstrate iterating
// over LinkedBlockingQueue 

import java.util.concurrent.LinkedBlockingQueue; 
import java.util.Iterator; 

public class IteratingExample { 

	public static void main(String[] args) 
	{ 
		// define capacity of LinkedBlockingQueue 
		int capacityOfQueue = 7; 

		// create object of LinkedBlockingQueue 
		LinkedBlockingQueue<String> linkedQueue 
			= new LinkedBlockingQueue<String>(capacityOfQueue); 

		// Add element to LinkedBlockingQueue 
		linkedQueue.add("John"); 
		linkedQueue.add("Tom"); 
		linkedQueue.add("Clark"); 
		linkedQueue.add("Kat"); 

		// create Iterator of linkedQueue using iterator() method 
		Iterator<String> listOfNames = linkedQueue.iterator(); 

		// print result 
		System.out.println("list of names:"); 
		while (listOfNames.hasNext()) 
			System.out.println(listOfNames.next()); 
	} 
} 

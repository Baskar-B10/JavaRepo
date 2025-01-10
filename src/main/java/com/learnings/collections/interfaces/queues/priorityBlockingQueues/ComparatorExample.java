package com.learnings.collections.interfaces.queues.priorityBlockingQueues;// Java Program Demonstrate comparator()
// method and passing Comparator to PriorityBlockingQueue 

import java.util.concurrent.PriorityBlockingQueue; 
import java.util.*; 

public class ComparatorExample { 
	public static void main(String[] args) 
		throws InterruptedException 
	{ 

		// create object of PriorityBlockingQueue 
		PriorityBlockingQueue<Integer> PrioQueue 
			= new PriorityBlockingQueue<Integer>( 
				10, new Comparator<Integer>() { 
					public int compare(Integer a, Integer b) 
					{ 
						return a - b; 
					} 
				}); 

		// Add numbers to PriorityBlockingQueue 
		PrioQueue.put(45815616); 
		PrioQueue.put(4981561); 
		PrioQueue.put(4594591); 
		PrioQueue.put(9459156); 

		// get String representation of 
		// PriorityBlockingQueue 
		String str = PrioQueue.toString(); 

		// Creating a comparator using comparator() 
		Comparator comp = PrioQueue.comparator(); 

		// Displaying the comparator values 
		System.out.println("Comparator value: " + comp); 

		if (comp == null) 
			System.out.println( 
				"PriorityBlockingQueue follows natural ordering"); 
		else
			System.out.println( 
				"PriorityBlockingQueue follows : " + comp); 
	} 
}

package com.learnings.collections.interfaces.queues.linkedBlockingQueue;// Java program to demonstrate
// LinkedBlockingQueue() constructor 

import java.util.concurrent.LinkedBlockingQueue; 

public class LinkedBlockingQueueDemo { 

	public static void main(String[] args) 
	{ 

		// create object of LinkedBlockingQueue 
		// using LinkedBlockingQueue() constructor 
		LinkedBlockingQueue<Integer> lbq 
			= new LinkedBlockingQueue<Integer>(); 

		// add numbers 
		lbq.add(1); 
		lbq.add(2); 
		lbq.add(3); 
		lbq.add(4); 
		lbq.add(5); 

		// print queue 
		System.out.println("LinkedBlockingQueue:" + lbq); 
	} 
}

package com.learnings.collections.interfaces.queues.linkedBlockingQueue;// Java program to demonstrate
// LinkedBlockingQueue(int initialCapacity) constructor 

import java.util.concurrent.LinkedBlockingQueue; 

public class LinkedBlockingQueue2 {

	public static void main(String[] args) 
	{ 
		// define capacity of LinkedBlockingQueue 
		int capacity = 15; 

		// create object of LinkedBlockingQueue 
		// using LinkedBlockingQueue(int initialCapacity) 
		// constructor 
		LinkedBlockingQueue<Integer> lbq 
			= new LinkedBlockingQueue<Integer>(capacity); 

		// add numbers 
		lbq.add(1); 
		lbq.add(2); 
		lbq.add(3); 

		// print queue 
		System.out.println("LinkedBlockingQueue:" + lbq); 
	} 
}
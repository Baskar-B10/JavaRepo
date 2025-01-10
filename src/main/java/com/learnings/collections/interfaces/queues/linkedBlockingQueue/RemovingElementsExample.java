package com.learnings.collections.interfaces.queues.linkedBlockingQueue;// Java Program to Demonstrate removing
// elements from the LinkedBlockingQueue 

import java.util.concurrent.LinkedBlockingQueue; 

public class RemovingElementsExample { 

	public static void main(String[] args) 
	{ 
		// define capacity of LinkedBlockingQueue 
		int capacity = 15; 

		// create object of LinkedBlockingQueue 
		LinkedBlockingQueue<Integer> lbq 
			= new LinkedBlockingQueue<Integer>(capacity); 

		// add numbers 
		lbq.add(1); 
		lbq.add(2); 
		lbq.add(3); 

		// print queue 
		System.out.println("LinkedBlockingQueue:" + lbq); 

		// remove all the elements 
		lbq.clear(); 

		// print queue 
		System.out.println("LinkedBlockingQueue:" + lbq); 
	} 
}

package com.learnings.collections.interfaces.queues.arrayBlockingQueue;// Java Program to Demonstrate adding
// elements to an ArrayBlockingQueue. 

import java.util.concurrent.ArrayBlockingQueue; 

public class AddingElementsExample { 

	public static void main(String[] args) 
	{ 
		// define capacity of ArrayBlockingQueue 
		int capacity = 15; 

		// create object of ArrayBlockingQueue 
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity); 

		// add numbers 
		abq.add(1); 
		abq.add(2); 
		abq.add(3); 

		// print queue 
		System.out.println("ArrayBlockingQueue:" + abq); 
	} 
}

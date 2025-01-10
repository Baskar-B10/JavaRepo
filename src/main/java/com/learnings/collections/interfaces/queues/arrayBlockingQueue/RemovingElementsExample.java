package com.learnings.collections.interfaces.queues.arrayBlockingQueue;// Java program to demonstrate removal of
// elements from an AbstractQueue 

import java.util.concurrent.ArrayBlockingQueue; 

public class RemovingElementsExample { 

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

		// remove 223 
		boolean response = abq.remove(2); 

		// print Queue 
		System.out.println("Removal of 2 :" + response); 

		// print Queue 
		System.out.println("queue contains " + abq); 

		// remove all the elements 
		abq.clear(); 

		// print queue 
		System.out.println("ArrayBlockingQueue:" + abq); 
	} 
}

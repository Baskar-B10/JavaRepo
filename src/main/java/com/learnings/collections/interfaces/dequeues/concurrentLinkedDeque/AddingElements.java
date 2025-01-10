package com.learnings.collections.interfaces.dequeues.concurrentLinkedDeque;// Java Program Demonstrate adding
// elements to the ConcurrentLinkedDeque

import java.util.concurrent.*;

class AddingElements {

	public static void main(String[] args)
	{
		// create instance using ConcurrentLinkedDeque
		ConcurrentLinkedDeque<Integer> cld1
			= new ConcurrentLinkedDeque<Integer>();

		// Add element to the tail using
		// add or addLast methods
		cld1.add(12);
		cld1.add(110);

		// Add element to the head
		// using addFirst method
		cld1.addFirst(55);

		// Displaying the existing ConcurrentLinkedDeque
		System.out.println("Initial Elements in "
						+ "the LinkedDeque cld : "
						+ cld1);

		// create instance using ConcurrentLinkedDeque
		ConcurrentLinkedDeque<Integer> cld2
			= new ConcurrentLinkedDeque<Integer>();

		// Add elements of cld1 to the
		// cld2 using addAll method
		cld2.addAll(cld1);

		// Displaying the modified ConcurrentLinkedDeque
		System.out.println("Initial Elements in "
						+ "the LinkedDeque cld2: "
						+ cld2);
	}
}

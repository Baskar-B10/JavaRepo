package com.learnings.collections.interfaces.dequeues.concurrentLinkedDeque;// Java code to illustrate
// methods of ConcurrentLinkedDeque

import java.util.concurrent.*;

class ConcurrentLinkedDequeDemo {

	public static void main(String[] args)
	{

		// Create a ConcurrentLinkedDeque
		// using ConcurrentLinkedDeque() constructor
		ConcurrentLinkedDeque<Integer>
			cld = new ConcurrentLinkedDeque<Integer>();
		
		// add element to the front
		// using addFirst() method
		cld.addFirst(12);
		cld.addFirst(70);
		cld.addFirst(1009);
		cld.addFirst(475);

		// Displaying the existing ConcurrentLinkedDeque
		System.out.println("ConcurrentLinkedDeque: "
						+ cld);

		// Displaying the Last element
		// using getLast() method
		System.out.println("The Last element is: "
						+ cld.getLast());

		// Displaying the first element
		// using peekFirst() method
		System.out.println("First Element is: "
						+ cld.peekFirst());

		// Remove the Last element
		// using removeLast() method
		cld.removeLast();

		// Displaying the existing ConcurrentLinkedDeque
		System.out.println("ConcurrentLinkedDeque: "
						+ cld);
	}
}

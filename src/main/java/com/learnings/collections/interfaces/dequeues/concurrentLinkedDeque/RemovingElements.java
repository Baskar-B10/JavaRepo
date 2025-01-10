package com.learnings.collections.interfaces.dequeues.concurrentLinkedDeque;// Java Program to demonstrate removing
// elements of ConcurrentLinkedDeque

import java.util.concurrent.*;

class RemovingElements {
	public static void main(String[] args)
	{

		// Create a ConcurrentLinkedDeque
		// using ConcurrentLinkedDeque() constructor
		ConcurrentLinkedDeque<Integer> cld
			= new ConcurrentLinkedDeque<Integer>();

		// Add elements using add() method
		cld.add(40);
		cld.add(50);
		cld.add(60);
		cld.add(70);
		cld.add(80);

		// Displaying the existing LinkedDeque
		System.out.println(
			"Existing ConcurrentLinkedDeque: " + cld);

		// remove method removes the first
		// element of ConcurrentLinkedDeque
		// using remove() method
		System.out.println("Element removed: "
						+ cld.remove());

		// Remove 60 using remove(Object)
		System.out.println("60 removed: " + cld.remove(60));

		// Displaying the existing ConcurrentLinkedDeque
		System.out.println(
			"Modified ConcurrentLinkedDeque: " + cld);

		// Remove the first element
		cld.removeFirst();

		// Remove the Last element
		cld.removeLast();

		// Displaying the existing ConcurrentLinkedDeque
		System.out.println(
			"Modified ConcurrentLinkedDeque: " + cld);
	}
}

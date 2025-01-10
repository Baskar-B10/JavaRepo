package com.learnings.collections.interfaces.dequeues.concurrentLinkedDeque;// Java Program to Demonstrate accessing
// elements of ConcurrentLinkedDeque

import java.util.concurrent.*;
import java.util.*;

class Accessing {
	public static void main(String[] args)
	{

		// Creating an empty ConcurrentLinkedDeque
		ConcurrentLinkedDeque<String> cld
			= new ConcurrentLinkedDeque<String>();

		// Add elements into the ConcurrentLinkedDeque
		cld.add("Welcome");
		cld.add("To");
		cld.add("Geeks");
		cld.add("4");
		cld.add("Geeks");

		// Displaying the ConcurrentLinkedDeque
		System.out.println("Elements in the ConcurrentLinkedDeque: " + cld);

		// Displaying the first element
		System.out.println("The first element is: "
						+ cld.getFirst());

		// Displaying the Last element
		System.out.println("The Last element is: "
						+ cld.getLast());

		// Displaying the head of ConcurrentLinkedDeque
		System.out.println("The Head of ConcurrentLinkedDeque is: "
						+ cld.element());
	}
}

package com.learnings.collections.interfaces.dequeues.concurrentLinkedDeque;// Java code to illustrate iterating
// elements of ConcurrentLinkedDeque

import java.util.concurrent.*;
import java.util.*;

public class IteratingConcurrentLinkedDeque {

	public static void main(String args[])
	{
		// Creating an empty ConcurrentLinkedDeque
		ConcurrentLinkedDeque<String> deque
			= new ConcurrentLinkedDeque<String>();

		// Use add() method to add elements
		// into the ConcurrentLinkedDeque
		deque.add("Welcome");
		deque.add("To");
		deque.add("Geeks");
		deque.add("4");
		deque.add("Geeks");

		// Displaying the ConcurrentLinkedDeque
		System.out.println("ConcurrentLinkedDeque: "
						+ deque);

		// Creating an iterator
		Iterator fitr = deque.iterator();

		// Displaying the values
		// after iterating through the ConcurrentLinkedDeque
		System.out.println("The iterator values are: ");
		while (fitr.hasNext()) {
			System.out.println(fitr.next());
		}

		// Creating a desc_iterator
		Iterator ditr = deque.descendingIterator();

		// Displaying the values after iterating
		// through the ConcurrentLinkedDeque
		// in reverse order
		System.out.println("The iterator values are: ");
		while (ditr.hasNext()) {
			System.out.println(ditr.next());
		}
	}
}

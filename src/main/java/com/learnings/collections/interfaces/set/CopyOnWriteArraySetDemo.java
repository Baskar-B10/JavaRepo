package com.learnings.collections.interfaces.set;// Java program to Illustrate Iterating Over
// CopyOnWriteArraySet class

// Importing required classes
import java.util.*;
import java.util.concurrent.*;

// Main class
// IteratingCopyOnWriteArraySet
class CopyOnWriteArraySetDemo {

	// Main class
	public static void main(String[] args)
	{

		// Creating an instance of CopyOnWriteArraySet
		CopyOnWriteArraySet<String> set
			= new CopyOnWriteArraySet<>();

		// Initial an iterator
		Iterator itr = set.iterator();

		// Adding elements
		// using add() method
		set.add("GeeksforGeeks");

		// Display message only
		System.out.println("Set contains: ");

		// Printing the contents
		// of set to the console
		while (itr.hasNext())
			System.out.println(itr.next());

		// Iterator after adding an element
		itr = set.iterator();

		// Display message only
		System.out.println("Set contains:");

		// Printing the elements to the console
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}

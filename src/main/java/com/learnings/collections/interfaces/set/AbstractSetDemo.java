package com.learnings.collections.interfaces.set;// Java Program to Illustrate Methods
// of AbstractSet class

// Importing required classes
import java.util.*;

// Main class
public class AbstractSetDemo {

	// Main driver method
	public static void main(String[] args) throws Exception
	{

		// Try block to check for exceptions
		try {

			// Creating an empty TreeSet of integer type
			AbstractSet<Integer> abs_set
				= new TreeSet<Integer>();

			// Populating above TreeSet
			// using add() method
			abs_set.add(1);
			abs_set.add(2);
			abs_set.add(3);
			abs_set.add(4);
			abs_set.add(5);

			// Printing the elements inside TreeSet
			System.out.println("AbstractSet before "
							+ "removeAll() operation : "
							+ abs_set);

			// Creating an ArrayList of integer type
			Collection<Integer> arrlist2
				= new ArrayList<Integer>();

			// Adding elements to above ArrayList
			arrlist2.add(1);
			arrlist2.add(2);
			arrlist2.add(3);

			// Printing the ArrayList elements
			System.out.println("Collection Elements"
							+ " to be removed : "
							+ arrlist2);

			// Removing elements from AbstractSet specified
			// using removeAll() method
			abs_set.removeAll(arrlist2);

			// Printing the elements of ArrayList
			System.out.println("AbstractSet after "
							+ "removeAll() operation : "
							+ abs_set);
		}

		// Catch block to handle the exceptions
		catch (NullPointerException e) {

			// Display exception on console
			System.out.println("Exception thrown : " + e);
		}
	}
}

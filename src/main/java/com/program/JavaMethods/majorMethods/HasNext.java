package com.program.JavaMethods.majorMethods;// Java program to demonstrate
// the use of hasNext() method

// Importing java input output classes
// Importing all classesfrom
// java.util package
import java.util.*;

// Class
class HasNext {

	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{
		// Creating an ArrayList
		// Declaring the ArrayList
		ArrayList<String> list = new ArrayList<String>();

		// Adding (appending) new elements at
		// the end of the List
		// Custom inputs
		list.add("Geeks");
		list.add("for Geeks");

		// Declaring the Iterator
		Iterator<String> iterator = list.iterator();

		// Printing hasNext() values
		// Prints true because iterator has two more values
		System.out.println(iterator.hasNext());

		// Go to next value using next() method
		iterator.next();

		// Prints true because iterator has one more values
		System.out.println(iterator.hasNext());

		// Go to next value using next() method
		iterator.next();

		// Prints false because iterator has no more values
		System.out.println(iterator.hasNext());
	}
}

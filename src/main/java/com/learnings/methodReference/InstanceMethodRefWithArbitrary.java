package com.learnings.methodReference;// Java Program to Illustrate how One can use
// Instance type method reference to
// sort with custom comparator

// Importing required classes
import java.util.*;

// FindLastElementsUsingReverseSort class
public class InstanceMethodRefWithArbitrary {

	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{
		// Creating an empty ArrayList of user defined type
		// List of person
		List<String> personList = new ArrayList<>();

		// Adding elements to above object of List
		// using add() method
		personList.add("vicky");
		personList.add("poonam");
		personList.add("sachin");

		// Method reference to String type
		Collections.sort(personList,
						String::compareToIgnoreCase);

		// Printing the elements(names) on console
		personList.forEach(System.out::println);
	}
}

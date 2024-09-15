package com.learnings.streamAPI.basics.Introduction;// Java Program showcasing data source
// using an object as a data source

// Importing input output classes

import java.util.ArrayList;
import java.util.stream.Stream;

// Class
class StreamAsDataSourceCreation {

	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{
		// Data Source

		// Creating an arrayList object
		// Declaring object of String type
		ArrayList<String> gfgNames = new ArrayList<>();

		// Custom input elements to above object
		gfgNames.add("Dean");
		gfgNames.add("castee");
		gfgNames.add("robert");

		// Creating object of StreamDemo where StreamDemo is created
		// using arrayList and object as data source
		Stream<String> streamOfNames = gfgNames.stream();

		// Print and display element
		System.out.print(streamOfNames);
	}
}

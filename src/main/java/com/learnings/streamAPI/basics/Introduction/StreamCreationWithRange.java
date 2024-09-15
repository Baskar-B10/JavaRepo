package com.learnings.streamAPI.basics.Introduction;// Java Program showcasing data source
// using an array as a data source

// Importing java input output class

// Importing all classes from
// java.util package

// Importing class for additional operations,
// additionls and pipelines
import java.util.stream.IntStream;

// Class
class StreamCreationWithRange {

	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{
		// Creating a predefined stream using range method
		// Custom inputs for range as parameters
		var stream = IntStream.range(1, 100);

		// StreamDemo is created
		var max = stream.filter(number -> number % 4 == 0)
					.count();

		// Print and display the maximum number
		// from the stream
		System.out.println(max);
	}
}

package com.learnings.streamAPI.operations.combinationOfOperations.retrieveElelment;// Java code for forEach
// (Consumer action) in Java 8 
import java.util.*; 
import java.util.stream.Stream; 

class SortAndPrintSecondCharacterFromList {

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating a StreamDemo of Strings
		Stream<String> stream = Stream.of("SortAndPrintSecondCharacterFromList", "Geeks",
										"for", "GeeksforGeeks"); 

		// Using forEach(Consumer action) to print 
		// Character at index 1 in reverse order 
		stream.sorted(Comparator.reverseOrder()) 
			.flatMap(str -> Stream.of(str.charAt(1))) //or stream.map(s-> s.charAt(1))
			.forEach(System.out::println); 
	} 
} 

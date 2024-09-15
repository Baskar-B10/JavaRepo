package com.learnings.streamAPI.operations.intermediate.filter;// Java program to demonstrate
// filter by Object properties 

import java.io.*; 
import java.util.stream.Stream; 

class FilterByObjectProperties { 

	public static void filterByEvenElements() 
	{ 
		// create integer array 
		Integer[] myArray 
			= new Integer[] { 1, 4, 5, 7, 9, 10 }; 

		// create a stream and filter by 
		// even numbers predicate 
		Stream.of(myArray) 
			.filter(x -> x % 2 == 0) 
			.forEach(System.out::println); 
	} 

	public static void filterByStartsWith() 
	{ 
		// create String array 
		String[] myArray 
			= new String[] { "stream", "is", "a", 
							"sequence", "of", "elements", 
							"like",	 "list" }; 

		// create a stream and filter by 
		// starting string predicate 
		Stream<String> myStream = Stream.of(myArray); 
		myStream.filter(x -> x.startsWith("s")) 
			.forEach(System.out::println); 
	} 

	public static void filterByStartsWithVowelsRegex() 
	{ 
		// create string array 
		String[] myArray 
			= "I am 24 years old and I want to be in Tier I company"
				.split(" "); 

		// create a stream on myArray 
		Stream<String> myStream = Stream.of(myArray); 

		// filter by matching vowels regular expression 
		myStream.filter(x -> x.matches("(a|e|i|o|u)\\w*")) 
			.forEach(System.out::println); 
	} 

	public static void main(String[] args) 
	{ 
		// filters a stream by even elements 
		filterByEvenElements(); 
		System.out.println("======"); 

		// filters a stream by starting string 
		filterByStartsWith(); 
		System.out.println("======"); 

		// filters a stream by starting vowel 
		filterByStartsWithVowelsRegex(); 
	} 
}

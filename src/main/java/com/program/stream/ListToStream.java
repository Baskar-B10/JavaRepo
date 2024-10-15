package com.program.stream;// Java Program to convert
// List to StreamDemo in Java 8

import java.util.*; 
import java.util.stream.*;

class ListToStream {

	// Generic function to convert a list to stream 
	private static <T> Stream<T> convertListToStream(List<T> list) 
	{ 
		return list.stream(); 
	} 

	public static void main(String args[]) 
	{ 

		// Create a stream of integers 
		List<String> list = Arrays.asList("GeeksForGeeks", 
										"A computer portal", 
										"for Geeks"); 

		// Print the List 
		System.out.println("List: " + list); 

		// Convert List to stream 
		Stream<String> stream = convertListToStream(list); 

		// Print the StreamDemo
		System.out.println("StreamDemo from List: "
					+ Arrays.toString(stream.toArray())); 
	} 
} 

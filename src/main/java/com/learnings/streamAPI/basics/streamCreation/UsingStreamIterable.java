package com.learnings.streamAPI.basics.streamCreation;// Java program to create StreamDemo from Collections

import java.util.*; 
import java.util.stream.*; 

class UsingStreamIterable {

	// Function convert a List into StreamDemo
	private static <T> void getStream(Iterable<T> iterable) 
	{ 

		// Convert the iterator into a StreamDemo
		Stream<T> stream 
			= StreamSupport 
				.stream(iterable.spliterator(), 
						false); 

		// Iterate list first to last element 
		Iterator<T> it = stream.iterator(); 

		// Iterate stream object 
		while (it.hasNext()) { 
			System.out.print(it.next() + " "); 
		} 
	} 

	public static void main(String[] args) 
	{ 

		// Get the Iterable 
		Iterable<String> iterable 
			= Arrays.asList("a", "b", "c"); 

		// Get the StreamDemo from the Iterable
		getStream(iterable); 
	} 
} 

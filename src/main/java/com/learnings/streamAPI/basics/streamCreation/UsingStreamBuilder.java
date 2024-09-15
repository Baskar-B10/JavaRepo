package com.learnings.streamAPI.basics.streamCreation;// Java program to create StreamDemo from Collections

import java.util.*; 
import java.util.stream.Stream; 

class UsingStreamBuilder {

	// Function convert a List into StreamDemo
	private static <T> void getStream() 
	{ 

		// Create stream using StreamDemo builder()
		Stream.Builder<String> builder 
			= Stream.builder(); 

		// Adding elements in the stream of Strings 
		Stream<String> stream = builder.add("a") 
									.add("b") 
									.add("c") 
									.build(); 

		// Iterate list first to last element 
		Iterator<String> it = stream.iterator(); 

		// Iterate stream object 
		while (it.hasNext()) { 
			System.out.print(it.next() + " "); 
		} 
	} 

	public static void main(String[] args) 
	{ 

		// Get the StreamDemo using Builder
		getStream(); 
	} 
} 

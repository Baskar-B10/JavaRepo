package com.learnings.streamAPI.basics.streamCreation;// Java program to create empty StreamDemo

import java.util.*; 
import java.util.stream.Stream; 

class CreateStreamEmpty {

	// Function convert a List into StreamDemo
	private static void getStream() 
	{ 

		// Create stream from an array using StreamDemo.empty()
		Stream<String> streamOfArray 
			= Stream.empty(); 

		// Iterate list first to last element 
		Iterator<String> it 
			= streamOfArray.iterator(); 

		// Iterate stream object 
		while (it.hasNext()) { 
			System.out.print(it.next() + " "); 
		} 
	} 

	public static void main(String[] args) 
	{ 

		// Get the empty StreamDemo
		getStream(); 
	} 
} 

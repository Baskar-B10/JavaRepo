package com.learnings.streamAPI.basics.streamCreation;// Java program to create StreamDemo from Collections

import java.util.*; 
import java.util.stream.Stream; 

class UsingArrayStream {

	// Function convert a List into StreamDemo
	private static <T> void getStream(T[] arr) 
	{ 

		// Create stream from an array 
		// using Arrays.stream() 
		Stream<T> streamOfArray 
			= Arrays.stream(arr); 

		// Iterate list first to last element 
		Iterator<T> it 
			= streamOfArray.iterator(); 

		// Iterate stream object 
		while (it.hasNext()) { 
			System.out.print(it.next() + " "); 
		} 
	} 

	public static void main(String[] args) 
	{ 

		// Get the array 
		String[] arr 
			= new String[] { "a", "b", "c" }; 

		// Get the StreamDemo from the Array
		getStream(arr); 
	} 
} 

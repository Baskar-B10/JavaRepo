package com.learnings.streamAPI.basics.streamCreation;// Java program to create StreamDemo from Collections

import java.util.*; 
import java.util.stream.Stream; 

class UsingCollectionList {

	// Function convert a List into StreamDemo
	private static <T> void getStream(List<T> list) 
	{ 

		// Create stream object with the List 
		Stream<T> stream = list.stream(); 

		// Iterate list first to last element 
		Iterator<T> it = stream.iterator(); 

		// Iterate stream object 
		while (it.hasNext()) { 
			System.out.print(it.next() + " "); 
		} 
	} 

	public static void main(String[] args) 
	{ 

		// Create ArrayList of String 
		List<String> list = new ArrayList<>(); 

		// Add element in list 
		list.add("Geeks"); 
		list.add("for"); 
		list.add("Geeks"); 

		// Get the StreamDemo from the List
		getStream(list); 
	} 
} 

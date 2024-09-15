package com.learnings.streamAPI.operations.otherOperations;// Java program to demonstrate
// StreamDemo.ofNullable() method

import java.util.ArrayList;
import java.util.stream.Stream;
public class OfNullableExample {

	public static void main(String[] args) 
	{ 

		// Create a stream with null 
		Stream<String> value 
			= Stream.ofNullable(null);

		// Print values 
		System.out.println("Values of StreamDemo:");
		value.forEach(System.out::println);

		ArrayList<String> list = new ArrayList<String>();
		list.add("Aman");
		list.add("Suraj");
		list.add("Zufaq");

		list.add("Zufaq");

		// create a stream with ArrayList
		Stream<ArrayList<String>> values
				= Stream.ofNullable(list);

		// print values
		System.out.println("Values of StreamDemo:");
		values.forEach(System.out::println);
	} 
} 

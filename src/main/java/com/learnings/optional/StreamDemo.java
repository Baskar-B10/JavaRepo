package com.learnings.optional;// Java program to demonstrate
// Optional.stream() method 

import java.util.*; 

public class StreamDemo {

	public static void main(String[] args) 
	{ 

		// create a Optional 
		Optional<Integer> op 
			= Optional.of(9455); 

		// print value 
		System.out.println("Optional: "
						+ op); 

		// get the StreamDemo
		System.out.println("Getting the StreamDemo:");
		op.stream().forEach(System.out::println);

		Optional<Integer> op1
				= Optional.empty();

		// print value
		System.out.println("Optional: "
				+ op1);

		try {

			// get the Stream
			System.out.println("Getting the Stream:");
			op1.stream().forEach(System.out::println);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
} 

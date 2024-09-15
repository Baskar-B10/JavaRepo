package com.learnings.optional;// Java program to demonstrate
// Optional.of() method 

import java.util.*; 

public class OfDemo {

	public static void main(String[] args) 
	{ 

		// create a Optional 
		Optional<Integer> op 
			= Optional.of(9455); 

		// print value 
		System.out.println("Optional: "
						+ op);
		try {
			// create a Optional
			Optional<Integer> op1
					= Optional.of(null);

			// print value
			System.out.println("Optional: "
					+ op1);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
} 

package com.learnings.miscellaneous.supplier;// Java program to illustrate
// getAsLong() method 

import java.util.function.LongSupplier; 

public class LongExample {
	public static void main(String args[]) 
	{ 

		// Create a LongSupplier instance 
		LongSupplier 
			sup 
			= () -> (int)(Math.random() * 10); 

		// Get the long value 
		// Using getAsLong() method 
		System.out.println(sup.getAsLong()); 
	} 
} 

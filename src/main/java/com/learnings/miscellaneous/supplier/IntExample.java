package com.learnings.miscellaneous.supplier;// Java program to illustrate
// getAsInt method of IntSupplier Interface 

import java.util.function.IntSupplier; 

public class IntExample {
	public static void main(String args[]) 
	{ 

		// Create a IntSupplier instance 
		IntSupplier 
			sup 
			= () -> (int)(Math.random() * 10); 

		// Get the int value 
		// Using getAsInt() method 
		System.out.println(sup.getAsInt()); 
	} 
} 

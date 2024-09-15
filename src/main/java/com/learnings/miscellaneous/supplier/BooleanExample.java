package com.learnings.miscellaneous.supplier;// Java program to illustrate
// getAsBoolean() method of 
// BooleanSupplier Interface 

import java.util.function.BooleanSupplier; 

public class BooleanExample {
	public static void main(String args[]) 
	{ 

		// Create a BooleanSupplier instance 
		BooleanSupplier sup = () -> true; 

		// Get the boolean value 
		// Using getAsBoolean() method 
		System.out.println(sup.getAsBoolean()); 
	} 
} 

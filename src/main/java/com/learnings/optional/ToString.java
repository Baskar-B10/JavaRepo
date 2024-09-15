package com.learnings.optional;// Java program to demonstrate
// Optional.toString() method 

import java.util.*; 

public class ToString {

	public static void main(String[] args) 
	{ 

		// create a Optional 
		Optional<Integer> op 
			= Optional.of(452146); 

		// get value using toString 
		String value = op.toString(); 

		// print value 
		System.out.println("String Representation: "
						+ value);
		Optional<Integer> op1
				= Optional.empty();

		// get value using toString
		String value1 = op1.toString();

		// print value
		System.out.println("String Representation: "
				+ value1);
	} 
} 

package com.learnings.optional;// Java program to demonstrate
// Optional.ifPresentOrElse() method 

import java.util.*; 

public class IfPresentOrElse {

	public static void main(String[] args) 
	{ 

		// create a Optional 
		Optional<Integer> op 
			= Optional.of(9455); 

		// print value 
		System.out.println("Optional: "
						+ op); 

		// apply ifPresentOrElse 
		op.ifPresentOrElse( 
			(value) 
				-> { System.out.println( 
						"Value is present, its: "
						+ value); }, 
			() 
				-> { System.out.println( 
						"Value is empty"); });

		// create a Optional
		Optional<Integer> op1
				= Optional.empty();

		// print value
		System.out.println("Optional: "
				+ op1);

		try {

			// apply ifPresentOrElse
			op1.ifPresentOrElse(
					(value)
							-> { System.out.println(
							"Value is present, its: "
									+ value); },
					()
							-> { System.out.println(
							"Value is empty"); });
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
} 

package com.learnings.optional;// Java program to demonstrate
// Optional.orElseGet() method 

import java.util.*;

public class OrElseGet {

	public static void main(String[] args) 
	{ 

		// create a Optional 
		Optional<Integer> op 
			= Optional.of(9455); 

		// print supplier 
		System.out.println("Optional: "
						+ op); 

		// orElseGet supplier 
		System.out.println("Value by orElseGet"
						+ "(Supplier) method: "
						+ op.orElseGet( 
								() -> (int)(Math.random() * 10)));

		// create a Optional
		Optional<Integer> op1
				= Optional.empty();

		// print supplier
		System.out.println("Optional: "
				+ op1);

		try {

			// orElseGet supplier
			System.out.println("Value by orElseGet"
					+ "(Supplier) method: "
					+ op1.orElseGet(
					() -> (int)(Math.random() * 10)));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
} 

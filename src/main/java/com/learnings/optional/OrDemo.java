package com.learnings.optional;// Java program to demonstrate
// Optional.or() method 

import java.util.*;

public class OrDemo {

	public static void main(String[] args) 
	{ 

		// create a Optional 
		Optional<Integer> op 
			= Optional.of(9455); 

		// print supplier 
		System.out.println("Optional: "
						+ op); 

		// or supplier 
		System.out.println("Optional by or(() ->"
						+ " Optional.of(100)) method: "
						+ op.or(() -> Optional.of(100)));

		// create a Optional
		Optional<Integer> op1
				= Optional.empty();

		// print supplier
		System.out.println("Optional: "
				+ op1);

		try {

			// or supplier
			System.out.println("Optional by or(() ->"
					+ " Optional.of(100)) method: "
					+ op1.or(() -> Optional.of(100)));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
} 

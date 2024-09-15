package com.learnings.optional;// Java program to demonstrate
// Optional.filter() method 

import java.util.*; 

public class FilterDemo {

	public static void main(String[] args) 
	{ 

		// create a Optional 
		Optional<Integer> op 
			= Optional.of(9456); 

		// print value 
		System.out.println("Optional: "
						+ op); 

		// filter the value 
		System.out.println("Filtered value "
						+ "for odd or even: "
						+ op 
								.filter(num 
										-> num % 2 == 0));
		// create a Optional
		Optional<Integer> op1
				= Optional.empty();

		// print value
		System.out.println("Optional: "
				+ op1);

		try {

			// filter the value
			System.out.println("Filtered value "
					+ "for odd or even: "
					+ op1
					.filter(num
							-> num % 2 == 0));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
} 

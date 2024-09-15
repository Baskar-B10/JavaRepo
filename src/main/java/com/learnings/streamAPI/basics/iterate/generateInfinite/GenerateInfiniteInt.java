package com.learnings.streamAPI.basics.iterate.generateInfinite;

import java.util.Random;
import java.util.stream.*;

public class GenerateInfiniteInt {

	// SortByAscOrder method
	public static void main(String[] args) 
	{ 

		IntStream 

			// Iterate the IntStream with i 
			// by incrementing the value with 1 
			.iterate(0, i -> i + 1) 

			// Print the IntStream 
			// using forEach() method. 
			.forEach(System.out::println);

		// Create a Random object
		Random random = new Random();

		random

				// Get the next integer
				// using ints() method
				.ints()

				// Print the IntStream
				// using forEach() method.
				.forEach(System.out::println);

		// Create a Random object
		Random random1 = new Random();

		IntStream

				// Generate the next integer
				// using IntStream.generate()
				// and Random.nextInt()
				.generate(random1::nextInt)

				// Print the IntStream
				// using forEach() method.
				.forEach(System.out::println);
	} 
} 

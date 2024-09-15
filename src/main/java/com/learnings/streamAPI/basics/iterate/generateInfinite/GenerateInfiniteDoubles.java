package com.learnings.streamAPI.basics.iterate.generateInfinite;

import java.util.Random;
import java.util.stream.*;

public class GenerateInfiniteDoubles {

	// SortByAscOrder method
	public static void main(String[] args) 
	{ 

		DoubleStream 

			// Iterate the DoubleStream with i 
			// by incrementing the value with 1 
			.iterate(0, i -> i + 1) 

			// Print the DoubleStream 
			// using forEach() method. 
			.forEach(System.out::println);


		// Create a Random object
		Random random = new Random();

		random

				// Get the next double
				// using doubles() method
				.doubles()

				// Print the DoubleStream
				// using forEach() method.
				.forEach(System.out::println);

		// Create a Random object
		Random random1 = new Random();

		DoubleStream

				// Generate the next double
				// using DoubleStream.generate()
				// and Random.nextDouble()
				.generate(random1::nextDouble)

				// Print the DoubleStream
				// using forEach() method.
				.forEach(System.out::println);
	} 
} 

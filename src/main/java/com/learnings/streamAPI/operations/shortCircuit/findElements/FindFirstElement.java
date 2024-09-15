package com.learnings.streamAPI.operations.shortCircuit.findElements;// Java program to find first
// element of a StreamDemo in Java

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class FindFirstElement {

	// Function to find the 
	// first_elements in a StreamDemo
	public static <T> T 
	firstElementInStream(Stream<T> stream) 
	{ 
		T first_element 
			= stream 

				// findFirst() method returns 
				// the first element of stream 
				.findFirst() 

				// if stream is empty 
				// null is returned 
				.orElse(null); 

		return first_element; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		Stream<String> stream 
			= Stream.of("Geek_First", "Geek_2", 
						"Geek_3", "Geek_4", 
						"Geek_Last"); 

		// Print the first element of a StreamDemo
		System.out.println( 
			"First Element: "
			+ firstElementInStream(stream));

		// Creating a List of Integers
		List<Integer> list = Arrays.asList(3, 5, 7, 9, 11);

		// Using StreamDemo findFirst()
		Optional<Integer> answer = list.stream().findFirst();

		// if the stream is empty, an empty
		// Optional is returned.
		if (answer.isPresent()) {
			System.out.println(answer.get());
		}
		else {
			System.out.println("no value");
		}
	} 
} 

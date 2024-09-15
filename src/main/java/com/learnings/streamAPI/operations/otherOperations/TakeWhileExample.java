package com.learnings.streamAPI.operations.otherOperations;// Java program to demonstrate
// StreamDemo.takeWhile method

import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.Stream; 
public class TakeWhileExample {

	public static void main(String[] args) 
	{ 

		// create a stream of numbers from 1 to 10 
		Stream<Integer> stream 
			= Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10); 

		// apply takeWhile to take all the numbers 
		// matches passed predicate 
		List<Integer> list 
			= stream.takeWhile(number -> (number / 4 == 1)) 
				.collect(Collectors.toList()); 

		// print list 
		System.out.println(list);

		// create a stream of names
		Stream<String> streamString
				= Stream.of("aman", "amar", "suraj",
				"suvam", "Zahafuj");

		// apply takeWhile to take all the names
		// matches passed predicate
		List<String> listString
				= streamString.takeWhile(name -> (name.charAt(0) == 'a'))
				.collect(Collectors.toList());

		// print list
		System.out.println(listString);
	} 
} 

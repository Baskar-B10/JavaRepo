package com.learnings.streamAPI.operations.otherOperations;// Java program to demonstrate
// StreamDemo.dropWhile method

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class DropWhileExample {

	public static void main(String[] args)
	{

		// create a stream of names
		Stream<String> stream
			= Stream.of("aman", "amar", "suraj",
						"suvam", "Zahafuj");

		// apply dropWhile to drop all the names
		// matches passed predicate
		List<String> list
			= stream.dropWhile(name -> (name.charAt(0) == 'a'))
				.collect(Collectors.toList());

		// print list
		System.out.println(list);

		// create a stream of numbers from 1 to 10
		Stream<Integer> streamList
				= Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

		// apply dropWhile to drop all the numbers
		// matches passed predicate
		List<Integer> streamOutput
				= streamList.dropWhile(number -> (number / 4 == 1))
				.collect(Collectors.toList());

		// print list
		System.out.println(streamOutput);
	}
}

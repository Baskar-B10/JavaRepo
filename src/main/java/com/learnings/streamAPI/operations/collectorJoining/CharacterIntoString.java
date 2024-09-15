package com.learnings.streamAPI.operations.collectorJoining;// Java Program to demonstrate the working
// of the Collectors.joining() method

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Class
public class CharacterIntoString {

	// SortByAscOrder driver method
	public static void main(String[] args)
	{

		// Creating a custom character array
		char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o',
					'r', 'G', 'e', 'e', 'k', 's' };

		// Converting character array into string
		// using joining() method of Collectors class
		String chString
			= Stream.of(ch)
				.map(arr -> new String(arr))
				.collect(Collectors.joining());

		// Printing concatenated string
		System.out.println(chString);
		List<Character> ch1 = Arrays.asList(
				'G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G',
				'e', 'e', 'k', 's');
		String chStrings
				= ch1.stream().map(String::valueOf)
				.collect(Collectors.joining());

		// Printing the concatenated string
		System.out.println(chStrings);
	}
}

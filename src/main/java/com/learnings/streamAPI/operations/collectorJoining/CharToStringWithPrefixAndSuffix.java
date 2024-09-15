package com.learnings.streamAPI.operations.collectorJoining;// Java Program to demonstrate the working
// of the Collectors.joining() method

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharToStringWithPrefixAndSuffix {
	public static void main(String[] args)
	{
		// Create a character list
		List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's', 'f',
						'o', 'r', 'G', 'e', 'e', 'k', 's');

		// Convert the character list into String
		// using Collectors.joining() method
		// with, as the delimiter
		String chString
			= ch.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(", ", "[", "]"));

		// Print the concatenated String
		System.out.println(chString);
	}
}

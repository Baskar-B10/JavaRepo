package com.learnings.streamAPI.operations.intermediate.sorted;// Implementation of StreamDemo.sorted()
// to get a stream of sorted elements 
import java.util.stream.Stream;

class SortStringUsingCharacter {

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating an array of Strings 
		String[] array = { "SortStringUsingCharacter", "Geeks", "for",
						"GeeksforGeeks", "GeeksQuiz" }; 

		System.out.println("The sorted stream is :"); 

		// sorting the elements of array based 
		// on their last character 
		Stream.of(array).sorted((str1, str2) 
					-> Character.compare(str1 
					.charAt(str1.length() - 1), 
					str2.charAt(str2.length() - 1))) 
			.		 forEach(System.out::println); 
	} 
} 

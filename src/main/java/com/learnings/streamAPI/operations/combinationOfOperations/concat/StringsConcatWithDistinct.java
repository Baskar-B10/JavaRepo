package com.learnings.streamAPI.operations.combinationOfOperations.concat;// Implementation of StreamDemo.concat()
// method in Java 8 and removing 
// the duplicates 
import java.util.stream.Stream;

class StringsConcatWithDistinct {

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating two Streams 
		Stream<String> stream1 = Stream.of("Geeks", "for", "GeeksforGeeks"); 
		Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks", "for"); 

		// concatenating both the Streams 
		// with StreamDemo.concat() function
		// and displaying the result after 
		// removing the duplicates 
		Stream.concat(stream1, stream2).distinct().forEach(element -> System.out.println(element)); 
	} 
} 

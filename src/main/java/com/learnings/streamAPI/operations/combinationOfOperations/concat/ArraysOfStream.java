package com.learnings.streamAPI.operations.combinationOfOperations.concat;// Implementation of StreamDemo.concat()
// method in Java 8 with 2 Streams 
import java.util.stream.Stream;

class ArraysOfStream {

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Creating two Streams 
		Stream<String> stream1 = Stream.of("Geeks", "for"); 
		Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks"); 

		// concatenating both the Streams 
		// with StreamDemo.concat() function
		// and displaying the result 
		Stream.concat(stream1, stream2) 
			.forEach(element -> System.out.println(element));



		// Creating more than two Streams
		Stream<String> stream3 = Stream.of("Geeks");
		Stream<String> stream4 = Stream.of("GeeksQuiz");
		Stream<String> stream5 = Stream.of("GeeksforGeeks");
		Stream<String> stream6 = Stream.of("ListOfNumbers");

		// concatenating all the Streams
		// with StreamDemo.concat() function
		// and displaying the result
		Stream.concat(Stream.concat(Stream.concat(stream3,
						stream4), stream5), stream6)
				.forEach(element -> System.out.println(element));
	} 
} 

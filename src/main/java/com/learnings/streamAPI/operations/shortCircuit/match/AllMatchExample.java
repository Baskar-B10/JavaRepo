package com.learnings.streamAPI.operations.shortCircuit.match;// Java code for StreamDemo allMatch
// (Predicate predicate) to check whether 
// all elements of this stream match 
// the provided predicate.
import java.util.*;
import java.util.stream.Stream;

class AllMatchExample {
	
	// Driver code
	public static void main(String[] args) {
		
	// Creating a list of Integers
	List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
	
	// Check if all elements of stream
	// are divisible by 3 or not using 
	// StreamDemo allMatch(Predicate predicate)
	boolean answer = list.stream().allMatch(n-> n % 3 ==0);
	
	// Displaying the result
	System.out.println(answer);

	// Creating a StreamDemo of Strings
		Stream<String> stream = Stream.of("Geeks", "for",
				"GeeksQuiz", "GeeksforGeeks");

		// Check if all elements of stream
		// have length greater than 2 using
		// StreamDemo allMatch(Predicate predicate)
		boolean answers = stream.allMatch(str -> str.length() > 2);

		// Displaying the result
		System.out.println(answers);


		// Check if Character at 1st index is
		// UpperCase in all strings or not using
		// StreamDemo allMatch(Predicate predicate)
		// Creating a StreamDemo of Strings
		Stream<String> streams = Stream.of("Geeks", "for",
				"GeeksQuiz", "GeeksforGeeks");
		boolean answerss = streams.allMatch(str-> Character
				.isUpperCase(str.charAt(1)));

		// Displaying the result
		System.out.println(answerss);



}
}

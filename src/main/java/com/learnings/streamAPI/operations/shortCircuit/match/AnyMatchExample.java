package com.learnings.streamAPI.operations.shortCircuit.match;// Java code for StreamDemo anyMatch
// (Predicate predicate) to check whether 
// any element of this stream match 
// the provided predicate. 
import java.util.*;
import java.util.stream.Stream;

class AnyMatchExample {
	
	// Driver code 
	public static void main(String[] args) { 
		
	// Creating a list of Integers 
	List<Integer> list = Arrays.asList(3, 4, 6, 12, 20); 

	// StreamDemo anyMatch(Predicate predicate)
	boolean answer = list.stream().anyMatch(n 
					-> (n * (n + 1)) / 4 == 5); 
	
	// Displaying the result 
	System.out.println(answer);

		// Creating a StreamDemo of Strings
		Stream<String> stream = Stream.of("Geeks", "fOr",
				"GEEKSQUIZ", "GeeksforGeeks");

		// Check if Character at 1st index is
		// UpperCase in any string or not using
		// StreamDemo anyMatch(Predicate predicate)
		boolean answers = stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));

		// Displaying the result
		System.out.println(answers);
	}
} 

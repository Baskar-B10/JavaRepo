package com.learnings.streamAPI.operations.combinationOfOperations.retrieveElelment;// Java code for forEachOrdered
// (Consumer action) in Java 8 
import java.util.stream.Stream;


class PrintThirdElement {
	
	// Driver code 
	public static void main(String[] args) { 

	// Creating a StreamDemo of Strings
	Stream<String> stream = Stream.of("PrintThirdElement", "Geeks",
							"for", "GeeksforGeeks"); 
	
	// Using forEachOrdered(Consumer action) 
	stream.map(s-> s.charAt(2)) //or .flatMap(str -> StreamDemo.of(str.charAt(2)))
		.forEachOrdered(System.out::println); 
	

} 
} 

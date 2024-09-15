package com.learnings.streamAPI.operations.intermediate.mapToObj;// Java code for IntStream mapToObj
// (IntFunction mapper) 
import java.util.stream.Stream;
import java.util.stream.IntStream; 

class NumberToBinary {

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Creating an IntStream 
		IntStream stream = IntStream.range(3, 8); 

		// Creating a StreamDemo of Strings
		// Using IntStream mapToObj(IntFunction mapper) 
		// to store binary representation of 
		// elements in IntStream 
		Stream<String> stream1 = stream.mapToObj(num 
												-> Integer.toBinaryString(num)); 

		// Displaying an object-valued StreamDemo
		// consisting of the results of 
		// applying the given function. 
		stream1.forEach(System.out::println); 
	} 
} 

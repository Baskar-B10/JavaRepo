package com.learnings.streamAPI.operations.intermediate.mapToObj;// Java code for IntStream mapToObj
// (IntFunction mapper)

import java.math.BigInteger; 
import java.util.stream.Stream; 
import java.util.stream.IntStream; 

class IntegerToBigDecimal {

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Creating an IntStream 
		IntStream stream = IntStream.of(3, 5, 7, 9, 11); 

		// Creating a StreamDemo
		// Using IntStream mapToObj(IntFunction mapper) 
		Stream<BigInteger> stream1 = stream 
										.mapToObj(BigInteger::valueOf); 

		// Displaying an object-valued StreamDemo
		// consisting of the results of 
		// applying the given function. 
		stream1.forEach(num -> System.out.println(num.add(BigInteger.TEN))); 
	} 
} 

package com.learnings.streamAPI.operations.combinationOfOperations.concat;// Implementation of StreamDemo.concat()
// method in Java 8 with DoubleStream 
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

class ListOfNumbers {

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating two Streams 
		DoubleStream Stream1 = DoubleStream.of(1520, 1620); 
		DoubleStream Stream2 = DoubleStream.of(1720, 1820); 

		// concatenating both the Streams and 
		// displaying the result 
		DoubleStream.concat(Stream1, Stream2) 
			.forEach(element -> System.out.println(element));

		// Creating two Streams
		LongStream Stream3 = LongStream.of(1520, 1620);
		LongStream Stream4 = LongStream.of(1720, 1820);

		// concatenating both the Streams and
		// displaying the result
		LongStream.concat(Stream3, Stream4)
				.forEach(element -> System.out.println(element));
	} 
} 

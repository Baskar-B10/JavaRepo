package com.learnings.streamAPI.operations.intermediate.filter;// Java code for LongStream filter
// (LongPredicate predicate) to get a stream 
// consisting of the elements of this 
// stream that match the given predicate. 
import java.util.stream.LongStream;

class LongStreamFilter {

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Creating an LongStream 
		LongStream stream = LongStream.of(-2L, -1L, 0L, 1L, 2L); 

		// Using LongStream filter(LongPredicate predicate) 
		// to get a stream consisting of the 
		// elements that are greater than 0 
		stream.filter(num -> num > 0) 
			.forEach(System.out::println);
		// Creating an LongStream
		LongStream streams = LongStream.of(3L, 5L, 6L, 8L, 9L);

		// Using LongStream filter(LongPredicate predicate)
		// to get a stream consisting of the
		// elements that gives remainder 2 when
		// divided by 3
		streams.filter(num -> num % 3 == 2)
				.forEach(System.out::println);
	} 
} 

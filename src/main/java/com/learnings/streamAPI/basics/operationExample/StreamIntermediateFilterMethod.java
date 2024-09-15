package com.learnings.streamAPI.basics.operationExample;

import java.util.Arrays;
import java.util.stream.Stream;

class StreamIntermediateFilterMethod {
	public static void main(String[] args)
	{
		// Data Source
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// StreamDemo
		Stream<Integer> streamOfNumbers
			= Arrays.stream(numbers);

		// filter all the even numbers
		Stream<Integer> evenNumbersStream
			= streamOfNumbers.filter(integer -> integer %2==0);
		evenNumbersStream.forEach(System.out::println);
	}
}

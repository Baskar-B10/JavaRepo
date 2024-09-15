package com.learnings.streamAPI.operations.otherOperations;// Java program to demonstrate
// StreamDemo.iterate method

import java.util.stream.Stream; 
public class StreamIterate {

	public static void main(String[] args) 
	{ 

		// create a stream using iterate
		Stream<Integer> stream
				= Stream.iterate(1,
				i -> i <= 20, i -> i * 2);

		// print Values
		stream.forEach(System.out::println);

		// create a stream using iterate
		Stream<Double> streamDouble
				= Stream.iterate(2.0,
				decimal -> decimal > 0.25, decimal -> decimal / 2);

		// print Values
		streamDouble.forEach(System.out::println);
	} 
} 

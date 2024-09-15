package com.learnings.streamAPI.operations.terminal.collect;// Java code for converting
// StreamDemo to Set using Collectors
import java.util.*; 
import java.util.stream.Stream; 
import java.util.stream.Collectors; 

class CollectToSet {
	
	// Driver code 
	public static void main(String[] args) { 
	
	// Creating a StreamDemo of Integers
	Stream<Integer> stream = Stream.of(-2, -1, 0, 1, 2); 
	
	// Using StreamDemo.collect() to collect the
	// elements of stream in a container. 
	Set<Integer> streamSet = stream.collect(Collectors.toSet()); 
	
	// Displaying the elements 
	streamSet.forEach(num -> System.out.println(num)); 
	} 
} 

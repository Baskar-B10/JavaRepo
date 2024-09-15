package com.learnings.streamAPI.operations.terminal.forEach;// Java code for converting
// StreamDemo to Set using forEach
import java.util.*; 
import java.util.stream.Stream;

class ConvertToSet {
	
	// Driver code 
	public static void main(String[] args) { 
	
	// Creating a StreamDemo of Integers
	Stream<Integer> stream = Stream.of(5, 10, 15, 20, 25); 

	// Creating a HashSet 
	Set<Integer> set = new HashSet<>(); 
	
	// using set.add() to add elements 
	// of stream into empty set 
	stream.forEach(set::add); 
	
	// Displaying the elements 
	set.forEach(num -> System.out.println(num)); 
	} 
} 

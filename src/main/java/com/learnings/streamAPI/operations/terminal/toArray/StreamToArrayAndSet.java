package com.learnings.streamAPI.operations.terminal.toArray;// Java code for converting
// StreamDemo to Set using Divide
// and Conquer 
import java.util.*; 
import java.util.stream.Stream;

class StreamToArrayAndSet {
	
	// Driver code 
	public static void main(String[] args) { 
	
	// Creating a StreamDemo of Strings
	Stream<String> stream = Stream.of("G", "E", "K", "S"); 
	
	// Converting StreamDemo into an Array
	String[] arr = stream.toArray(String[] :: new); 
	
	// Creating a HashSet 
	Set<String> set = new HashSet<>(); 
	
	// Converting Array to set 
	Collections.addAll(set,arr); 
	
	// Displaying the elements 
	set.forEach(str -> System.out.println(str)); 
	} 
} 

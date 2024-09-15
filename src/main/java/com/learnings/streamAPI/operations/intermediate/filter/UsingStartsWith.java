package com.learnings.streamAPI.operations.intermediate.filter;// Java code for StreamDemo filter
// (Predicate predicate) to get a stream 
// consisting of the elements of this 
// stream that match the given predicate. 

import java.util.stream.Stream;

class UsingStartsWith {
	public static void main(String[] args) 
	{ 
		// create a stream of strings 
		Stream<String> myStream 
			= Stream.of("Like", "and", "Share", 
						"https://www.geeksforgeeks.org/"); 

		// only string starting with "http://" will be 
		// considered for next API(forEach) 
		myStream.filter(s -> s.startsWith("https")).forEach(System.out::println);
	} 
}

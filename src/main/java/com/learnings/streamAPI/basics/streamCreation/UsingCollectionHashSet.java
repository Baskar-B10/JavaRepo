package com.learnings.streamAPI.basics.streamCreation;// Java code for converting
// Set to StreamDemo
import java.util.*;
import java.util.stream.Stream;

class UsingCollectionHashSet {
	
	// Driver code
	public static void main(String[] args) {
	
	// Creating an String HashSet
	Set<String> set = new HashSet<>();
	
	// adding elements in set
	set.add("Geeks");
	set.add("for");
	set.add("GeeksQuiz");
	set.add("GeeksforGeeks");
	
	// converting Set to StreamDemo
	Stream<String> stream = set.stream();
	
	// displaying elements of StreamDemo
	stream.forEach(elem -> System.out.print(elem+" "));
	
	}
}

package com.learnings.streamAPI.operations.combinationOfOperations.sliceStream;// Java program to get slice of a stream by
// fetching a sublist 
import java.util.*; 
import java.util.stream.*; 

class UsingSublist {

	// Generic function to get Slice of a 
	// StreamDemo from startIndex to endIndex
	public static <T> Stream<T> 
	getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) 
	{ 
		return stream 
			// Convert the stream to list 
			.collect(Collectors.toList()) 

			// Fetch the subList between the specified index 
			.subList(startIndex, endIndex + 1) 

			// Convert the subList to stream 
			.stream(); 
	} 

	public static void main(String[] args) 
	{ 

		// Create a new List with values 11 - 20 
		List<Integer> list = new ArrayList<>(); 
		for (int i = 11; i <= 20; i++) 
			list.add(i); 

		// Create stream from list 
		Stream<Integer> intStream = list.stream(); 

		// Print the stream 
		System.out.println("List: " + list); 

		// Get Slice of StreamDemo
		// containing of elements from the 4th index to 8th 
		Stream<Integer> 
			sliceOfIntStream = getSliceOfStream(intStream, 4, 8); 

		// Print the slice 
		System.out.println("\nSlice of StreamDemo:");
		sliceOfIntStream.forEach(System.out::println); 
	} 
} 

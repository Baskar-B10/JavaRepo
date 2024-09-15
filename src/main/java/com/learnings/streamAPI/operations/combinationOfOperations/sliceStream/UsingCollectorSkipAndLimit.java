package com.learnings.streamAPI.operations.combinationOfOperations.sliceStream;// Java program to get slice of a stream using
// Collection skip() and limit() 
import java.util.*; 
import java.util.stream.*; 

class UsingCollectorSkipAndLimit {

	// Generic function to get Slice of a 
	// StreamDemo from startIndex to endIndex
	public static <T> Stream<T> 
	getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) 
	{ 
		return stream.collect(Collectors.collectingAndThen(
				Collectors.toList(), list -> list.stream().skip(startIndex)
						.limit(endIndex-startIndex+1)
		));
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

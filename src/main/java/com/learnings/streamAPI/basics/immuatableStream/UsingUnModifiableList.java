package com.learnings.streamAPI.basics.immuatableStream;// Java Program to illustrate Collecting a StreamDemo to
// an Immutable Collection
// Post java 10
// using toUnmodifiableList() method 

// Importing classes from java.util package
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// FindLastElementsUsingReverseSort Class
// ImmutableCollectionList
public class UsingUnModifiableList {

	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{
		// Creating StreamDemo class object of integer type
		Stream<Integer> evenNumberStream
			= Stream.iterate(0, i -> i + 2).limit(50);

		// Creating List class object of integer type
		List<Integer> evenNumbers
			= (List<Integer>)evenNumberStream.collect(
				Collectors.toUnmodifiableList());

		// Print all elements in the List object
		System.out.println(evenNumbers);

		// These will result in
		// java.lang.UnsupportedOperationException

		evenNumbers.add(90);
		// evenNumbers.remove(1);
	}
}

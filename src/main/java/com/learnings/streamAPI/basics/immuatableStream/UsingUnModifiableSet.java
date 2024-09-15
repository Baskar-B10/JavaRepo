package com.learnings.streamAPI.basics.immuatableStream;// Java Program to illustrate Collecting a StreamDemo to
// an Immutable Collection
// Post java 10
// Using toUnmodifiableSet() method 

// Importing required libraries
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// FindLastElementsUsingReverseSort class
// ImmutableCollectionSet
public class UsingUnModifiableSet {

	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{
		// Creating StreamDemo object of type Double
		Stream<Double> randomDecimals
			= Stream.generate(Math::random).limit(30);

		// Now creating Set class object of type Double
		Set<Double> randomSet = randomDecimals.collect(
			Collectors.toUnmodifiableSet());

		// Print and display elements in Set object
		System.out.println(randomSet);

		// This will produce an exception
		randomSet.add(100.0);
	}
}

package com.learnings.streamAPI.operations.intermediate.map;// Java Program to illustrate Intermediate StreamDemo Methods
// Case 4: map() Method 

// Importing input output class
// Importing List class from the java.util package
import java.util.List;

// FindLastElementsUsingReverseSort Class
class MapWithOtherIntermediateExample {

	// Method 1
	// To find the cube of elements in the List
	public static void findTheCube(List<Integer> intList)
	{

		intList.stream()
			.map(element -> element * element * element)
			.forEach(
				element -> System.out.print(element + " "));

		// Display message only
		System.out.println(
			"\n\nOutput after distinct() implementation : ");

		// Applying distinct() on this
		intList.stream()
			.distinct()
			.map(element -> element * element * element)
			.forEach(
				element -> System.out.print(element + " "));

		// Display message only
		System.out.println(
			"\n\nOutput after sorted() implementation : ");

		// Now applying sorted() on this
		intList.stream()
			.distinct()
			.sorted()
			.map(element -> element * element * element)
			.forEach(
				element -> System.out.print(element + " "));

		// Display message only
		System.out.println(
			"\n\nOutput after filter() implementation : ");

		// Applying Filter() that values
		// only below 10000 will be printed
		intList.stream()
			.distinct()
			.sorted()
			.map(element -> element * element * element)
			.filter(element -> element < 10000)
			.forEach(
				element -> System.out.print(element + " "));
	}

	// Method 2
	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{

		// Creating an object of List class and
		// declaring object of Integer type

		// Custom entries
		List<Integer> intList
			= List.of(5, 19, 8, 23, 6, 54, 32, 5, 23);

		// Calling the Method1 in the main() body
		// to get the cube of the elements in the List
		findTheCube(intList);
	}
}

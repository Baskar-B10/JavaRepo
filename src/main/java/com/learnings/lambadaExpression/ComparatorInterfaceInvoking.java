package com.learnings.lambadaExpression;// Java Program Without Using Lambda Expression

// Importing all utility classes
import java.util.*;

// ConsumerWithAcceptMethodExample class
class ComparatorInterfaceInvoking {

	// main driver method
	public static void main(String[] args)
	{

		// Creating an List of integer type
		List<Integer> list = Arrays.asList(
			234, 780, 451, 639, 456, 98, 75, 43);

		// Printing List before sorting
		System.out.println("Before Sorting");

		for (int i : list)
			System.out.print(i + " ");

		System.out.println();

		// Comparator is a functional interface
		// which is helps to sort object
		Collections.sort(list, new Comparator<Integer>() {
			// Overriding the existing compare method
			@Override
			public int compare(Integer a1, Integer a2)
			{

				return a1 % 10 > a2 % 10 ? 1 : -1;
			}
		});

		// Printing the list after sorting
		System.out.println("After Sorting");

		for (int i : list)
			System.out.print(i + " ");

		System.out.println();
	}
}

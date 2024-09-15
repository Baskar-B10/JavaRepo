package com.learnings.streamAPI.basics.arrayToStream;// Java code for converting string array
// to stream using Arrays.stream() 
import java.util.*; 
import java.util.stream.*; 

class UsingStream {

	public static void main(String[] args) 
	{ 
		// Converting String array to stream 
		String[] arr = { "Geeks", "for", "Geeks" }; 

		// Using Arrays.stream to convert an 
		// array into StreamDemo
		Stream<String> stm = Arrays.stream(arr); 

		// Displaying elements in StreamDemo
		stm.forEach(str -> System.out.print(str + " "));
		System.out.println();
		int arr1[] = { 1, 2, 3, 4, 5 };

		IntStream integerStream= Arrays.stream(arr1);

		integerStream.forEach(i -> System.out.print(i+ " "));
		System.out.println();
		long[] arrL = { 3L, 5L, 6L, 8L, 9L };
		LongStream stmL = Arrays.stream(arrL);
		stmL.forEach(number -> System.out.print(number + " "));

		System.out.println();

		// Converting double array to stream
		double[] arrD = { 1, 2, 3, 4, 5 };
		DoubleStream stmD = Arrays.stream(arrD);
		stmD.forEach(d -> System.out.print(d + " "));


		//char arrc [] = { '1', '2', '3', '4', '5' };

		// --------- Using Arrays.stream() ---------
		// This will throw error

		// to convert char array into StreamDemo
		//Arrays.stream(arrc); -- compile error
	} 
} 

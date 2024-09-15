package com.learnings.streamAPI.basics.arrayToStream;// Java code for converting string array
// to stream using IntStream.of() 
import java.util.stream.*;

class UsingStreamOf {

	public static void main(String[] args) 
	{ 
		// Converting int array to stream 
		int arr[] = { 1, 2, 3, 4, 5 }; 
		IntStream stm = IntStream.of(arr);

		stm.forEach(a -> System.out.print(a + " "));
		System.out.println();
		// Converting String array to stream
		String[] arr1 = { "Geeks", "for", "Geeks" };

		// Using Arrays.stream to convert an
		// array into StreamDemo
		Stream<String> stringStream= Stream.of(arr1);
		stringStream.forEach(str -> System.out.print(str + " "));

		System.out.println();
		long[] arrL = { 3L, 5L, 6L, 8L, 9L };
		LongStream stmL = LongStream.of(arrL);
		stmL.forEach(number -> System.out.print(number + " "));

		System.out.println();

		// Converting double array to stream
		double[] arrD = { 1, 2, 3, 4, 5 };
		DoubleStream stmD = DoubleStream.of(arrD);
		stmD.forEach(d -> System.out.print(d + " "));

		// Creating a character array
		char arrc[] = { '1', '2', '3', '4', '5' };

		// --------- Using StreamDemo.of() ---------
		// Will work efficiently

		// to convert int array into StreamDemo
		Stream<char[]> stream = Stream.of(arrc);

		// Displaying elements in StreamDemo
		stream.forEach(str -> System.out.print(str + " "));
	}
} 

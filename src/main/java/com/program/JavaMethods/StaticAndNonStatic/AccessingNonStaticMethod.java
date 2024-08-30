package com.program.JavaMethods.StaticAndNonStatic;// Java program to Illustrate Calling of a Non-Static Method


// Class 2
// DateWithDifferentLocale class
public class AccessingNonStaticMethod {

	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{
		// Input integers to be summed up
		int n = 3, m = 6;

		// Creating object of above class
		HelperClass g = new HelperClass();

		// Calling above method to compute sum
		int s = g.sum(n, m);

		// Calling the non-static method
		System.out.print("sum is = " + s);
	}
}
// Class 1
// Helper class
class HelperClass {

	// Non-static method
	public int sum(int a, int b)
	{
		// Returning sum of numbers
		return a + b;
	}
}



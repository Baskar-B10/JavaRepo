package com.program.exceptions.runTime;
// Java Program to Handle multiple exception
//Explanation: Here combination of ArrayIndexOutOfBounds and Arithmetic exception occur,
// but only Arithmetic exception is thrown, Why?
//
//According to the precedence compiler check number[10]=30/0 from right to left.
// That’s why 30/0 to throw ArithmeticException object and the handler of this
// exception executes Zero cannot divide any number.
class RTExceptionMultiple {
	public static void main(String[] args)
	{
		try {
			int number[] = new int[10];
			number[10] = 30 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println(
				"Zero cannot divide any number");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(
				"Index out of size of the array");
		}
	}
}

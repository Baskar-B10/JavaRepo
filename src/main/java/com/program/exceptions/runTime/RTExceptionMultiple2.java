package com.program.exceptions.runTime;// Java Program to Handle multiple exception
//Another Method of Multiple Exception:
// we can combine two Exception using the | operator and either one of
// them executes according to the exception occurs.
class RTExceptionMultiple2 {
	public static void main(String[] args)
	{
		try {
			int number[] = new int[20];
			number[21] = 30 / 9;
			// this statement will throw
			// ArrayIndexOutOfBoundsException e
		}
		catch (ArrayIndexOutOfBoundsException
			| ArithmeticException e) {
			System.out.println(e.getMessage());
			// print the message
		}
	}
}

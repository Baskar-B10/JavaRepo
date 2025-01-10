package com.learnings.basics.exceptionHandling.finallyDemo;

// Java program to illustrate finally in
// Case where exceptions do not
// occur in the program
class FinallyDemo1 {
	public static void main(String[] args)
	{
		int k = 55;
		try {
			System.out.println("In try block");
			int z = k / 55;
		}

		catch (ArithmeticException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally
		{
			System.out.println("Executes whether exception occurs or not");
		}
	}
}

package com.learnings.basics.exceptionHandling.finallyDemo;

// Java program to illustrate finally in
// Case where exceptions occur
// and do not match any case in the program
class FinallyDemo3 {
	public static void main(String[] args)
	{
		int k = 15;
		try {
			System.out.println("In try block");
			int z = k / 0;
		}

		catch (NullPointerException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally
		{
			System.out.println("Executes whether an exception occurs or not");
		}
	}
}

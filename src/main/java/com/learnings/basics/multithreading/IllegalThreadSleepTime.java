package com.learnings.basics.multithreading;// Java Program for showing how exception can occur if we
// pass the negative timeout value.

import java.lang.Thread;

class IllegalThreadSleepTime {
	public static void main(String[] args)
	{
		// we can also use throws keyword followed by
		// exception name for throwing the exception
	
		try {
			for (int i = 0; i < 5; i++) {
			
				// this will throw the
				// IllegalArgumentException
				Thread.sleep(-100);
			
				// printing the value of the variable
				System.out.println(i);
			}
		}
		catch (Exception e) {
		
			// catching the exception
			System.out.println(e);
		}
	}
}

package com.program.JavaMethods.majorMethods;// Java code to demonstrate
// Short equals() method 

class EqualsUsingMethod {
	public static void main(String[] args) 
	{ 

		// creating a Short object 
		String a = new String("20");

		// creating a Short object 
		String b = new String("20");

		// equals method in Short class 
		boolean output = a.equals(b); 

		// Printing the output 
		System.out.println("Does " + a 
						+ " equals " + b 
						+ " : " + output); 
	} 
} 

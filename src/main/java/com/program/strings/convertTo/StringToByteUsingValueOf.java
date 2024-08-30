package com.program.strings.convertTo;// Java Program to convert string to byte

class StringToByteUsingValueOf {

	// Function to convert String to Byte 
	public static byte convertStringToByte(String str) 
	{ 

		// Convert string to byte 
		// using valueOf() method 
		return Byte.valueOf(str); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// The string value 
		String stringValue = "1"; 

		// The expected byte value 
		byte byteValue; 

		// Convert string to byte 
		byteValue = convertStringToByte(stringValue); 

		// Print the expected byte value 
		System.out.println( 
			stringValue 
			+ " after converting into byte = "
			+ byteValue); 
	} 
} 

package com.program.dateAndTime;// Java Program to convert Local time to
// GMT time 

// Importing all input output classes
// Importing all time classes
import java.time.*;

// Class
class ZonedDateTime {

	// FileSearch driver method
	public static void main(String[] args)
	{

		// Instant operator helps to note
		// the time and the location of it

		// Creating an object of Instant type
		// using the now() method
		Instant now = Instant.now();

		// Now with the help of Instant operator
		// zoned operator is called

		// Creating an object of ZonedDateTime
		java.time.ZonedDateTime zdt = java.time.ZonedDateTime.ofInstant(
			now, ZoneId.systemDefault());

		// Printing the local time
		System.out.println(" Local : " + zdt);

		// Creating an object of Instant type
		// taking any other instant method
		Instant instant = Instant.now();

		// Printing the GMT/UTC time by parsing with string
		// using the toString() method
		System.out.println(" GMT : "+instant.toString());
	}
}

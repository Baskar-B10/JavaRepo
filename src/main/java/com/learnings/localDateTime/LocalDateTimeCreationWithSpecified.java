package com.learnings.localDateTime;// Java Program to illustrate LocalDateTime Class
// of java.time package by creating specific time 

// Importing required classes from resp packages 
import java.time.*;

// main class 
class LocalDateTimeCreationWithSpecified {

	// Main driver method
	public static void main(String[] args)
	{

		// Milliseconds
		LocalDateTime localDateTime1 = LocalDateTime.of(
			2021, 04, 24, 14, 33, 48, 123456789);
		// Print statement
		System.out.println(localDateTime1);

		// Month
		LocalDateTime localDateTime2 = LocalDateTime.of(
			2021, Month.APRIL, 24, 14, 33, 48, 123456789);
		// Print statement
		System.out.println(localDateTime2);

		// Seconds
		LocalDateTime localDateTime3 = LocalDateTime.of(
			2021, Month.APRIL, 24, 14, 33, 48);
		// Print statement
		System.out.println(localDateTime3);

		// Minutes
		LocalDateTime localDateTime4 = LocalDateTime.of(
			2021, Month.APRIL, 24, 14, 33);
		// Print statement
		System.out.println(localDateTime4);

		// Local date + Local time
		LocalDate date = LocalDate.of(2021, 04, 24);
		LocalTime time = LocalTime.of(10, 34);

		LocalDateTime localDateTime5
			= LocalDateTime.of(date, time);
		// Print statement
		System.out.println(localDateTime5);
	}
}

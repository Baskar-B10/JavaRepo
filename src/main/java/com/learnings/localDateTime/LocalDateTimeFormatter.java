package com.learnings.localDateTime;// Java Program to illustrate LocalDateTime Class by
// Formatting LocalDateTime to string

// Importing all classes from java.time package
import java.time.LocalDateTime;
import java.time.format.*;

// LongToIntFunctionApplyAsInt class
class LocalDateTimeFormatter {

	// LongToIntFunctionApplyAsInt driver method
	public static void main(String[] args)
	{

		// Creating an object of DateTimeFormatter class
		DateTimeFormatter formatter
			= DateTimeFormatter.ofPattern(
				"yyyy-MM-dd HH:mm:ss a");

		// Creating an object of LocalDateTime class
		// and getting local date and time using now()
		// method
		LocalDateTime now = LocalDateTime.now();

		// Formatting LocalDateTime to string
		String dateTimeString = now.format(formatter);

		// Print and Display
		System.out.println(dateTimeString);
	}
}

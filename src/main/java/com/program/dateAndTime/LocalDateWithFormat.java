package com.program.dateAndTime;// Java Program to Display Dates in Different Format

// Importing generic Classes/Files
// Importing specific Date and Time Classes/Files
import java.time.*;
import java.time.format.DateTimeFormatter;

class LocalDateWithFormat {

	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{
		// Create date time object and store current time in
		// default format yy-mm-dd
		LocalDateTime date = LocalDateTime.now();

		// Creating DateTimeFormatter object
		// to specify date format
		DateTimeFormatter myDateFormat
			= DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Change date into your format and store it in
		// string object
		String formattedDate = date.format(myDateFormat);

		// Print formatted date
		System.out.println(formattedDate);
	}
}

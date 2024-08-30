package com.program.dateAndTime;// Java Program to Display Dates in Different Format

// Importing Classes/Files
// Importing speccificaly Time Class and functionalities


class LocalDateCurrent {

	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{
		// Create an object of LoacalDate type
		java.time.LocalDate date = java.time.LocalDate.now();
		// .now() method to tore the current date

		// Print current date
		System.out.println(date);
	}
}

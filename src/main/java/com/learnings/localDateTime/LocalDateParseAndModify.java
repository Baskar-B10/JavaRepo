package com.learnings.localDateTime;// import package used to work with current date and time
// api.
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateParseAndModify {

	public static void main(String[] args)
	{
		// now() is a method to return the
		// instance of LocalDateTime class.
		LocalDateTime localDate = LocalDateTime.now();
		// DateTimeFormatter class used to format and
		// parse date and time. ofPattern() is a method
		// used with DateTimeFormatter to format and
		// parse date and time.
		DateTimeFormatter dateformatter
			= DateTimeFormatter.ofPattern("MM dd, YYYY");
		// display the date
		System.out.println(dateformatter.format(localDate));

		// Parses the date
		LocalDate dt1 = LocalDate.parse("2024-09-18");
		LocalDate result = dt1.withDayOfYear(01);

		// Prints the date with year
		System.out.println("The date with day of year is: "
				+ result);
	}
}

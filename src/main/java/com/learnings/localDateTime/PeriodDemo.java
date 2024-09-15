package com.learnings.localDateTime;// Java program to illustrate Period class
// demonstrate the methods of this class
// Methods - minus() and ofMonths()

// Importing Period class from
// java.time package
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

// Main class
public class PeriodDemo {
	// Main driver method
	public static void main(String[] args)
	{
		// Obtaining period representing number of months
		// using of months() method by
		// creating object of period class
		Period p1 = Period.ofMonths(6);

		// minus() will return a copy of this period
		// with the specified period subtracted.
		Period p2 = p1.minus(Period.ofMonths(2));

		// Print and display on the console
		System.out.println(p2);

		// Getting a period representing number of days
		// using ofDays() method
		Period p = Period.ofDays(24);

		// Adding this period to the
		// temporal object i.e. temp
		Temporal temp = p.addTo(LocalDate.now());

		// Print and display on the console
		System.out.println(temp);
	}
}

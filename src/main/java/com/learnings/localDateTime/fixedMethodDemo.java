package com.learnings.localDateTime;// Java program to demonstrate
// fixed() method of Clock class 

import java.time.*; 

// create class 
public class fixedMethodDemo { 

	// Main method 
	public static void main(String[] args) 
	{ 

		// create instance of clock class 
		Instant instant = Instant.parse("2018-08-19T16:02:42.00Z"); 

		// create ZoneId object for Asia/Calcutta zone 
		ZoneId zoneId = ZoneId.of("Asia/Calcutta"); 

		// call fixed method 
		Clock clock = Clock.fixed(instant, zoneId); 

		// print details of clock 
		System.out.println(clock.toString());

		// create instance of clock class
		Instant instant1 = Instant.now();

		// create ZoneId for defaultZone which is UTC
		ZoneId zoneId1 = ZoneId.systemDefault();

		// call fixed method
		Clock clock1 = Clock.fixed(instant1, zoneId1);

		// print details of clock
		System.out.println(clock1.toString());
	} 
} 

package com.learnings.localDateTime;

import java.time.*;
import java.time.temporal.*; 
public class InstantDemo {
	public static void main(String[] args) 
	{ 
		// Parsing a string sequence to Instant 
		Instant inst1 = Instant.parse("2021-02-09T11:19:42.12Z"); 
		System.out.println("Parsed instant is " + inst1); 
		
		// Using isSupported() method to check whether the 
		// specified field is supported or not 
		System.out.println(inst1.isSupported(ChronoUnit.DAYS)); 
		System.out.println(inst1.isSupported(ChronoUnit.YEARS)); 
		
		// Using Instant.now() to get current instant 
		Instant cur = Instant.now(); 
		System.out.println("Current Instant is " + cur); 
		
		// Using minus() method to find instant value after 
		// subtraction 
		Instant diff = inst1.minus(Duration.ofDays(70)); 
		System.out.println("Instant after subtraction : "+ diff); 
		
		// Using plus() method to find instant value after 
		// addition 
		Instant sum = inst1.plus(Duration.ofDays(10)); 
		System.out.println("Instant after addition : "+ sum); 
	} 
}

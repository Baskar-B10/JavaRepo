package com.learnings.localDateTime;// java.time.ZoneId Class in Java with example
import java.time.*; 
public class ZoneIdDemo {
	public static void main(String[] args) 
	{ 

		// Setting Zone1 
		java.time.ZoneId zoneid1 = java.time.ZoneId.of("Asia/Kolkata");
		// Setting Zone2 
		java.time.ZoneId zoneid2 = java.time.ZoneId.of("Europe/London");
		LocalTime time1 = LocalTime.now(zoneid1); 
		LocalTime time2 = LocalTime.now(zoneid2); 
		System.out.println(time1); 
		System.out.println(time2); 

		// Checking if the time of zone1 
		// comes before time of second zone 
		System.out.println(time1.isBefore(time2)); 
	} 
}

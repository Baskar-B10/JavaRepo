package com.learnings.localDateTime;// Importing required classes
import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
public static void main(String[] args) {
	
	// Initializing Duration variable
	Duration duration = Duration.between(LocalTime.NOON,LocalTime.MIDNIGHT); 
	
	// Printing difference between time in seconds
	System.out.println(duration.get(ChronoUnit.SECONDS)); 
	
	// Finding absolute difference
	Duration absDuration = duration.abs();
	
	// Printing absolute time difference in seconds
	System.out.println(absDuration.get(ChronoUnit.SECONDS));

	// Getting duration in an hour
	Duration duration1 = Duration.from(ChronoUnit.HOURS.getDuration());

	// Printing duration in minutes
	System.out.println(duration1.toMinutes());
}
}

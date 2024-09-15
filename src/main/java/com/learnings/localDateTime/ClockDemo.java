package com.learnings.localDateTime;// Java program for creating instance of Clock
import java.time.Clock;

public class ClockDemo {
	
	// main method
	public static void main(String[] args) {
		
		// creating a Clock instance using 
		// systemUTC() method of Clock class
		Clock clock = Clock.systemUTC();
		
		// getting the current instant defined by clock
		System.out.println("UTC time = " + clock.instant());

		//creating a Clock instance using
		// systemDefaultZone() method of Clock class
		Clock clock1 = Clock.systemDefaultZone();

		// it will print "SystemClock[Asia/Calcutta]" for me.
		// The output may be different because of server
		// system clock.
		System.out.println(clock1);

		// printing zone of clock instance
		// it will print "Time zone : Asia/Calcutta" for me.
		System.out.println("Time Zone : "
				+ clock1.getZone());
	}
}

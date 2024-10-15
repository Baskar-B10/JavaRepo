package com.program.dateAndTime;// Java Program to Display Current Date and Time
import java.util.*;
import java.time.*;
public class LocalDateTimeWithGivenTimeZone {
	public static void main(String[] args)
	{
		Date date = new Date();

		LocalDateTime d = LocalDateTime.now();

		//ZonedDateTime UTCtime = d.atZone(ZoneId.of("UTC"));
		//"d" is the current date and
		//"ZonedDateTime" accepts "d" as UTC
		//"atZone" specifies the time zone

		// converting to IST
		//ZonedDateTime ISTtime = UTCtime.withZoneSameInstant(
			//ZoneId.of("Asia/Kolkata"));
		//"withZoneSameInstant" convert the time
		// to given time zone

		//System.out.println(ISTtime);
		// print the time and date
	}
}

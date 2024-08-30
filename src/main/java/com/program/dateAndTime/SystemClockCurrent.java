package com.program.dateAndTime;/*package whatever //do not write package name here */

import java.time.*;

class SystemClockCurrent {
	public static void main (String[] args)
	{
		System.out.println(Clock.systemUTC().instant());
		//"Clock" is the class 
		//"systemUTC()" is the method which represent the time in UTC form 
	}
}

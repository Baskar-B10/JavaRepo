package com.learnings.localDateTime;// import java.time.OffsetDateTime class
import java.time.OffsetDateTime; 
  
public class OffsetDemo {
  
    public static void main(String[] args) 
    { 
        // now() is a method used to obtain current 
        // date and time from the system clock. 
        OffsetDateTime offsetDateTime 
            = OffsetDateTime.now(); 
        // Display the offsetDateTime which will 
        // display all current date and time. 
        System.out.println(offsetDateTime); 
        // Display Year, Month and Day using methods 
        System.out.println( 
            "Year  : " + offsetDateTime.getYear() 
            + "| Month : " + offsetDateTime.getMonth() 
            + " |Day : " + offsetDateTime.getDayOfWeek());

        // now() is a method used to obtain current
        // date and time from the system clock.

        // Display the offsetDateTime which will
        // display all current date and time.

        // Display the Hour,Minute, Second and
        // Nanosecond using getHour(), getMinute(),
        // getSecond() and getNano()
        System.out.println(
                "Hour  : " + offsetDateTime.getHour()
                        + " Minute : " + offsetDateTime.getMinute()
                        + " Second : " + offsetDateTime.getSecond()
                        + " NanoSecond : " + offsetDateTime.getNano());
    } 
}
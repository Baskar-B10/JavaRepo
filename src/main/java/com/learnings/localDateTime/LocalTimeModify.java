package com.learnings.localDateTime;// Java Program to illustrate LocalTime Class
 
// Importing LocalDateTime class from 
// java.time package 
import java.time.LocalTime;
 
// Main Class
public class LocalTimeModify {
   
    // Main driver method 
    public static void main(String args[]) {
       
      // Creating an object of LocalTime class by
      // declaring a variable to store LocalTime 
        LocalTime ltime = LocalTime.now();
       
      // Print and display the LocalTime value
        System.out.println("Local time value : "+ltime);
        // Now plusMinute() will add up minutes to the LocalTime
        LocalTime time3 = ltime.plusMinutes(120);

        // Display the time using object of class
        System.out.println("Time : "+time3);

        // plusHours() method will add up Hours to
        // the LocalTime
        LocalTime time4 = ltime.plusHours(05);

        // Display the time
        System.out.println(time4);

        // minusMinute() will subtract minutes from
        // the LocalTime
        LocalTime time = ltime.minusMinutes(120);

        // Display the time
        System.out.println(time);
    }
}
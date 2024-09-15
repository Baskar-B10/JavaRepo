package com.learnings.localDateTime;

// Java Program to illustrate MonthDay Class 
  
// Importing Month and MonthDay classes 
// from java.time package 
import java.time.Month; 
import java.time.MonthDay; 
  
// Main Class 
public class MonthDayDemo {
  
    // Main driver method 
    public static void main(String[] args) 
    { 
        // Creating an object of MonthDay class by 
        // storing instance of MonthDay by 
        // passing date and month as arguments 
  
        // Custom inputs are passed as arguments 
        MonthDay monthday = MonthDay.of(Month.MARCH, 14); 
  
        // Print and display the value stored 
        System.out.println(monthday);

        // Store an instance of MonthDay
        // from a text i.e --03-14
        MonthDay monthday1 = MonthDay.parse("--03-14");

        // Display the month using instance of class
        System.out.println(monthday1.getMonth());
    } 
}
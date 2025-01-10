package com.learnings.basics.multithreading;// Java Program Illustrating How to Get and Change the
// Name of a Thread 

// Importing input output classes

// Class 1 
// Helper class extending Thread class 
public class ThreadNamingBySetMethod extends Thread {

	// run() method for thread which is called 
	// as soon as start() is called over threads 
	@Override public void run() 
	{ 

		// Print statement when run() is called over thread 
		System.out.println("Thread is running....."); 
	} 
} 

// Class 2 
// Main class 
class ThreadNameMain {

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Creating two threads via above class 
		// as it is extending Thread class 
		ThreadNamingBySetMethod t1 = new ThreadNamingBySetMethod();
		ThreadNamingBySetMethod t2 = new ThreadNamingBySetMethod();

		// Fetching the above created threads names 
		// using getName() method 
		System.out.println("Thread 1: " + t1.getName()); 
		System.out.println("Thread 2: " + t2.getName()); 

		// Starting threads using start() method 
		t1.start(); 
		t2.start(); 

		// Now changing the name of threads 
		t1.setName("geeksforgeeks"); 
		t2.setName("geeksquiz"); 

		// Again getting the new names of threads 
		System.out.println( 
			"Thread names after changing the "
			+ "thread names"); 

		// Printing the above names 
		System.out.println("New Thread 1 name: "
						+ t1.getName()); 
		System.out.println("New Thread 2 name: "
						+ t2.getName()); 
	} 
}

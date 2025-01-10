package com.learnings.basics.multithreading;// Java program to Illustrate How to Get Name of
// Current Executing thread 
// Using getName() Method 

// Importing reqiored I/O classes

// Class 1 
// Helper class extending to Thread class 
class ThreadNamingFetch extends Thread {

	// run() method for this thread 
	@Override public void run() 
	{ 
		// Display message 
		System.out.println( 
			"Fetching current thread name.."); 

		// Getting the current thread name 
		// using getname() method 
		System.out.println( 
			Thread.currentThread().getName()); 
	} 
} 

// Class 2 
// Main class 
class ThreadNamingFetchDemo {

	// Main method driver 
	public static void main(String[] args) 
	{ 

		// Creating two threads inside main() method 
		ThreadNamingFetch t1 = new ThreadNamingFetch();
		ThreadNamingFetch t2 = new ThreadNamingFetch();

		// Starting threads using start() method which 
		// automatically calls run() method 
		t1.start(); 
		t2.start(); 
	} 
}

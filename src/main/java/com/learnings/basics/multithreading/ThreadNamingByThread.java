package com.learnings.basics.multithreading;// Java Program Illustrating How to Set the name
// of Thread at time of Creation 

// Importing I/O classes from java.io package

// Class 1 
// Helper class 
class ThreadNaming extends Thread { 

	// Parameterized constructor 
	ThreadNaming(String name) 
	{ 
		// Call to constructor of 
		// the Thread class as super keyword 
		// refers to parent class 
		super(name); 
	} 

	// run() method for thread 
	@Override public void run() 
	{ 
		// Print statement when thread is called inside 
		// main() 
		System.out.println("Thread is running....."); 
	} 
} 

// Class 2 
// Main class 
class ThreadNames {

	// main driver method 
	public static void main(String[] args) 
	{ 

		// Creating two threads 
		ThreadNaming t1 = new ThreadNaming("geek1"); 
		ThreadNaming t2 = new ThreadNaming("geek2"); 

		// Getting the above created threads names. 
		System.out.println("Thread 1: " + t1.getName()); 
		System.out.println("Thread 2: " + t2.getName()); 

		// Starting threads using start() method 
		t1.start(); 
		t2.start(); 
	} 
}

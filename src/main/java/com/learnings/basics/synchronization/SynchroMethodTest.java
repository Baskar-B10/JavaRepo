package com.learnings.basics.synchronization;// Java Program Illustrating Lock the Object for
// the shared resource giving consistent output

// Class 1
// Helper class extending Thread class
 class PrintWithSynchroTest extends Thread {

	// synchronized code
	// synchronized method will lock the object and
	// releases when thread is terminated or completed its
	// execution.
	synchronized public void printThread(int n)
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread " + n
							+ " is working...");

			try {

				// pause the execution of current thread
				// for 600 millisecond
				Thread.sleep(600);
			}
			catch (Exception ex) {
				// overrides toString() method and prints
				// exception if occur
				System.out.println(ex.toString());
			}
		}
		System.out.println("--------------------------");
		try {

			// pause the execution of current thread for
			// 1000 millisecond
			Thread.sleep(1000);
		}
		catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
// creating thread1 extending Thread Class

 class Thread3 extends Thread {

	PrintWithSynchroTest test;
	Thread3(PrintWithSynchroTest p) { test = p; }

	public void run() // entry point for thread1
	{

		test.printThread(1);
	}
}
// creating thread2 extending Thread Class

 class Thread4 extends Thread {

	PrintWithSynchroTest test;
	Thread4(PrintWithSynchroTest p) { test = p; }
	public void run() // entry point for thread2
	{
		test.printThread(2);
	}
}

public class SynchroMethodTest {

	public static void main(String[] args)
	{

		PrintWithSynchroTest p = new PrintWithSynchroTest();
	
		// passing the same object of class PrintTest to
		// both threads
		Thread3 t1 = new Thread3(p);
		Thread4 t2 = new Thread4(p);
	
		// start function will execute the threads
		t1.start();
		t2.start();
	}
}

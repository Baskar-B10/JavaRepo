package com.learnings.basics.multithreading;// Java program to demonstrate the usage of
// exception in Daemon() Thread

public class DaemonThreadIllegal extends Thread
{
	public void run()
	{
		System.out.println("Thread name: " + Thread.currentThread().getName());
		System.out.println("Check if its DaemonThreadIllegal: "
						+ Thread.currentThread().isDaemon());
	}

	public static void main(String[] args)
	{
		DaemonThreadIllegal t1 = new DaemonThreadIllegal();
		DaemonThreadIllegal t2 = new DaemonThreadIllegal();
		t1.start();
		
		// Exception as the thread is already started
		t1.setDaemon(true);
		
		t2.start();
	}
}

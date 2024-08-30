package com.program.multiThread;// Java program to demonstrate the usage of
// setDaemon() and isDaemon() method.
//In Java, daemon threads are low-priority threads that run in the background
// to perform tasks such as garbage collection or provide services to user threads.
// The life of a daemon thread depends on the mercy of user threads, meaning that when
// all user threads finish their execution, the Java Virtual Machine (JVM)
// automatically terminates the daemon thread.
//
//To put it simply, daemon threads serve user threads by handling background tasks
// and have no role other than supporting the main execution.
//
//Example of Daemon Thread in Java
//
//Some examples of daemon threads in Java include garbage collection (gc) and finalizer.
// These threads work silently in the background, performing tasks that support the
// main execution without interfering with the user’s operations.

public class DaemonThread extends Thread
{
	public DaemonThread(String name){
		super(name);
	}

	public void run()
	{
		// Checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName() + " is Daemon thread");
		}
		
		else
		{
			System.out.println(getName() + " is User thread");
		}
	}
	
	public static void main(String[] args)
	{
	
		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		DaemonThread t3 = new DaemonThread("t3");
	
		// Setting user thread t1 to Daemon
		t1.setDaemon(true);
			
		// starting first 2 threads
		t1.start();
		t2.start();

		// Setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();	 
	}
}

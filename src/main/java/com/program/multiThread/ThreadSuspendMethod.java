package com.program.multiThread;// Java program to demonstrate suspend() method
// of Thread class 

class ThreadSuspendMethod extends Thread {
	public void run() 
	{ 
		for (int i = 1; i < 5; i++) { 
			try { 
				
				// thread to sleep for 500 milliseconds 
				sleep(5); 
				System.out.println( 
					"Currently running - "
					+ Thread.currentThread().getName()); 
			} 
			catch (InterruptedException e) { 
				System.out.println(e); 
			} 
			System.out.println(i); 
		} 
	} 
	public static void main(String args[]) 
	{ 
		// creating three threads 
		ThreadSuspendMethod t1 = new ThreadSuspendMethod();
		ThreadSuspendMethod t2 = new ThreadSuspendMethod();
		ThreadSuspendMethod t3 = new ThreadSuspendMethod();
		
		// call run() method 
		t1.start(); 
		t2.start(); 
		
		// suspend t2 thread 
		//t2.suspend();

		//t2.resume();
		//The suspend() method of thread class puts the thread from running to
		// waiting state. This method is employed
		// if you would like to prevent the thread execution and begin
		// it again when a particular event occurs. This method allows a
		// thread to temporarily cease execution. The suspended thread is often
		// resumed using the resume() method. If the present thread cannot modify
		// the target thread then it’ll throw Security Exception.
		//
		//Note: suspend() method is deprecated in the latest Java version.
		//Note: Thread t2 can be resumed by resume() method.
		
		// call run() method 
		t3.start(); 
	} 
}

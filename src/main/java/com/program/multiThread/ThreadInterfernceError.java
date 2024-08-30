package com.program.multiThread;// Java program to explain the
// concept of thread interference.

// Creating thread by creating the 
// objects of that class

//In multithreading, there can be possibilities that the changes made by one
// thread might not be visible to the other threads
// and they all have inconsistent views of the same shared data.
// This is known as memory consistency error.
//
//Memory consistency is more of an architecture-based concept than Java-based.
// Accesses to main memory might not occur in the same order in which the
// CPU initiated them, especially for write operations which often go through
// hardware write buffers so that the CPU need not wait for them. CPUs guarantee
// that the order of writes to a single memory location is maintained from the
// perspective of all CPUs, even if CPUs perceive the write time of other CPUs
// differently than the actual time. This sometimes leads to memory inconsistency
// due to lack of visibility of the correct data.

//https://www.geeksforgeeks.org/thread-interference-and-memory-consistency-errors-in-java/
class SharedClass { 
	static int i=10; 
	void increment() 
	{ 
		for(int j=0;j<50;j++) 
		{ 
				// incrementing value of i 
			i=i+1; 
			System.out.println("i after increment "+i); 
		} 
	} 
	void decrement() 
	{ 
		for(int j=0;j<50;j++) 
		{ 
				// decrementing value of i 
			i=i-1; 
			System.out.println("i after decrement "+i); 
		} 
	} 
} 

class ThreadInterfernceError {
	public static void main(String[] args) 
	{ 
		final SharedClass s1 = new SharedClass(); 
		Thread t1 = new Thread() 
		{ 
			@Override
			public void run() 
			{ 
				s1.increment(); 
			} 
		}; 
		Thread t2 = new Thread() 
		{ 
			@Override
			public void run() 
			{ 
				s1.decrement(); 
			} 
		}; 
		t1.start(); 
		t2.start(); 
	} 
} 

package com.learnings.basics.exceptionHandling.finallyDemo;

class FinalizeDemo4 {
	public static void main(String[] args)
	{
		FinalizeDemo4 q = new FinalizeDemo4();
		q = null;

		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method overridden");
		System.out.println(10 / 0);
	}
}

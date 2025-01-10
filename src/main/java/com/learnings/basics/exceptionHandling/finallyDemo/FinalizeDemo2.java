package com.learnings.basics.exceptionHandling.finallyDemo;

class FinalizeDemo2 {
	public static void main(String[] args)
	{
		FinalizeDemo2 m = new FinalizeDemo2();

		// Calling finalize method Explicitly.
		m.finalize();
		m.finalize();
		m = null;

		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method overridden");
	}
}

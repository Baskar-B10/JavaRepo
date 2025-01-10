package com.learnings.basics.multithreading;

class MyThreadDemo extends Thread {
	public void run()
	{
		System.out.println("Current thread name: "
						+ Thread.currentThread().getName());
		System.out.println("run() method called");
	}
}

public class RunMethodCallTwices {
	public static void main(String[] args)
	{
		MyThreadDemo t = new MyThreadDemo();
		t.run();
		t.run();
	}
}

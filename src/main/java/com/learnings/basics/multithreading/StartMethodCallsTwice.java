package com.learnings.basics.multithreading;

class MyThread extends Thread {
	public void run()
	{
		System.out.println("Current thread name: "
						+ Thread.currentThread().getName());

		System.out.println("run() method called");
	}
}

public class StartMethodCallsTwice {
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();
		t.start();
	}
}

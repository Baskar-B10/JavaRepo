package com.program.multiThread;

class MyThreadStart extends Thread {
	public void run()
	{
		System.out.println("Current thread name: "
						+ Thread.currentThread().getName());

		System.out.println("run() method called");
	}
}

class StartMethodThread {
	public static void main(String[] args)
	{
		MyThreadStart t = new MyThreadStart();
		t.start();
		t.start();
	}
}

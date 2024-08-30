package com.program.multiThread;

class MyThreadRunMethod extends Thread {
	public void run()
	{
		System.out.println("Current thread name: "
						+ Thread.currentThread().getName());
		System.out.println("run() method called");
	}
}

class RunMethodThread {
	public static void main(String[] args)
	{
		MyThreadRunMethod t = new MyThreadRunMethod();
		t.run();
		t.run();
	}
}

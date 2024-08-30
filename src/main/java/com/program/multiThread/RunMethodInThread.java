package com.program.multiThread;

class MyThreadRun extends Thread {
    public void run()
    {
        System.out.println("Current thread name: "
                           + Thread.currentThread().getName());
 
        System.out.println("run() method called");
    }
}
 
class RunMethodInThread {
    public static void main(String[] args)
    {
        MyThreadRun t = new MyThreadRun();
        t.run();
    }
}
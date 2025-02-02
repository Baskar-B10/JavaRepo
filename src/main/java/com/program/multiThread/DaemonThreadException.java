package com.program.multiThread;

public class DaemonThreadException  extends Thread
{
    public void run()
    {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Check if its DaemonThreadSample: "
                + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args)
    {
        DaemonThreadException t1 = new DaemonThreadException();
        DaemonThreadException t2 = new DaemonThreadException();
        t1.start();

        // Exception as the thread is already started
        t1.setDaemon(true);

        t2.start();
    }
}


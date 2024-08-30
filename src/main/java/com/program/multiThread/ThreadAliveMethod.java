package com.program.multiThread;

public class ThreadAliveMethod  extends Thread {
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
        ThreadAliveMethod t1 = new ThreadAliveMethod();
        ThreadAliveMethod t2 = new ThreadAliveMethod();
        ThreadAliveMethod t3 = new ThreadAliveMethod();
        System.out.println("Before start 1 "+ t1.isAlive());
        System.out.println("Before start 2"+ t2.isAlive());
        System.out.println("Before start 3"+ t3.isAlive());
        // call run() method
        t1.start();
        System.out.println("After start 1 "+ t1.isAlive());

        t2.start();
        System.out.println("After start 2"+ t2.isAlive());

        t3.start();
        System.out.println("After start 3"+ t3.isAlive());
    }
}



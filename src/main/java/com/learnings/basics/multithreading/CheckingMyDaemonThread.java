package com.learnings.basics.multithreading;// Java Program to show Working of Daemon Thread
// with users threads

// Importing Thread class from java.util package


// Class 1
// Helper Class extending Thread class
class CheckingMyDaemonThread extends Thread {

    // Method
    // run() method which is invoked as soon as
    // thread start via start()
    public void run()
    {

        // Checking whether the thread is daemon thread or
        // not
        if (Thread.currentThread().isDaemon()) {

            // Print statement when Daemon thread is called
            System.out.println(
                "I am daemon thread and I am working");
        }

        else {

            // Print statement whenever users thread is
            // called
            System.out.println(
                "I am user thread and I am working");
        }
    }
}

// Class 2
// Main Class
class DemonDemo {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating threads in the main body
        CheckingMyDaemonThread t1
            = new CheckingMyDaemonThread();
        CheckingMyDaemonThread t2
            = new CheckingMyDaemonThread();
        CheckingMyDaemonThread t3
            = new CheckingMyDaemonThread();

        // Setting thread named 't2' as our Daemon thread
        t2.setDaemon(true);

        // Starting all 3 threads using start() method
        t1.start();
        t2.start();
        t3.start();

        // Now start() will automatically
        // invoke run() method
    }
}
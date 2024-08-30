package com.program.multiThread;// Java program to explain the
// concept of joining a thread.

// Creating thread by creating the
// objects of that class

//java.lang.Thread class provides the join() method which allows
// one thread to wait until another thread completes its execution.
// If t is a Thread object whose thread is currently executing,
// then t.join() will make sure that t is terminated before the next
// instruction is executed by the program.
class ThreadJoining extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 2; i++)
        {
            try
            {
                Thread.sleep(500);
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            }

            catch(Exception ex)
            {
                System.out.println("Exception has" +
                                " been caught" + ex);
            }
            System.out.println(i);
        }
    }
}

class Test
{
    public static void main (String[] args)
    {

        // creating two threads
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();

        // thread t1 starts
        t1.start();

        // starts second thread after when
        // first thread t1 has died.
        try
        {
            System.out.println("Current Thread: "
                  + Thread.currentThread().getName());
            t1.join();
        }

        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }

        // t2 starts
        t2.start();

        // starts t3 after when thread t2 has died.
        try
        {
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName());
            t2.join();
        }

        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                                    " caught" + ex);
        }
        
        // t3 starts
        t3.start();
        
        // After t2 has dead, t3 starts
        try
        {
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName());
            t3.join();
        }

        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                                    " caught" + ex);
        }
    }
}

// In the above example we can see clearly second thread t2 starts
// after first thread t1 has died and t3 will start its execution
// after second thread t2 has died.

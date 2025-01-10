package com.learnings.basics.synchronization;

class Util
{
    // Util class to sleep a thread
    static void sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
// This class is shared by both threads
class Shared
{
    // first synchronized method
    synchronized void test1(Shared s2)
    {
        System.out.println(Thread.currentThread().getName() + " enters test1 of " + this);
        Util.sleep(1000);
        // taking object lock of s2 enters
        // into test2 method
        s2.test2();
        System.out.println(Thread.currentThread().getName() + " exits test1 of " + this);
    }
    synchronized void test2()
    {
        System.out.println(Thread.currentThread().getName() + " enters test2 of " + this);
        Util.sleep(1000);
        // taking object lock of s1 enters
        // into test1 method
        System.out.println(Thread.currentThread().getName() + " exits test2 of " + this);
    }
}
class Thread10 extends Thread
{
    private Shared s1;
    private Shared s2;
    // constructor to initialize fields
    public Thread10(Shared s1, Shared s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }
    // run method to start a thread
    @Override
    public void run()
    {
        s1.test1(s2);
    }
}
class Thread20 extends Thread
{
    private Shared s1;
    private Shared s2;
    // constructor to initialize fields
    public Thread20(Shared s1, Shared s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }
    // run method to start a thread
    @Override
    public void run()
    {
        s2.test1(s1);
    }
}
public class Deadlock
{
    public static void main(String[] args)
    {
        // creating one object
        Shared s1 = new Shared();
        Shared s2 = new Shared();
        // creating first thread and starting it
        Thread10 t1 = new Thread10(s1, s2);
        t1.setName("Thread1");
        t1.start();
        // creating second thread and starting it
        Thread20 t2 = new Thread20(s1, s2);
        t2.setName("Thread2");
        t2.start();
        Util.sleep(2000);
    }
}
package com.learnings.collections.interfaces.queues.abstractQueue;// Java program to illustrate the
// accessing element from AbstractQueue

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AccessingElementExample 
{
    public static void main(String[] argv) throws Exception
    {
        // Since AbstractQueue is an abstract class
        // create object using LinkedBlockingQueue
        AbstractQueue<Integer> AQ1 = new LinkedBlockingQueue<Integer>();

        // Populating AQ1 using add method
        AQ1.add(10);
        AQ1.add(20);
        AQ1.add(30);
        AQ1.add(40);
        AQ1.add(50);

        // print AQ to the console
        System.out.println("AbstractQueue1 contains : " + AQ1);

        // access the head element
        System.out.println("head : " + AQ1.element());
    }
}
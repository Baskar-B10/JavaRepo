package com.learnings.collections.interfaces.queues;// Java program to demonstrate the
// creation of queue object using the
// PriorityBlockingQueue class

import java.util.*;

class PriorityBlockingQueue {
    public static void main(String args[])
    {
        // Creating empty priority
        // blocking queue
        Queue<Integer> pbq
            = new java.util.concurrent.PriorityBlockingQueue<Integer>();

        // Adding items to the pbq
        // using add()
        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        // Printing the top element of
        // the PriorityBlockingQueue
        System.out.println(pbq.peek());

        // Printing the top element and
        // removing it from the
        // PriorityBlockingQueue
        System.out.println(pbq.poll());

        // Printing the top element again
        System.out.println(pbq.peek());
    }
}
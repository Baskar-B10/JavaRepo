package com.learnings.collections.interfaces.queues.blockingQueues;// Java Program for Accessing the elements of a
// LinkedBlockingDeque

import java.util.concurrent.*;

public class AccessingElements {

    public static void main(String[] args)
    {

        // Instantiate an object of LinkedBlockingDeque
        // named lbdq
        BlockingQueue<Integer> lbdq
            = new LinkedBlockingDeque<Integer>();

        // Add elements using add()
        lbdq.add(22);
        lbdq.add(125);
        lbdq.add(723);
        lbdq.add(172);
        lbdq.add(100);

        // Print the elements of lbdq on the console
        System.out.println(
            "The LinkedBlockingDeque, lbdq contains:");
        System.out.println(lbdq);

        // To check if the deque contains 22
        if (lbdq.contains(22))
            System.out.println(
                "The LinkedBlockingDeque, lbdq contains 22");
        else
            System.out.println("No such element exists");

        // Using element() to retrieve the head of the deque
        int head = lbdq.element();
        System.out.println("The head of lbdq: " + head);
    }
}
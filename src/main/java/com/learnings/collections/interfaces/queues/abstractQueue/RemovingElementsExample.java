package com.learnings.collections.interfaces.queues.abstractQueue;// Java program to illustrate the
// removal of elements from AbstractQueue

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class RemovingElementsExample {
    public static void main(String[] argv) throws Exception
    {
        // Since AbstractQueue is an abstract class
        // create object using LinkedBlockingQueue
        AbstractQueue<Integer> AQ1 = new LinkedBlockingQueue<Integer>();

        // Add elements using add method
        AQ1.add(10);
        AQ1.add(20);
        AQ1.add(30);
        AQ1.add(40);
        AQ1.add(50);

        // print the queue contents to the console
        System.out.println("AbstractQueue1 contains : " + AQ1);

        // Retrieves the head
        int head = AQ1.remove();

        // print the head element to the console
        System.out.println("head : " + head);

        // print the modified queue
        System.out.println("AbstractQueue1 after removal of head : " + AQ1);

        // remove all the elements
        AQ1.clear();

        // print the modified queue
        System.out.println("AbstractQueue1 : " + AQ1);
    }
}
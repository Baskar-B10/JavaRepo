package com.learnings.collections.interfaces.dequeues.blockingDequeues;// Java Program for removing elements from a LinkedBlockingDeque

import java.util.concurrent.*;

public class RemovingElements {

    public static void main(String[] args) {
        
        // Instantiate an object of LinkedBlockingDeque named lbdq
        BlockingDeque<Integer> lbdq = new LinkedBlockingDeque<Integer>();
        
        // Add elements using add()
        lbdq.add(75);
        lbdq.add(86);
        lbdq.add(13);
        lbdq.add(44);
        lbdq.add(10);
        
        // Print the elements of lbdq on the console
        System.out.println("The LinkedBlockingDeque, lbdq contains:");
        System.out.println(lbdq);
        
        // Remove elements using remove();
        lbdq.remove(86);
        lbdq.remove(44);
        
        // Trying to remove an element
        // that doesn't exist
        // in the LinkedBlockingDeque
        lbdq.remove(1);
        
        // Print the elements of lbdq on the console
        System.out.println("\nThe LinkedBlockingDeque, lbdq contains:");
        System.out.println(lbdq);

    }

}
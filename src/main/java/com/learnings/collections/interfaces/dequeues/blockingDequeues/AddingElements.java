package com.learnings.collections.interfaces.dequeues.blockingDequeues;// Java Program for Adding elements to a LinkedBlockingDeque
import java.util.concurrent.*;

public class AddingElements {

    public static void main(String[] args) {
        
        // Instantiate a LinkedBlockingDeque named lbdq1
        BlockingDeque<Integer> lbdq1 = new LinkedBlockingDeque<Integer>();
        
        // Add elements using add()
        lbdq1.add(145);
        lbdq1.add(89);
        lbdq1.add(65);
        lbdq1.add(122);
        lbdq1.add(11);
        
        // Print the contents of lbdq1 on the console
        System.out.println("Contents of lbdq1: " + lbdq1);
        
        // Instantiate a LinkedBlockingDeque named lbdq2
        LinkedBlockingDeque<Integer> lbdq2 = new LinkedBlockingDeque<Integer>();
        
        // Add elements from lbdq1 using addAll()
        lbdq2.addAll(lbdq1);
        
        // Print the contents of lbdq2 on the console
        System.out.println("\nContents of lbdq2: " + lbdq2);
        
    }

}
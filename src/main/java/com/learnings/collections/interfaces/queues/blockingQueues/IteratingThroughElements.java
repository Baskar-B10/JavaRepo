package com.learnings.collections.interfaces.queues.blockingQueues;// Java Program to iterate
// through the LinkedBlockingDeque
import java.util.Iterator;
import java.util.concurrent.*;

public class IteratingThroughElements {

    public static void main(String[] args) {
        
        // Instantiate an object of LinkedBlockingDeque named lbdq
        BlockingQueue<Integer> lbdq = new LinkedBlockingDeque<Integer>();
        
        // Add elements using add()
        lbdq.add(166);
        lbdq.add(246);
        lbdq.add(66);
        lbdq.add(292);
        lbdq.add(98);
        
        // Create an iterator to traverse lbdq
        Iterator<Integer> lbdqIter = lbdq.iterator();
        
        // Print the elements of lbdq on to the console
        System.out.println("The LinkedBlockingDeque, lbdq contains:");
        
        for(int i = 0; i<lbdq.size(); i++)
        {
            System.out.print(lbdqIter.next() + " ");
        }        
    }

}
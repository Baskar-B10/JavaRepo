package com.learnings.miscellaneous.consumer.doubleConsumer;

import java.util.function.DoubleConsumer;
 
public class Accept {
    public static void main(String args[])
    {
 
        // Create a DoubleConsumer Instance
        DoubleConsumer
            display
            = a -> System.out.println(a * 10);
 
        // using accept() method
        display.accept(3);
    }
}
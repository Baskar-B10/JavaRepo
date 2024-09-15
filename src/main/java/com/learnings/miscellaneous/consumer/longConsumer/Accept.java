package com.learnings.miscellaneous.consumer.longConsumer;

import java.util.function.LongConsumer;
 
public class Accept {
    public static void main(String args[])
    {
 
        // Create a LongConsumer Instance
        LongConsumer
            display
            = a -> System.out.println(a * 100);
 
        // Using accept() method
        display.accept(3);
    }
}
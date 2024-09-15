package com.learnings.miscellaneous.consumer.intConsumer;

import java.util.function.IntConsumer;
 
public class Accept {
    public static void main(String args[])
    {
 
        // Create a IntConsumer Instance
        IntConsumer display = a -> System.out.println(a * 10);
 
        // Using accept() method
        display.accept(3);
    }
}
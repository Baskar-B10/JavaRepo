package com.learnings.collections.interfaces.queues.abstractQueue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Create a new queue
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");

        // Print the elements in the queue
        System.out.println("Queue: " + queue);

        // Remove the first element from the queue
        String first = queue.remove();
        System.out.println("Removed element: " + first);

        // Print the remaining elements in the queue
        System.out.println("Queue: " + queue);

        // Peek at the first element in the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // Print the remaining elements in the queue
        System.out.println("Queue: " + queue);
    }
}
package com.learnings.collections.interfaces.queues.priorityQueues;// Java Program Implementing PriorityQueue

import java.util.*;
  
public class PriorityQueueAddDemo
{  
    public static void main(String args[])
    {
          // Creating PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
          for(int i=0;i<3;i++){
            pq.add(i);
            pq.add(1);
        }
      
        System.out.println(pq);
    }
}
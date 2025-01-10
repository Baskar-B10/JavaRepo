package com.learnings.collections.interfaces.queues.delayQueues;// Java Program Demonstrate accessing
// elements of DelayQueue

import java.util.concurrent.*;
import java.util.*;

// The DelayObject for DelayQueue
// It must implement Delayed and
// its getDelay() and compareTo() method
class DelayObject1 implements Delayed {

	private String name;
	private long time;

	// Constructor of DelayObject
	public DelayObject1(String name, long delayTime)
	{
		this.name = name;
		this.time = System.currentTimeMillis() + delayTime;
	}

	// Implementing getDelay() method of Delayed
	@Override public long getDelay(TimeUnit unit)
	{
		long diff = time - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	// Implementing compareTo() method of Delayed
	@Override public int compareTo(Delayed obj)
	{
		if (this.time < ((DelayObject1)obj).time) {
			return -1;
		}
		if (this.time > ((DelayObject1)obj).time) {
			return 1;
		}
		return 0;
	}

	// Implementing toString() method of Delayed
	@Override public String toString()
	{
		return "\n{"
			+ " " + name + ", time=" + time + "}";
	}
}

// Driver Class
public class AccessingElementsExample {
	public static void main(String[] args)
		throws InterruptedException
	{

		// create object of DelayQueue
		// using DelayQueue() constructor
		BlockingQueue<DelayObject> DQ = new DelayQueue<DelayObject>();

		// Add numbers to end of DelayQueue
		// using add() method
		DQ.add(new DelayObject("A", 1));
		DQ.add(new DelayObject("B", 2));
	
		// Print delayqueue
		System.out.println("Original DelayQueue: " + DQ + "\n");
	
		// removing all elements
		DQ.clear();
	
		// peek() method for returning head of the
		// DelayQueue
		System.out.println("Head of the DelayQueue: " + DQ.peek());
	}
}

package com.learnings.collections.interfaces.queues.delayQueues;// Java Program Demonstrate iterating
// over DelayQueue

import java.util.concurrent.*;
import java.util.*;

// The DelayObject for DelayQueue
// It must implement Delayed and
// its getDelay() and compareTo() method
class DelayObject2 implements Delayed {

	private String name;
	private long time;

	// Constructor of DelayObject
	public DelayObject2(String name, long delayTime)
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
		if (this.time < ((DelayObject2)obj).time) {
			return -1;
		}
		if (this.time > ((DelayObject2)obj).time) {
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
public class IteratingExample {
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
		DQ.add(new DelayObject("C", 3));
		DQ.add(new DelayObject("D", 4));

		// Creating an iterator
		Iterator val = DQ.iterator();

		// print the value after iterating DelayQueue
		System.out.println("The iterator values are: ");
		while (val.hasNext()) {
			System.out.println(val.next());
		}
	}
}

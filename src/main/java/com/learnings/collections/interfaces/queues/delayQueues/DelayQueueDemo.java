package com.learnings.collections.interfaces.queues.delayQueues;// Java Program Demonstrate DelayQueue

import java.util.concurrent.*;

// The DelayObject for DelayQueue
// It must implement Delayed and
// its getDelay() and compareTo() method
class DelayObject implements Delayed {

	private String name;
	private long time;

	// Constructor of DelayObject
	public DelayObject(String name, long delayTime)
	{
		this.name = name;
		this.time = System.currentTimeMillis()
					+ delayTime;
	}

	// Implementing getDelay() method of Delayed
	@Override
	public long getDelay(TimeUnit unit)
	{
		long diff = time - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	// Implementing compareTo() method of Delayed
	@Override
	public int compareTo(Delayed obj)
	{
		if (this.time < ((DelayObject)obj).time) {
			return -1;
		}
		if (this.time > ((DelayObject)obj).time) {
			return 1;
		}
		return 0;
	}

	// Implementing toString() method of Delayed
	@Override
	public String toString()
	{
		return "\n{"
			+ "name=" + name
			+ ", time=" + time
			+ "}";
	}
}

// Driver Class
public class DelayQueueDemo {
	public static void main(String[] args)
		throws InterruptedException
	{

		// create object of DelayQueue
		// using DelayQueue() constructor
		BlockingQueue<DelayObject> DQ
			= new DelayQueue<DelayObject>();

		// Add numbers to end of DelayQueue
		DQ.add(new DelayObject("A", 1));
		DQ.add(new DelayObject("B", 2));
		DQ.add(new DelayObject("C", 3));
		DQ.add(new DelayObject("D", 4));

		// print DelayQueue
		System.out.println("DelayQueue: "
						+ DQ);

		// create object of DelayQueue
		// using DelayQueue(Collection c)
		// constructor
		BlockingQueue<DelayObject> DQ2
			= new DelayQueue<DelayObject>(DQ);

		// print DelayQueue
		System.out.println("DelayQueue: "
						+ DQ2);



		// print queue
		System.out.println("DelayQueue: "
				+ DQ);

		// print the head using peek() method
		System.out.println("Head of DelayQueue: "
				+ DQ.peek());

		// print the size using size() method
		System.out.println("Size of DelayQueue: "
				+ DQ.size());

		// remove the head using poll() method
		System.out.println("Head of DelayQueue: "
				+ DQ.poll());

		// print the size using size() method
		System.out.println("Size of DelayQueue: "
				+ DQ.size());

		// clear the DelayQueue using clear() method
		DQ.clear();
		System.out.println("Size of DelayQueue"
				+ " after clear: "
				+ DQ.size());
	}
}

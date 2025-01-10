package com.learnings.collections.interfaces.queues.delayQueues;// Java Program to illustrate the removing
// elements of DelayQueue class

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class RemovingElementsExample {
	public static void main(String args[])
	{
		// Create a DelayQueue instance
		DelayQueue<Delayed> queue = new DelayQueue<Delayed>();

		// Create an object of type Delayed
		Delayed ob = new Delayed() {
			public long getDelay(TimeUnit unit)
			{
				return 24; // some value is returned
			}

			public int compareTo(Delayed o)
			{
				if (o.getDelay(TimeUnit.DAYS)
					> this.getDelay(TimeUnit.DAYS))
					return 1;
				else if (o.getDelay(TimeUnit.DAYS)
						== this.getDelay(TimeUnit.DAYS))
					return 0;
				return -1;
			}
		};

		// Add the object to DelayQueue
		queue.add(ob);

		// Print initial size of Queue
		System.out.println("Initial Size : " + queue.size());

		// Remove the object ob from
		// this DelayQueue
		queue.remove(ob);

		// Print the final size of the DelayQueue
		System.out.println("Size after removing : " + queue.size());
	}
}

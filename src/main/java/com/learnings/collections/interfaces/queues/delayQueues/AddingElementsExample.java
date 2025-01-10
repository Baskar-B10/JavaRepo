package com.learnings.collections.interfaces.queues.delayQueues;// Java program to illustrate the adding
// elements to the DelayQueue

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class AddingElementsExample {
	public static void main(String args[])
	{
		// Create a DelayQueue instance
		DelayQueue<Delayed> queue
			= new DelayQueue<Delayed>();

		// Create an instance of Delayed
		Delayed obj = new Delayed() {
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

		// Use the add() method to add obj to
		// the empty DelayQueue instance
		queue.add(obj);

		// printing size of the queue to the console
		System.out.println("Size of the queue : "
						+ queue.size());
	}
}

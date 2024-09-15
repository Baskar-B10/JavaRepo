package com.learnings.miscellaneous.consumer.longConsumer;

import java.util.function.LongConsumer;

public class AndThen {
	public static void main(String args[])
	{

		// Create a LongConsumer Instance
		LongConsumer
			display
			= a -> System.out.println(a * 10);
		LongConsumer mul = a -> a *= 100;

		// Using addThen() method
		LongConsumer composite = mul.andThen(display);

		composite.accept(3);


	}
}

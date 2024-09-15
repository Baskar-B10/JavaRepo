package com.learnings.miscellaneous.consumer.doubleConsumer;

import java.util.function.DoubleConsumer;

public class AndThenException {
	public static void main(String args[])
	{

		try {

			DoubleConsumer
				conv
				= a
				-> System.out.println(
					Integer
						.parseInt(
							Double
								.toString(a)));
			DoubleConsumer mul = a -> a /= 10;

			// using addThen() method
			DoubleConsumer composite = mul.andThen(conv);

			composite.accept(3);
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}

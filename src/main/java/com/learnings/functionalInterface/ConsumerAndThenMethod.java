package com.learnings.functionalInterface;// Java Program to demonstrate
// Consumer's andThen() method

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenMethod {
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer> > modify = list1 ->
		{
			for (int i = 0; i < list1.size(); i++)
				list1.set(i, 2 * list1.get(i));
		};

		// Consumer to display a list of integers
		Consumer<List<Integer> >
			dispList = list2 -> list2.stream().forEach(a -> System.out.print(a + " "));


		// using addThen()
		//first modify the list and then print the
		// each element to accept the array list
		modify.andThen(dispList).accept(list);
		;
	}
}

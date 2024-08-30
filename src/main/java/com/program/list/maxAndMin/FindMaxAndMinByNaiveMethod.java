package com.program.list.maxAndMin;// This java program find minimum and maximum value
// of an unsorted list of Integer 
import java.util.ArrayList; 
import java.util.List; 

public class FindMaxAndMinByNaiveMethod {

	// Naive function to find minimum value in an 
	// unsorted list in Java 
	public static Integer findMin(List<Integer> list) 
	{ 
		// initialize min to some maximum value 
		Integer min = Integer.MAX_VALUE; 

		// loop through every element in the list and 
		// compare min found so far with current value 
		for (Integer i : list) { 

			// update min if found to be more than 
			// the current element 
			if (min > i) { 
				min = i; 
			} 
		} 

		return min; 
	} 

	// This function return maximum value in an 
	// unsorted list in Java 
	public static Integer findMax(List<Integer> list) 
	{ 
		// initialize max variable to minimum value 
		Integer max = Integer.MIN_VALUE; 

		// loop for compare to current max value 
		// with all list element and find maximum value 
		for (Integer i : list) { 

			// update max if found to be less than 
			// the current element 
			if (max < i) { 
				max = i; 
			} 
		} 

		return max; 
	} 

	public static void main(String[] args) 
	{ 
		// create an ArrayList Object list 
		List<Integer> list = new ArrayList<>(); 
		// add element in ArrayList object list 
		list.add(44); 
		list.add(11); 
		list.add(22); 
		list.add(33); 

		// print min and max value of ArrayList 
		System.out.println("Min: " + findMin(list)); 
		System.out.println("Max: " + findMax(list)); 
	} 
} 

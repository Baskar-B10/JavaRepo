package com.learnings.collections.interfaces.queues.linkedBlockingQueue;// Java program to demonstrate
// LinkedBlockingQueue(Collection c) constructor 

import java.util.concurrent.LinkedBlockingQueue; 
import java.util.*; 

public class LinkedQueue3 {

	public static void main(String[] args) 
	{ 

		// Creating a Collection 
		Vector<Integer> v = new Vector<Integer>(); 
		v.addElement(1); 
		v.addElement(2); 
		v.addElement(3); 
		v.addElement(4); 
		v.addElement(5); 

		// create object of LinkedBlockingQueue 
		// using LinkedBlockingQueue(Collection c) 
		// constructor 
		LinkedBlockingQueue<Integer> lbq 
			= new LinkedBlockingQueue<Integer>(v); 

		// print queue 
		System.out.println("LinkedBlockingQueue:" + lbq); 
	} 
}

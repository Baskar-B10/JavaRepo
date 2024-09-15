package com.learnings.compareInterfaces.triplet;

import java.util.*;

class Triplets {
	int x;
	int y;
	int z;
	public Triplets(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}
}

class Compare implements Comparator<Triplet>{

	// Overridden compare method to
	// compare objects for sorting.
	public int compare(Triplet a,Triplet b){
		return a.z - b.z;
	}
}

class TripletComparator {
	public static void main (String[] args) {	 
	
		int n = 4;
		Triplet arr[] = new Triplet[n];

		arr[0] = new Triplet(10, 20, 30);
		arr[1] = new Triplet(40, -1, 2);
		arr[2] = new Triplet(30, 18, -1);
		arr[3] = new Triplet(50, 10, 50);

		// Sorting the array by passing
		// Compare object
		Arrays.sort(arr, new Compare()); 
	
		// printing the Triplet array
		print(arr);		 
	}

	public static void print(Triplet[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

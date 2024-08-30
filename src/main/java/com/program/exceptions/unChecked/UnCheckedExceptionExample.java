package com.program.exceptions.unChecked;// Java Program to Handle the exception hierarchies

class UnCheckedExceptionExample {
	public static void main(String[] args)
	{
		int a[] = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(
				a[5]); // accessing the elements of the out
					// of index of the array
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// executes when index out of bound occurs
			System.out.println(
				"Out of index please check your code");
		}
	}
}

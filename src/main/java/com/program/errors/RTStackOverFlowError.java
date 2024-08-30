package com.program.errors;// Java Program to Handle the exception hierarchies

class RTStackOverFlowError {
	static void check(int n)
	{
		if (n == 0) {
			return;
		}
		check(n + 1);
	}
	public static void main(String[] args) { check(3); }
}

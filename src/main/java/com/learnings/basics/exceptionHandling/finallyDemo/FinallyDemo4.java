package com.learnings.basics.exceptionHandling.finallyDemo;// Java program to illustrate finally in

// case where finally doesnt get executed
class FinallyDemo4 {
public static void main(String[] args){
	try{
	System.out.println("In try block");
	System.exit(0);
	}
	catch(ArithmeticException e){
	System.out.println("In catch block");
	}
	finally{
	System.out.println("finally block");
	}
}
}

package com.program.exceptions.checked;// Java Program to Handle the exception hierarchies
import java.io.*;
class CheckedExceptionExample {
	public static void main(String args[])
	{
		// this file does not exist in the location
		try {
			FileInputStream GFG
				= new FileInputStream("C:/myfile.txt");
		}
		catch (Exception e) {
			System.out.println("File not found");
		}
	}
}

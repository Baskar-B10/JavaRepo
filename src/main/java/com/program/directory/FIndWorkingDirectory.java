package com.program.directory;// Java Program to Find
// current working directory

public class FIndWorkingDirectory {
	
	public static void main(String[] args) 
	{ 

		// Getting the path of system property 
		String path = System.getProperty("user.dir"); 

		// Printing the path of the working Directory 
		System.out.println("Working Directory = " + path); 
	} 
}

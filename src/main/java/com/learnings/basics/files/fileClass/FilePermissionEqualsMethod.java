package com.learnings.basics.files.fileClass;// Java Program illustrating equals() method

import java.io.*;
public class FilePermissionEqualsMethod
{
	public static void main(String[] args) throws IOException
	{
		boolean bool = false;

		// Creating new FilePermissions("Path", "action")
		FilePermission FP_obj1 = new FilePermission("GEEKS", "read");
		FilePermission FP_obj2 = new FilePermission("ABC", "write");
		FilePermission FP_obj3 = new FilePermission("GEEKS", "read");

		// Use of equals method 
		bool = FP_obj2.equals(FP_obj1);
		System.out.println("Whether FP_obj1 equals FP_obj2 : " + bool);

		bool = FP_obj2.equals(FP_obj3);
		System.out.println("Whether FP_obj2 equals FP_obj2 : " + bool);

		bool = FP_obj1.equals(FP_obj3);
		System.out.println("Whether FP_obj3 equals FP_obj1 : " + bool);


	}
}

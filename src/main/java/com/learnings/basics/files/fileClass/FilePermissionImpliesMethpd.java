package com.learnings.basics.files.fileClass;// Java Program illustrating implies() method

import java.io.*;
public class FilePermissionImpliesMethpd
{
	public static void main(String[] args) throws IOException
	{
		// Creating new FilePermissions
		FilePermission FP_obj1 = new FilePermission("GEEKS", "read");
		FilePermission FP_obj2 = new FilePermission("ABC", "write");
		FilePermission FP_obj3 = new FilePermission("GEEKS", "delete");

		// Use of implies() method

		boolean check = FP_obj1.implies(FP_obj2);
		System.out.println("Using implies() for FP_obj1 : " + check);
				

		// Checked here with the same FilePermission object
		check = FP_obj2.implies(FP_obj2);
		System.out.println("Using implies() for FP_obj2 : " + check);
		
	}
}

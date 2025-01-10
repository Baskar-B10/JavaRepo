package com.learnings.basics.files.fileClass;// Java Program illustrating hashCode() method

import java.io.*;
public class FilePermissionHashCOdeMethod
{
	public static void main(String[] args) throws IOException
	{
		// Creating new FilePermissions
		FilePermission FP_obj1=new FilePermission("GEEKS", "read, delete, write");

		// Use of hashCode() method

		int i = FP_obj1.hashCode();
		System.out.println("hashCode value for FP_obj1 : " + i);

	}
}

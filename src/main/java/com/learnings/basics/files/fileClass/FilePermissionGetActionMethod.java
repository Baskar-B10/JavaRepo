package com.learnings.basics.files.fileClass;// Java Program illustrating getActions() method
import java.io.*;
public class FilePermissionGetActionMethod
{
	public static void main(String[] args) throws IOException
	{
		// Creating new FilePermissions
		FilePermission FP_obj1 = new FilePermission("GEEKS", "read, delete, write");
		FilePermission FP_obj2 = new FilePermission("ABC", "write, read, execute");
		FilePermission FP_obj3 = new FilePermission("GEEKS", "delete, readlink, read");

		// Use of getActions() method 
		String str = FP_obj1.getActions();
		System.out.println("Actions with FP_obj1 : " + str);

		str = FP_obj2.getActions();
		System.out.println("Actions with FP_obj2 : " + str);

		str = FP_obj3.getActions();
		System.out.println("Actions with FP_obj3 : " + str);

	}
}

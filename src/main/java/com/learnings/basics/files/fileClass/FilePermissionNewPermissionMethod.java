package com.learnings.basics.files.fileClass;// Java Program illustrating newPermissionCollection() method

import java.io.*;
import java.security.PermissionCollection;
public class FilePermissionNewPermissionMethod
{
	public static void main(String[] args) throws IOException
	{
		// Creating new FilePermissions
		FilePermission FP_obj1 = new FilePermission("GEEKS.txt", "read");
		
		// Creating new PermissionCollection
		// Use of newPermissionCollection() 
		PermissionCollection FP = FP_obj1.newPermissionCollection();
		
		// Collecting the Permissions of FP_obj1 for FP
		FP.add(FP_obj1);
		
		boolean check = FP.implies(new FilePermission("GEEKS.txt", "read"));
		System.out.println("Is newPermissionCollection() working : " + check);

	}
}

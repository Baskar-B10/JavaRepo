package com.program.file.basicOperation;// Java Program to rename a file
import java.io.File; 
public class RenameFileUsingRenameTo {
	public static void main(String[] args) 
	{ 
		// Create an object of the File class 
		// Replace the file path with path of the directory 
		File file = new File("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo.docx");

		// Create an object of the File class 
		// Replace the file path with path of the directory 
		File rename = new File("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo.txt");

		// store the return value of renameTo() method in 
		// flag 
		boolean flag = file.renameTo(rename); 

		// if renameTo() return true then if block is 
		// executed 
		if (flag == true) { 
			System.out.println("File Successfully Rename"); 
		} 
		// if renameTo() return false then else block is 
		// executed 
		else { 
			System.out.println("Operation Failed"); 
		} 
	} 
}

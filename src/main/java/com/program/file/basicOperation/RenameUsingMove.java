package com.program.file.basicOperation;// Java Program to rename a file
import java.nio.file.*; 
import java.io.IOException; 

public class RenameUsingMove {
	public static void main(String[] args) 
		throws IOException 
	{ 

		Path oldFile 
			= Paths.get("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo.txt");

		try { 
			Files.move(oldFile, oldFile.resolveSibling( 
									"demoFile.txt"));
			System.out.println("File Successfully Rename"); 
		} 
		catch (IOException e) { 
			System.out.println("operation failed"); 
		} 
	} 
}

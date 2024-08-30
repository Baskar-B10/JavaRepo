package com.program.file.basicOperation;// Comparing path of two files in Java

import java.io.File;

public class CompareFilePath {

	public static void main(String[] args)
	{

		File file1 = new File("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo.txt");
		File file2 = new File("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo1.txt");
		File file3 = new File("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo.txt");

		// Path comparison
		if (file1.compareTo(file2) == 0) {
			System.out.println(
				"paths of file1 and file2 are same");
		}
		else {
			System.out.println(
				"Paths of file1 and file2 are not same");
		}

		// Path comparison
		if (file1.compareTo(file3) == 0) {
			System.out.println(
				"paths of file1 and file3 are same");
		}
		else {
			System.out.println(
				"Paths of file1 and file3 are not same");
		}
	}
}

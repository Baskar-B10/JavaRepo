package com.program.file.basicOperation;

import java.io.File;

public class ChangetoReadOnly {

	public static void main(String[] args)
	{
		try {
			File file = new File("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo1.txt");
		
			// making the file to read only mode
			file.setWritable(false);
		
			// check if the file is writable or not
			// if not writable then it is readonly file.
			if (!file.canWrite()) {
				System.out.println(
					"This File is read only.");
			}
			else {
				System.out.println(
					"This File is writable.");
			}
		}
		catch (Exception e) {
			System.out.println(
				"Sorry unable to change to readonly mode.");
		}
	}
}

package com.learnings.basics.inputOutput;// Java program illustrating the working of Writer class
// methods write(int char), write(String str), close()
// write(String str, int offset, int maxlen), flush()
// write(char[] carray, int offset, int maxlen),
// write(char[] carray)

import java.io.*;

public class FileWriter {
	public static void main(String[] args)
		throws IOException
	{
		char[] carray = { 'G', 'E', 'E', 'K', 'S' };

		// Initializing Writer
		Writer geek_writer1 = new PrintWriter(System.out);
		Writer geek_writer2 = new PrintWriter(System.out);
		Writer geek_writer3 = new PrintWriter(System.out);
		Writer geek_writer4 = new PrintWriter(System.out);
		Writer geek_writer5 = new PrintWriter(System.out);

		// Use of write(int char) : to write a character
		geek_writer1.write(71);
		geek_writer1.write(70);
		geek_writer1.write(71);

		// Use of flush() method
		System.out.print("Using write(int char[]) : ");
		geek_writer1.flush();

		String str = "Hello Geeks";
		// Use of write(String str) : to write string
		geek_writer2.write(str);

		// Value written by write(String str)
		System.out.print("\nUsing write(String str) : ");
		geek_writer2.flush();

		// Use of write(String str, int offset, int maxlen)
		//: to write part of string
		geek_writer3.write(str, 2, 4);
		geek_writer3.write(str, 5, 6);

		// Value written by write(String str, int offset,
		// int maxlen)
		System.out.print(
			"\nUsing write(str, offset, maxlen) : ");
		geek_writer3.flush();

		geek_writer4.write(carray);
		System.out.print("\nUsing write(char[] carray) : ");
		geek_writer4.flush();

		// Use of write(char[] carray, int offset, int
		// maxlen): to write part of char array
		geek_writer5.write(carray, 1, 3);

		// Value written by write(String str, int offset,
		// int maxlen)
		System.out.print(
			"\nUsing write(carray, offset, maxlen) : ");
		geek_writer5.flush();

		// Use of close() method
		geek_writer1.close();
		geek_writer2.close();
		geek_writer3.close();
		geek_writer4.close();
		geek_writer5.close();
	}
}

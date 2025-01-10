package com.learnings.basics.inputOutput;// Java program illustrating the working of Writer class
// methods append(CharSequence char_sq), append(char Sw)
// append(CharSequence char_sq, int start,int end)
// flush()

import java.io.*;

public class FileWriterMethods {
	public static void main(String[] args)
		throws IOException
	{
		// Initializing String Writer
		Writer geek_writer1 = new PrintWriter(System.out);
		Writer geek_writer2 = new PrintWriter(System.out);
		Writer geek_writer3 = new PrintWriter(System.out);

		// Use of write(int char) : to write a character
		geek_writer1.append('G');
		geek_writer1.append('G');
		geek_writer1.append('G');
		geek_writer1.append('G');
		geek_writer1.append('G');

		// Use of append(char Sw)
		System.out.print("append(char Sw) : ");
		geek_writer1.flush();

		// Initializing Character Sequence
		CharSequence char_sq1 = "1 Hello 1";
		CharSequence char_sq2 = " : 2 Geeks 2";

		// Use of append(CharSequence char_sq)
		geek_writer2.append(char_sq1);
		geek_writer2.append(char_sq2);

		System.out.print("\nappend(char_sq) : ");
		geek_writer2.flush();

		// Use of append(CharSequence char_sq,int start,int
		// end)
		geek_writer3.append(char_sq1, 0, 3);
		geek_writer3.append(char_sq2, 3, 6);

		System.out.print("\nappend(char_sq,start,end) : ");
		geek_writer3.flush();
	}
}

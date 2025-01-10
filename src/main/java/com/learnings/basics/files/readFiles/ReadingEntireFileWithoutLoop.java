package com.learnings.basics.files.readFiles;// Java Program to illustrate reading from FileReader
// using Scanner Class reading entire File
// without using loop
import java.io.*;
import java.util.Scanner;

public class ReadingEntireFileWithoutLoop {
    public static void main(String[] args)
        throws IOException
    {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Path : ");
        
        // Reading File name
        String path = br.readLine();
      
        File file = new File(path);
      
        Scanner sc = new Scanner(file);

        // we just need to use \\Z as delimiter
        sc.useDelimiter("\\Z");

        System.out.println(sc.next());
    }
}

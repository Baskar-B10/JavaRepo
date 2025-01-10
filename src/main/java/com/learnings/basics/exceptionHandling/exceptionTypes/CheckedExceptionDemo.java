package com.learnings.basics.exceptionHandling.exceptionTypes;// Handling Checked Exceptions
import java.io.*;
class CheckedExceptionDemo {

    public static void main(String[] args)
        throws IOException
    {

        // Creating a file and reading from local repository
        FileReader f = new FileReader("C:\\test\\a.txt");

        // Reading content inside a file
        BufferedReader fi = new BufferedReader(f);

        // Printing first 2 lines of file "C:\test\a.txt"
        for (int i = 0; i < 2; i++)
            System.out.println(fi.readLine());

        // Closing all file connections
        // using close() method
        // Good practice to avoid any memory leakage
        fi.close();
    }
}

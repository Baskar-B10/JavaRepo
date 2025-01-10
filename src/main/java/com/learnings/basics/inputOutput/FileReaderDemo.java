package com.learnings.basics.inputOutput;

import java.io.*;

public class FileReaderDemo {

    public static void main(String[] args)
    {

        // Try-catch block for exception handling
        try {
          
            // Create a FileReader object
            // which is a subclass of Reader
            Reader r = new FileReader("example1.txt");

            // Read one character at a time from the file
            int data = r.read();
            while (data != -1) {
              
                // Convert the int to char and print
                System.out.print((char)data);
                data = r.read();
            }

            // Close the reader
            r.close();
        }
        catch (Exception ex) {
          
            // Handle any IO exceptions
            System.out.println("An error occurred: "
                               + ex.getMessage());
        }
    }
}

package com.program.file.basicOperation;// Java Program to write into a File
// Using BufferedWriter Class

// Importing java input output libraries
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// FileSearch class
public class WriteFileUsingBufferedWrite {

    // FileSearch driver method
    public static void main(String[] args)
    {

        // Assigning the file content
        // Note: Custom contents taken as input to
        // illustrate
        String text
            = "Computer Science Portal StringAppendInFile";

        // Try block to check for exceptions
        try {

            // Step 1: Create an object of BufferedWriter
            BufferedWriter f_writer
                = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo.docx"));

            // Step 2: Write text(content) to file
            f_writer.write(text);

            // Step 3: Printing the content inside the file
            // on the terminal/CMD
            System.out.print(text);

            // Step 4: Display message showcasing
            // successful execution of the program
            System.out.print(
                "File is created successfully with the content.");

            // Step 5: Close the BufferedWriter object
            f_writer.close();
        }

        // Catch block to handle if exceptions occurs
        catch (IOException e) {

            // Print the exception on console
            // using getMessage() method
            System.out.print(e.getMessage());
        }
    }
}

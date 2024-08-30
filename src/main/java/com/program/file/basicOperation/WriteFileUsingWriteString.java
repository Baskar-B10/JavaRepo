package com.program.file.basicOperation;// Importing required classes
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// FileSearch class
public class WriteFileUsingWriteString {

    // FileSearch driver method
    public static void main(String[] args) {
        // Assigning the content of the file
        String text = "Welcome to StringAppendInFile\nHappy Learning!";

        // Defining the file name of the file
        Path fileName = Path.of("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\demo.docx");

        try {
            // Writing into the file
            Files.writeString(fileName, text);

            // Reading the content of the file
            String fileContent = Files.readString(fileName);

            // Printing the content inside the file
            System.out.println(fileContent);
        } catch (IOException e) {
            // Handling any I/O exceptions
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

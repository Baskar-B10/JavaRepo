package com.learnings.basics.files.fileClass;

import java.io.*;

public class ValidMethod
{
    public static void main(String[] args) throws IOException
    {
        // Initializing a FileDescriptor
        FileDescriptor geek_descriptor = null;
        FileInputStream geek_in = null;

        try
        {
            geek_in = new FileInputStream("FILE.txt");

            // get file descriptor
            geek_descriptor = geek_in.getFD();

            boolean check = false;

            // Use of valid() : checking the validity of FileDescriptor
            check = geek_descriptor.valid();

            System.out.print("FileDescriptor is valid : "+check);

        }
        catch(Exception except)
        {
            // if in case IO error occurs
            except.printStackTrace();
        }
        finally
        {
            // releases system resources
            if(geek_in!=null)
                geek_in.close();
        }
    }
}
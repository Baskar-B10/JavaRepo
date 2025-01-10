package com.learnings.basics.files.fileClass;

import java.io.*;

public class SyncMethod
{
    public static void main(String[] args) 
                    throws IOException
    {
        // Initializing a FileDescriptor
        FileDescriptor geek_descriptor = null;
        FileOutputStream geek_out = null;

        // HERE I'm writing "GEEKS" in my file
        byte[] buffer = {71,69,69,75,83};

        try{
            geek_out = new FileOutputStream("FILE.txt");

            // This getFD() method is called before closing the output stream
            geek_descriptor = geek_out.getFD();

            // writes byte to file output stream
            geek_out.write(buffer);

            // USe of sync() : to sync data to the source file
            geek_descriptor.sync();
            System.out.print("\nUse of Sync Successful ");

        }
        catch(Exception except)
        {
            // if in case IO error occurs
            except.printStackTrace();
        }
        finally
        {
            // releases system resources
            if(geek_out!=null)
                geek_out.close();
        }
    }
}
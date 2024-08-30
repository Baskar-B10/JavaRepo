package com.program.Conversion;

public class LongToString {

    public static void main(String args[])
    {

        // create a Long
        Long varLong = 999999999999L;

        // convert into String
        String str = varLong + " ";

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + str.getClass().getName());

        // print Long as String
        System.out.println(str);

        // create a Long
        Long varLong1 = 100000L;

        System.out.println("Method 1: String.valueOf()");

        // convert into String
        String str1 = String.valueOf(varLong1);

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + str1.getClass().getName()
                + "\n");

        // *************************************************************************
        // //

        System.out.println("Method 2: Long.toString()");
        str1 = Long.toString(varLong1);

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + str1.getClass().getName()
                + "\n");

        // *************************************************************************
        // //

       // System.out.println("Method 3: new Long(long l)");
        //str = new Long(varLong).toString();

        // printing the type of str to
        // show that long has been converted to string
      //  System.out.println("Converted type : "
        //        + str.getClass().getName()
         //       + "\n");

        // *************************************************************************
        // //

        System.out.println("Method 4: String.format()");
        str1 = String.format("%d", varLong1);

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + str1.getClass().getName());

        // *************************************************************************
        // //

        System.out.println(
                "Method 5: StringBuilder, StringBuffer object");
        str1 = new StringBuilder()
                .append(varLong1)
                .toString();

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + str1.getClass().getName());

        System.out.println("Output: " + str1);
    }

}

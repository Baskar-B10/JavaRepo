package com.program.Conversion;

public class StringToDouble {
    public static void main(String args[])
    {

        // Create and initializing a string
        String str = "2033.12244";

        // Converting the above string into Double
        // using parseDouble() Method
        double str1 = Double.parseDouble(str);

        // Printing string as Double type
        System.out.println(str1);

        String string = "2024.2010";

        // Converting the above string to Double type
        double string1 = Double.valueOf(string);

        // Printing above string as double type
        System.out.println(string1);

       // String strD = "2033.12244";

        // decrepted from java 1.9
       // Double strD1 = new Double(str);

        // print above string as Double type
      //  System.out.println(str1);
    }
}

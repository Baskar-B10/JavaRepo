package com.program.Conversion;

public class StringToLong {

    // OverloadingMain driver method
    public static void main(String args[])
    {
        // Creating a custom string
        String str = "999999999999";
        System.out.println("String - " + str);

        // Converting into Long
        long varLong = Long.parseLong(str);

        // Printing String as Long
        System.out.println("Long - " + varLong);

        // Creating custom string
        String str1 = "100000000";

        // Printing the above string
        System.out.println("String - " + str1);

        // Converting into Long data type
        long varLong1 = Long.valueOf(str);

        // Printing String as Long
        System.out.println("Long - " + varLong1);

        //String str = "999999999";
      //  System.out.println("String - " + str);

        // Converting above string to long
        // using Long(String s) constructor
        //decrpted in JDK 1.9
        //long num = new Long(str);

        // Printing the above long value
      //  System.out.println("Long - " + num);
    }
}

package com.program.Conversion;

public class BooleanToString {

    public static void main(String[] args)
    {

        // boolean type value
        boolean value = true;

        // static toString() method of Boolean class
        String output = Boolean.toString(value);

        // printing the value
        System.out.println(output);

        // boolean type value
        boolean value1 = false;

        // static toString() method of Boolean class
        String output1 = Boolean.toString(value);

        // printing the value
        System.out.println(output1);

        // not available after java 9
        //Boolean b = new Boolean(true);

        // toString method of Boolean class
        //String output2 = b.toString();

        // printing the output
       // System.out.println(output2);
    }


}

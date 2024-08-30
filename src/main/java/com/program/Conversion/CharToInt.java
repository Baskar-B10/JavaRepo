package com.program.Conversion;

public class CharToInt {

    public static void main(String[] args)
    {
        // Initializing a character
        char ch = 'b';

        // Printing the character value
        System.out.println("char value: " + ch);

        // Converting character to its integer value
        int a = ch - '0';

        // Printing the integer value
        System.out.println("int value: " + a);

        // Declaring and initializing a character
        char ch1 = '1';

        // Printing the character value
        System.out.println("char value: " + ch1);

        // Converting the character to it's integer value
        // using valueOf() method
        int a1 = Integer.parseInt(String.valueOf(ch1));

        // Printing the integral value
        // corresponding to its character value
        System.out.println("int value: " + a1);

        char ch2 = 's';

        // Displaying above character on console
        System.out.println("char value: " + ch2);

        // Converting the Character to it's int value
        // using getNumericValue() method of Character Class
        int a2 = Character.getNumericValue(ch2);

        // Printing the corresponding integral value
        System.out.println("int value: " + a2);
    }
}

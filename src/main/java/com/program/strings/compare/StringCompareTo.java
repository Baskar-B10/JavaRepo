package com.program.strings.compare;// Java program to StringEqualsByCharAt two strings
// Using String.compareTo() 
//Time Complexity: O(N)
//Auxiliary Space: O(1)
// Diver Class
// Each character of both the strings is converted into a Unicode value for comparison.
//
//int compareTo(String str) :
//It returns the following values:
//
//if (string1 > string2) it returns a positive value.
//if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.
//if (string1 < string2) it returns a negative value.
public class StringCompareTo {
    public static void check(String string1, String string2)
    {
        if (string1.compareTo(string2)!=0) {
            System.out.println(string1 + " " + string2
                               + " : Not Equal");
        }
        else {
            System.out.println(string1 + " " + string2
                               + " : Equal");
        }
    }

    // main function
    public static void main(String args[])
    {
        String string1 = new String("CronUnitsDemo");
        String string2 = new String("Geeks");
        String string3 = new String("Geeks");
        String string4 = " ";
        String string5 = " ";

        // Comparing for String 1 != String 2
        check(string1, string2);

        // Comparing for String 2 = String 3
        check(string2, string3);

        // Comparing for String 1 != String 4
        check(string1, string4);

        // Comparing for String 4 = String 5
        check(string4, string5);


//Time Complexity: O(N)
//Auxiliary Space: O(1)
        String s1 = "Ram";
        String s2 = "Ram";
        String s3 = "Shyam";
        String s4 = "ABC";

        System.out.println(" Comparing strings with compareTo:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}

package com.program.strings.compare;

// Java program to StringEqualsByCharAt two strings
// lexicographically
//Time Complexity: O(n)
//Auxiliary Space: O(1)
class StringEqualsByCharAt {

    // This method compares two strings 
    // lexicographically without using 
    // library functions 
    public static int stringCompare(String str1, 
                                    String str2) 
    { 
        for (int i = 0; i < str1.length() && 
                    i < str2.length(); i++) { 
            if ((int)str1.charAt(i) == 
                (int)str2.charAt(i)) { 
                continue; 
            } 
            else { 
                return (int)str1.charAt(i) - 
                    (int)str2.charAt(i); 
            } 
        } 

        // Edge case for strings like 
        // String 1="Geeky" and String 2="Geekyguy" 
        if (str1.length() < str2.length()) { 
            return (str1.length()-str2.length()); 
        } 
        else if (str1.length() > str2.length()) { 
            return (str1.length()-str2.length()); 
        } 
        
        // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else { 
            return 0; 
        } 
    } 

    // Driver function to test the above program 
    public static void main(String args[]) 
    { 
        String string1 = new String("Geeks"); 
        String string2 = new String("Practice"); 
        String string3 = new String("Geeks"); 
        String string4 = new String("CronUnitsDemo");
    
        System.out.println(stringCompare(string1, 
                                        string2)); 
        System.out.println(stringCompare(string1, 
                                        string3)); 
        System.out.println(stringCompare(string2, 
                                        string1)); 

        // To show for edge case 
        // In these cases, the output is the difference of 
        // length of the string 
        System.out.println(stringCompare(string1, 
                                        string4)); 
        System.out.println(stringCompare(string4, 
                                        string1)); 
    } 
} 

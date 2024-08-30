package com.program.strings.find;// Java program to get a specific character
// from a given String at a specific index

class GetCharacter {

    // Driver code
    public static void main(String[] args)
    {

        // Get the String
        String str = "GeeksForGeeks";

        // Get the index
        int index = 5;

        // Get the specific character
        char ch = str.charAt(index);

        System.out.println("Character from " + str
                           + " at index " + index
                           + " is " + ch);

        // Get the specific character
        char cha = getCharFromStringUsingCharArray(str, index);

        System.out.println("Character from " + str
                + " at index " + index
                + " is " + cha);


        // Get the specific character
        char chaa = getCharFromStringUsingCodePoint(str, index);

        System.out.println("Character from " + str
                + " at index " + index
                + " is " + chaa);


        // Get the specific character
        char chaaa = getCharFromStringUsingGetChars(str, index);

        System.out.println("Character from " + str
                + " at index " + index
                + " is " + chaaa);

    }

    public static char
    getCharFromStringUsingCharArray(String str, int index)
    {
        return str.toCharArray()[index];
    }

    // Function to get the specific character
    public static char
    getCharFromStringUsingCodePoint(String str, int index)
    {
        return (char)str.codePointAt(index);
    }

    // Function to get the specific character
    public static char
    getCharFromStringUsingGetChars(String str, int index)
    {
        // Create a character array of size 1
        char[] singleCharArray = new char[1];

        // Get the specific character from the String
        // into the char[] at index 0
        str.getChars(index, index + 1, singleCharArray, 0);

        // Return the specific character
        // present at index 0 in char[]
        return singleCharArray[0];
    }

}

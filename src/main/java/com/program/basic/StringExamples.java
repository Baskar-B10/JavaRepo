package com.program.basic;

public class StringExamples {

    static String isVowel(char ch)
    {
        // Make the list of vowels
        String str = "aeiouAEIOU";
        return (str.indexOf(ch) != -1) ? "Vowel"
                : "Consonant";
    }
    static void Vowel_Or_Consonant(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                || y == 'O' || y == 'U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }
    public static void main(String[] args)
    {
        System.out.println("It is a " + isVowel('a'));
        System.out.println("It is a " + isVowel('x'));

        Vowel_Or_Consonant('W');
        Vowel_Or_Consonant('I');
    }
}

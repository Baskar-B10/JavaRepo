package com.program.Conversion;

public class IntToChar {

    // OverloadingMain method
    public static void main(String[] args)
    {
        // Custom integer input
        int i = 97;

        // Type casting character to integer
        char ch = (char)i;

        // Print statement
        System.out.println(ch);

        int j = 64;
        char ch1 = (char)(j + '0');
        System.out.println(ch1);

        int base = 10;
        int a = 5;

        char ans = Character.forDigit(a, base);
        System.out.println(ans);

        int base1 = 16;
        int a1 = 1;

        while (a1 < 16) {
            char ans1 = Character.forDigit(a1, base1);
            System.out.print(ans1+" ");
            a1++;
        }
    }
}

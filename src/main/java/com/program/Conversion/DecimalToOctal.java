package com.program.Conversion;

public class DecimalToOctal {

    // Method
    // To convert decimal to octal
    static void decToOctal(int n)
    {
        // Creating an Integer array of
        // array to store octal number
        int[] octalNum = new int[100];

        // counter for octal number array
        int i = 0;
        while (n != 0) {

            // Storing remainder in octal array
            octalNum[i] = n % 8;
            n = n / 8;
            i++;
        }

        // Printing octal number array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
    }
    // Method 1
    // To calculate the octal value of the given
    // decimal number
    static void decimaltooctal(int deciNum)
    {

        // Initially declaring and initializing the
        // octal number with zero
        int octalNum = 0, countval = 1;
        int dNo = deciNum;

        // Condition check
        while (deciNum != 0) {

            // Decimals remainder is calculated
            int remainder = deciNum % 8;

            // Storing the octalvalue
            octalNum += remainder * countval;

            // Storing exponential value
            countval = countval * 10;
            deciNum /= 8;
        }

        // Print and display the octal number
        System.out.println(octalNum);
    }

    // Method 2
    // OverloadingMain driver method
    public static void main(String[] args)
    {
        // Custom input Integer number
        int n = 33;

        // Calling the above method to convert
        // Decimal to Octal number
        decToOctal(n);

        int a = 33;

        // Calling the Method1 to convert above number
        // to Octal number system
        decimaltooctal(a);
    }
}

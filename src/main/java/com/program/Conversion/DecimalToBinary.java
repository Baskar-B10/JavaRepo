package com.program.Conversion;

public class DecimalToBinary {

    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];

        // counter for binary array
        int i = 0;
        while (n > 0)
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    public static void decToBinaryUsingLoop(int n)
    {
        // Size of an integer is assumed to be 32 bits
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
    static int decimalToBinary(int N)
    {

        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;

            // Count used to store exponent value
            cnt++;
        }

        return B_Number;
    }

    public static String decimalToBinaryUsingCustom(int n)
    {
        int remainder, quotient = n;
        String binaryNum = "";
        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum
                    = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }
        return binaryNum;
    }
    // driver program
    public static void main (String[] args)
    {
        int n = 17;
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        decToBinary(n);
        System.out.println();
        int a = 32;
        System.out.println("Decimal - " + a);
        System.out.print("Binary - ");
        decToBinaryUsingLoop(a);
        System.out.println();
        int N = 15;
        System.out.println("Decimal - " + N);
        System.out.print("Binary - ");
        System.out.println(decimalToBinary(N));
        System.out.println();
        int decimal = 10;
        String binary = decimalToBinaryUsingCustom(decimal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
    }
}

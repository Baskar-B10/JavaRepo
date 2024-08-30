package com.program.basic;

public class MathOperations {

    public static int LargestNumbersByMath(int num1, int num2, int num3) {

        int largest = Math.max(Math.max(num1, num2), num3);

        System.out.println("The largest number is: " + largest);

        return largest;
    }
}

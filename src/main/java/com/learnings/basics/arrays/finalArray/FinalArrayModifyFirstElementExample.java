package com.learnings.basics.arrays.finalArray;

import java.util.Arrays;

public class FinalArrayModifyFirstElementExample {
  
    public static void main(String[] args)
    {
        final int[] numbers = { 1, 2, 3, 4, 5 };
        // Attempting to reassign the array reference will
        // result in a compilation error: numbers = new
        // int[] {6, 7, 8, 9, 10};

        // However, individual elements of the array can
        // still be modified:
        numbers[0] = 10;
        System.out.println(
            "Array after modifying first element: "
            + Arrays.toString(numbers));
    }
}

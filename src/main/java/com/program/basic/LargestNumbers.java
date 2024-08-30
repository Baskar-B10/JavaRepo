package com.program.basic;

public class LargestNumbers {

    public static void main(String[] args) {
        int a, b, c;

        // Variable holding the largest number

        a = 5;
        b = 10;
        c = 3;
        // Calling the above function in main
        System.out.println(biggestOfThreeUsingUrinary(a, b, c));
        System.out.println(biggestOfThreeUsingConditional(a, b, c));
        //other class
        System.out.println(CollectionExamples.biggestOfThreeUsingCollections(a, b, c));
        //other class
        System.out.println(MathOperations.LargestNumbersByMath(a, b, c));
    }

    static int biggestOfThreeUsingUrinary(int x, int y, int z)
    {

        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

    static int biggestOfThreeUsingConditional(int x, int y, int z)
    {

        // Comparing all 3 numbers
        if (x >= y && x >= z)

            // Returning 1st number if largest
            return x;

            // Comparing 2nd no with 1st and 3rd no
        else if (y >= x && y >= z)

            // Return z if the above conditions are false
            return y;

        else

            // Returning 3rd no, Its sure it is greatest
            return z;
    }



}

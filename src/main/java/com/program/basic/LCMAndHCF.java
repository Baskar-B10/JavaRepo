package com.program.basic;

public class LCMAndHCF {

    static int GCDUsingModulus(int u, int v)
    {
        if (u == 0)
            return v;
        return GCDUsingModulus(v % u, u);
    }

    // LCM of two numbers
    static int LCM(int u, int v)
    {
        return (u / GCDUsingModulus(u, v)) * v;
    }



    static int LCMUsingWhile(int a, int b){


        // Checking for the largest
        // Number between them
        int ans = (a > b) ? a : b;

        // Checking for a smallest number that
        // can de divided by both numbers
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }

        // Printing the Result

        return ans;
    }


    static int GCDUsingSubtract(int x, int y)
    {
        // Everything is divisible by 0
        if (x == 0)
            return y;
        if (y == 0)
            return x;

        // Both the numbers are equal
        if (x == y)
            return x;

        // x is greater
        if (x > y)
            return GCDUsingSubtract(x - y, y);
        return GCDUsingSubtract(x, y - x);
    }
    // main method
    public static void main(String[] args)
    {
        int u = 25, v = 15;
        System.out.println("LCM of " + u + " and " + v
                + " is " + LCM(u, v));
        int a = 10, b = 7;
        System.out.println("LCM of " + u + " and " + v
                + " is " + LCMUsingWhile(a, b));

        int x = 100, y = 88;
        System.out.println("GCD of " + x + " and " + y
                + " is " + GCDUsingSubtract(x, y));

        int i = 47, j = 91;
        System.out.println("The GCD of " + i + " and " + j
                + " is: " + GCDUsingModulus(i, j));
    }
}


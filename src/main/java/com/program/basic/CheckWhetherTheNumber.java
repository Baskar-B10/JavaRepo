package com.program.basic;

public class CheckWhetherTheNumber {

    static void primeNumbers(int N)
    {
        // Declaring the variables
        int x, y, flg;

        // Printing display message
        System.out.println(
                "All the Prime numbers within 1 and " + N
                        + " are:");

        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 1; x <= N; x++) {

            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
                continue;

            // Using flag variable to check
            // if x is prime or not
            flg = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }

            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                System.out.print(x + " ");
        }
    }

   static void sieveOfEratosthenes(int n)
    {
        // Create a boolean array
        // "prime[0..n]" and
        // initialize all entries
        // it as true. PublicMethods value in
        // prime[i] will finally be
        // false if i is Not a
        // prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }


    public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;

        is_leap_year = (year % 4 == 0 && year % 100 != 0
                || year % 400 == 0)
                ? true
                : false;
        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }

    static void ArmstrongNum(int l, int h)
    {
        for (int j = l + 1; j < h; ++j) {

            // Calculating number of digits
            int y = j;
            int N = 0;
            while (y != 0) {
                y /= 10;
                ++N;
            }

            // Calculating the sum of nth
            // power of all the digits
            int sum_power = 0;
            y = j;
            while (y != 0) {
                int d = y % 10;
                sum_power += Math.pow(d, N);
                y /= 10;
            }

            // Checking if the current number
            // i is equal to the sum of nth
            // power of all the digits
            if (sum_power == j)
                System.out.print(j + " ");
        }
    }

    public static void checkNeon(int n)
    {
        // squaring the number to be checked
        int square = n * n;

        // Initializing current sum to 0
        int sum = 0;

        // If product is positive
        while (square > 0) {

            // Step 1: Find remainder
            int r = square % 10;

            // Add remainder to the current sum
            sum += r;

            // Drop last digit of the product
            // and store the number
            square = square / 10;
        }

        // Condition check
        // Sum of digits of number obtained is
        // equal to original number
        if (sum == n)

            // number is neon
            System.out.println("Given number " + n
                    + " is Neon number");
        else

            System.out.println("Given number " + n
                    + " is not a Neon number");
    }

    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    static int factorialUsingRecursive(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    static int factorialUsingOneLine(int n)
    {

        // single line to find factorial
        return (n == 1 || n == 0) ? 1
                : n * factorial(n - 1);
    }

    static int Fib_Even_Sum(int N)
    {
        if (N <= 0)
            return 0;

        int fib[] = new int[2 * N + 1];
        fib[0] = 0;
        fib[1] = 1;

        // Initializing the sum
        int s = 0;

        // Adding remaining numbers
        for (int j = 2; j <= 2 * N; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];

            // Only considering even indexes
            if (j % 2 == 0)
                s += fib[j];
        }

        return s;
    }

    static int MAX = 1000;

    // Create an array for memoization
    static int f[] = new int[MAX];

    // Returns n'th Fibonacci number
    // using table f[]
    static int fib(int n)
    {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return (f[n] = 1);
        }

        // If fib(n) is already computed
        if (f[n] == 1) {
            return f[n];
        }

        int k = (n % 2 == 1) ? (n + 1) / 2 : n / 2;

        // Applying above formula [Note value n&1 is 1
        // if n is odd, else 0].
        f[n] = (n % 2 == 1)
                ? (fib(k) * fib(k)
                + fib(k - 1) * fib(k - 1))
                : (2 * fib(k - 1) + fib(k)) * fib(k);

        return f[n];
    }

    // Computes value of even-indexed Fibonacci Sum
    static int calculateEvenSum(int n)
    {
        return (fib(2 * n + 1) - 1);
    }

    // The Driver code
    public static void main(String[] args) {
        int N = 45;

        primeNumbers(N);
        System.out.println();
        System.out.println("sieve Of Eratosthenes to print Prime Numbers till " + N + " :");
        sieveOfEratosthenes(N);
        System.out.println();
        isLeapYear(2004);
        isLeapYear(2002);
        DateTimeExamples.isLeapYear(1995);

        int n1 = 50;
        int n2 = 500;
        //pqrs... = p^n + q^n + r^n + s^n +.... n = number of digits
        System.out.println("Armstong Numbers between " + n1 + " and " + n2 + " :");
        ArmstrongNum(n1, n2);
        //square of 9=9*9=81;
        // sum of digit of square : 8+1=9(which is equal to given numbers so Neon Number

        checkNeon(9);
        checkNeon(8);
    //n! = n * (n-1) * (n-2) * (n-3) * ........ * 1
        int num = 5;
        System.out.println("Factorial of " + num + " is "
                + factorial(15));
        System.out.println("Factorial of " + num + " is "
                + factorialUsingRecursive(6));
        System.out.println("Factorial of " + num + " is "
                + factorialUsingOneLine(7));

        int F = 11;

        // Prints the sum of even-indexed numbers
        System.out.println(
                "Even sum of fibonacci series till number " + F
                        + " is: " + +Fib_Even_Sum(F));

        int n = 10;

        // Find the alternating sum
        System.out.println(
                "Even indexed Fibonacci Sum upto " + n
                        + " terms: " + calculateEvenSum(n));
    }
}

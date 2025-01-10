package com.learnings.basics.arrays.multiDimensional;// Java Program Demonstrating use of
// Multi Dimensional Array
import java.util.Scanner;

class ThreeDArrayWithUserInput {
    public static void main(String[] args){
        
          // Scanner class to take
        // values from console
        Scanner scn = new Scanner(System.in);
        
        int n, m;

        // takes total number of
        // TestCases as integer number
        n = scn.nextInt();

        // An array is formed as row
        int[][] arr = new int[n][];

        // for loop to take input of
        // values in each TestCase
        for (int i = 0; i < arr.length; i++) {
            
              // Accepting number of columns
              m = scn.nextInt();
            arr[i] = new int[m];
          
              // Accepting elements in the Two
              // Dimensional Array
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }


        for (int i = 0; i < arr.length; i++) {

            int odd = 0, even = 0;

            System.out.println("Rows " + i + " with " + arr[i].length + " Columns");
              System.out.println("Elements of Array:");
          
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                // Checking Odd and even numbers
                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
            System.out.println();

            // Printing even and odd number
            System.out.println("Even: " + even + ", Odd: " + odd);
          
        }
    }
}
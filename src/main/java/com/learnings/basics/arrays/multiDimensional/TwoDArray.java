package com.learnings.basics.arrays.multiDimensional;

// Java Program to demonstrate the use of
// Two Dimensional Array
public class TwoDArray {
    public static void main(String[] args) {

        // Array Intialised and Assigned
        int[][] arr1 = { { 1, 2 }, { 3, 4 } };

        // Printing the Array
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
      
          // Row and Columns in Array
        int n = 2;
        int m = 2;

          // Array declared and initialized
        int[][] arr = new int[n][m];

        int it = 1;
      
          // Assigning the values to array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = it;
                it++;
            }
        }

          // Printing the Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
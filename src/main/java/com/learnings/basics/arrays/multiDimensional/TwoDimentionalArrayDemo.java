package com.learnings.basics.arrays.multiDimensional;// Java Program to demonstrate
// Multidimensional Array

class TwoDimentionalArrayDemo {
    public static void main(String[] args){
      
        // Two Dimensional Array 
          // Declared and Initialized
          int[][] arr = new int[3][3];
        

        // Number of Rows
        System.out.println("Rows : " + arr.length);
      
        // Number of Columns
        System.out.println("Columns : " + arr[0].length);

        // declaring and initializing 2D array
        int arr1[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr1[i][j] + " ");

            System.out.println();
        }
    }
}
package com.program.stream;// Java Program to Sorting a 2D Array according to values
// in any given column 

import java.util.Arrays;

// Class
class MatrixSortByStream {
  
    // Method to sort by column
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort with lambda expressions
      
      Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col])); // increasing order
        
    }
    public static void main(String args[])
    {
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 56, 89 },
                           { 24, 64, 20, 65 } };
        // Sort this matrix by 3rd Column
        int col = 3;
        sortbyColumn(matrix, col - 1);
  
        // Display the sorted Matrix
        for (int i = 0; i < matrix.length; i++) {
          
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
            
        }
    }
}

package com.testSkills;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddColumnForArray {

    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 2, -1,0 },
                { 3, 0, 0, 5 ,2},
                { 2, 1, 4, -3 ,4},
                { 1, 0, 5, 0 ,9}
        };
        IntStream rowsStream= Arrays.stream(addRows(mat));

        System.out.println("Rows added: ");
        rowsStream.forEach(i -> System.out.print( i + " "));
        IntStream columnStream= Arrays.stream(addColumns(mat));

        System.out.println("Columns added: ");
        columnStream.forEach(i -> System.out.print( i + " "));
    }

    static int[] addRows(int mat[][]) {
       int rows = mat.length;
         int columns =mat[0].length;
        int[] output = new int[rows];
        System.out.println("rows :"+ rows + " columns :" + columns);
        for (int i = 0; i < rows; i++){
            int count =0;
            // Loop through all elements of current row
            for (int j = 0; j < columns; j++){
                count = count + mat[i][j];
            }
            output[i]=count;
        }
        return output;
    }
    static int[] addColumns(int mat[][]) {
        int rows = mat.length;
        int columns =mat[0].length;
        int[] output = new int[columns];

        for (int j=0; j <columns; j++){
            int count =0;
            for (int i=0; i< rows; i++){
                count = count + mat[i][j];
            }
            output[j]=count;
        }

        return output;
    }

}

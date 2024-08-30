package com.program.arrays.twoDimensional;

public class TransposeMatrix {

    static final int N = 4;
    //Time Complexity: O(n2)
    //Auxiliary Space: O(n2)

    // This function stores transpose
    // of A[][] in B[][]
    static void transposeForSquare(int A[][], int B[][])
    {
        //Time Complexity: O(n2)
        //Auxiliary Space: O(n2)
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                B[i][j] = A[j][i];
    }

    static final int X = 3;
    static final int  Y =4;

    // This function stores transpose
    // of A[][] in B[][]
    static void transposeForRectangular(int A[][], int B[][])
    {
        //Time Complexity: O(n*m)
        //Auxiliary Space: O(n*m)
        int i, j;
        for (i = 0; i < Y; i++)
            for (j = 0; j < X; j++)
                B[i][j] = A[j][i];
    }

    // Finds transpose of A[][] in-place
    static void transpose(int A[][])
    {
        //Time Complexity: O(n2)
        //Auxiliary Space: O(1)
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
    }


    // Driver code
    public static void main(String[] args)
    {
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        int B[][] = new int[N][N], i, j;

        transposeForSquare(A, B);

        System.out.print("Result matrix is \n");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }

        int C[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } };

        int D[][] = new int[Y][X], x, y;

        transposeForRectangular(A, B);

        System.out.print("Result matrix is \n");
        for (x = 0; x < Y; x++) {
            for (y = 0;  y < X; y++)
                System.out.print(B[x][y] + " ");
            System.out.print("\n");
        }

        transpose(A);

        System.out.print("Modified matrix is \n");
        for (int a = 0; a < N; a++) {
            for (int b = 0; b < N; b++)
                System.out.print(A[a][b] + " ");
            System.out.print("\n");
        }
    }
}

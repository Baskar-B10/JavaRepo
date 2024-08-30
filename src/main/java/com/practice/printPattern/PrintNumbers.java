package com.practice.printPattern;

public class PrintNumbers {

    public static void main(String[] args) {
        printNos(10);
        System.out.println();
        int[] arr= {12,212,45,34};
        printArray(arr);
    }

        public static void printNos(int N)
        {
            //Your code here

            for (int i = 1; i <=N; i++) {
                System.out.print(i+" ");
            }
        }



// User function Template for Java


        // Just print the space seperated array elements
        static void printArray(int arr[]) {
            //   code here
            for(int num: arr){
                System.out.print(num + " ");
            }
        }


}

package com.practice.array;

// User function Template for Java
class MissingNumInArray {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,8,9,10};
        System.out.println(missingNumber(10,arr));
    }

    // Note that the size of the array is n-1
    static int missingNumber(int n, int arr[]) {
    int sum=0;
    int actualSum= n*(n+1)/2;
    for(int num: arr){
       sum = sum +num; 
    }
    return actualSum-sum;
        // Your Code Here
    }
}
package com.practice.algorithm;

public class KadaneAlgorithm {
    // User function Template for Java

    public static void main(String[] args) {
        int [] arr={90,64, -76 ,65 ,1 ,93 ,-99 ,-76 ,
                -87 ,88 ,63 ,-79 ,85 ,-15 ,4 ,-32 ,69 -22};
        System.out.println(maxSubarraySum(arr));
    }

        // arr: input array
        // Function to find the sum of contiguous subarray with maximum sum.
        static long maxSubarraySum(int[] arr) {

            // Your code here
            long maxSoFar=arr[0];
            long maxEndHere=arr[0];
            for(int i=1; i<arr.length; i++){

                maxEndHere= Math.max(arr[i], maxEndHere+arr[i]);

                maxSoFar=Math.max(maxSoFar,maxEndHere);

            }

            return maxSoFar;
        }

}

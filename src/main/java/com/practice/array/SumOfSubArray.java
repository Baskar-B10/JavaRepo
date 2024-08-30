package com.practice.array;


import java.util.ArrayList;

class SumOfSubArray {

    public static void main(String[] args) {
        int [] arr={1,2,3,7,5};
        System.out.println(subarraySum(arr,5,12));
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        
        int sum=0;
        int start =0;
        ArrayList<Integer> output= new ArrayList<Integer>();
        
        for (int end =0; end<n; end++) {
            sum = sum +arr[end];
            
            while (sum> s && start <= end){
                sum = sum - arr[start++];
            }
            
            if(sum==s  && start<= end){
                output.add(start+1);
                output.add(end+1);
                return output;
            }
            
        }
        
        if(output.isEmpty()){
            output.add(-1);
        }
        
        return output;
    }
}
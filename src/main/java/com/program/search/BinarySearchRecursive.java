package com.program.search;

public class BinarySearchRecursive {

    // Java implementation of
// recursive Binary Search

    // Driver Class

//Time Complexity: O(log N)
//Space Complexity: O(1), If the recursive call stack is considered then the auxiliary space will be O(log N)
        // Returns index of x if it is present in arr[l..
        // r], else return -1
        int binarySearchRecursive(int arr[], int l, int r, int x)
        {
            if (r >= l) {
                int mid = l + (r - l) / 2;

                // If the element is present at the
                // middle itself
                if (arr[mid] == x)
                    return mid;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                if (arr[mid] > x)
                    return binarySearchRecursive(arr, l, mid - 1, x);

                // Else the element can only be present
                // in right subarray
                return binarySearchRecursive(arr, mid + 1, r, x);
            }

            // We reach here when element is not present
            // in array
            return -1;
        }

        // main function
        public static void main(String args[])
        {
            BinarySearchRecursive ob = new BinarySearchRecursive();

            int arr[] = { 2, 3, 4, 10, 40 };
            int n = arr.length;
            int x = 10;
            int result = ob.binarySearchRecursive(arr, 0, n - 1, x);

            if (result == -1)
                System.out.println(
                        "Element is not present in array");
            else
                System.out.println(
                        "Element is present at index " + result);
        }


}

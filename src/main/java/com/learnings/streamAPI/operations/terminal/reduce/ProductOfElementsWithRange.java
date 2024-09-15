package com.learnings.streamAPI.operations.terminal.reduce;// Implementation of reduce method
// to get the product of all numbers
// in given range.
import java.util.stream.IntStream;

class ProductOfElementsWithRange {
    public static void main(String[] args) {
        // Calculating the product of all numbers in the range [2, 8)
        int product = IntStream.range(2, 8)
            .reduce((num1, num2) -> num1 * num2)
            .orElse(-1); // Provides -1 if the stream is empty

        // Displaying the product
        System.out.println("The product is : " + product); 
    }
}

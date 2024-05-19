/*
============== Java Programming II ==============
Part 12
Section 2 - ArrayList and hash table
Ex 3 - Sum these for me


Implement a program that computes the sum of the elements in an array.
=================================================
*/

import java.util.Scanner;

public class Program {

    // Main program
    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));  
        System.out.println(sum(numbers, 0, 0, 0, 10)); 
        System.out.println(sum(numbers, 0, 1, 0, 10)); 
        System.out.println(sum(numbers, 0, 1, -10, 10)); 
        System.out.println(sum(numbers, -1, 999, -10, 10)); 
    }
    
    // Class method
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        // Check the input indexes and fix it if needed
        if (fromWhere < 0) {
            fromWhere = 0;
        } 
        
        if (toWhere >= array.length) {
            toWhere = array.length - 1;
        }
        
        // Compute the sum of the elements in the array
        int sum = 0;
        for (int i = fromWhere; i <= toWhere; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }
        return sum;
    }
}

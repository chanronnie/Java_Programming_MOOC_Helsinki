/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 15 - Print In Range


Write a program that prints all numbers within the lower and upper limits by creating a method. 
It is not necessary to print the numbers in ascending or descending order.
=================================================
*/

import java.util.ArrayList;

public class PrintInRange {

    // Main program
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
        
    }
    
    // Implement the method
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        
        for (int num: numbers) {
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    } 
}

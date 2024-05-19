/*
============== Java Programming I ==============
Part 2
Section 4 - Methods and dividing the program into smaller parts
Ex 26 - Divisible by three


Write a method public static void divisibleByThreeInRange(int beginning, int end) 
that prints all the numbers divisible by three in the given range. 
The numbers are to be printed in order from the smallest to the greatest.
=================================================
*/

import java.util.Scanner;

public class DivisibleByThree {

    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program prints numbers divisible by 3 within the given range.");
        System.out.println("Give two numbers (lower limit and upper limit):");
        
        int lower = Integer.valueOf(scanner.nextLine()); 
        int upper = Integer.valueOf(scanner.nextLine()); 
        divisibleByThreeInRange(lower, upper);
    }
    
    
    // Implement the method
    public static void divisibleByThreeInRange(int start, int end) {
    
        int number = start;
        while (number <= end) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}

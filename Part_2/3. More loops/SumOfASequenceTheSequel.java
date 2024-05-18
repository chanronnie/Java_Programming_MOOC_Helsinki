/*
============== Java Programming I ==============
Part 2
Section 3 - More loops
Ex 18 - Sum of a sequence the sequel


Implement a program which calculates the sum of a closed interval, and prints it. 
Expect the user to write the smaller number first and then the larger number.
=================================================
*/

import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two numbers
        System.out.println("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        // Compute the sum
        int sum = 0;
        int number = firstNumber;
        while (number <= lastNumber) {
            sum += number;
            number ++;
        }
        System.out.println("The sum is " + sum);
    }
}

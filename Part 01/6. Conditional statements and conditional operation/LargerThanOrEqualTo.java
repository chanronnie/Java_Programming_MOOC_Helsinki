/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 30 - Larger Than or Equal To


Write a program that prompts the user for two integers and prints the larger of the two. 
If the numbers are the same, then the program informs us about this as well.
=================================================
*/

import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user for two integers
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scan.nextLine());
        
        // Check integers
        if (firstNum > secondNum) {
            System.out.println("Greater number is: " + firstNum);
        } else if (firstNum < secondNum) {
            System.out.println("Greater number is: " + secondNum);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}

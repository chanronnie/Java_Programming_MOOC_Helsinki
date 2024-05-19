/*
============== Java Programming I ==============
Part 1
Section 4 - Variables
Ex 12 - Integer Input


Write a program that prompts the user for an integer and outputs it.
=================================================
*/

import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        // Output the integer
        System.out.println("You gave the number " + number);
    }
}

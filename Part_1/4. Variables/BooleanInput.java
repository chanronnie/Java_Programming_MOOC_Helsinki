/*
============== Java Programming I ==============
Part 1
Section 4 - Variables
Ex 14 - Boolean Input


Write a program that prompts the user for a string and outputs its boolean value.
=================================================
*/

import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        
        // Output the message in boolean type
        System.out.println("True or false? " + value);
    }
}

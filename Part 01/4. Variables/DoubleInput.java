/*
============== Java Programming I ==============
Part 1
Section 4 - Variables
Ex 13 - Double Input


Write a program that prompts the user for a floating-point number using the variable type Double 
and outputs it in "double" type.
=================================================
*/

import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number 
        System.out.println("Give a number:");
        double number = Double.valueOf(scanner.nextLine());
        
        // Output the number in "double" type
        System.out.println("You gave the number " + number);

    }
}

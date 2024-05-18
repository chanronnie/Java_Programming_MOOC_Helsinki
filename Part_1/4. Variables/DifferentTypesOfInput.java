/*
============== Java Programming I ==============
Part 1
Section 4 - Variables
Ex 15 - Different Types Of Input


Write a program that asks the user for 
- a string
- an integer
- a floating-point number and
- a boolean
The program should then print the values given by the user.
=================================================
*/

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Request inputs
        System.out.println("Give a string:");
        String strValue = scan.nextLine();
        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floatValue = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean boolValue = Boolean.valueOf(scan.nextLine());
        
        // Print the summary of the inputs
        System.out.println("You gave the string " + strValue);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + floatValue);
        System.out.println("You gave the boolean " + boolValue);
    }
}

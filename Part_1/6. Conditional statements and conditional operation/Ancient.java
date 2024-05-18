/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 27 - Ancient


Write a program that prompts the user for a year. If the user inputs a number 
that is smaller than 2015, then the program prints the string "Ancient history!".
=================================================
*/

import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}

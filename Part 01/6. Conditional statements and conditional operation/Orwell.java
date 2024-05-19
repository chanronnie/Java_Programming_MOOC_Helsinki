/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 26 - Orwell


Write a program that prompts the user for an integer and prints 
the string "Orwell" if the number is exactly 1984.
=================================================
*/

import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        
        if (number == 1984 ) {
            System.out.println("Orwell");
        }
    }
}

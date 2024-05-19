/*
============== Java Programming I ==============
Part 2
Section 1 - Recurring problems and patterns
Ex 1 - Squared


Write a program that reads an integer from the user and prints the square of the given integer
=================================================
*/

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The squared of the number " + number + "is " + (number * number));
    }
}

/*
============== Java Programming I ==============
Part 1
Section 5 - Calculating with numbers
Ex 16 - Seconds in a Day


Write a program that prompts the user for a number of days 
and prints the corresponding number of seconds.
=================================================
*/

import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());

        // Output the conversion
        System.out.println(days * 24 * 60 * 60);
    }
}

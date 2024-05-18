/*
============== Java Programming I ==============
Part 1
Section 3 - Reading input
Ex 7 - Message Three Times


Write a program that prompts the user to input a string and then prints that string three times.
=================================================
*/

import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Write a message:");
        String message = scanner.nextLine();
        
        // Output the message three times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}

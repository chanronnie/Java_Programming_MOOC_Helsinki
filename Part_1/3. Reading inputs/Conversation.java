/*
============== Java Programming I ==============
Part 1
Section 3 - Reading input
Ex 9 - Conversation


Write a program that prompts the user to enter some messages after every question.
=================================================
*/

import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Since the input messages will not be printed out, 
        // there is no need to create variables to store them.
        
        System.out.println("Greetings! How are you doing?");
        scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}

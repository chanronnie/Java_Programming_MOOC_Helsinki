/*
============== Java Programming I ==============
Part 1
Section 3 - Reading input
Ex 8 - Greeting


Write a program that prompts the user for their name with the message "What's your name?". 
When the user has written their name, the program has to print "Hi " followed by the user's name.
=================================================
*/

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a name
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        
        // Output a greeting message
        System.out.println("Hi " + name);
    }
}

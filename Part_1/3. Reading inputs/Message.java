/*
============== Java Programming I ==============
Part 1
Section 3 - Reading input
Ex 5 - Message


Write a program that asks the user to write a string. 
When the user has provided a string (i.e., written some text and pressed the enter key), 
the program should print the string that was provided by the user.

The exercise template comes with a program template that includes the creation of a Scanner tool.
=================================================
*/

import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        // Read the string
        String message = scanner.nextLine();
        
        // Output the message
        System.out.println(message);
    }
}



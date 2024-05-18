/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 29 - Last Words


Write a program that reads user input until an empty line is entered. 
For each non-empty line the program splits the string by spaces and prints the last part of the string.
=================================================
*/

import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(" ");
            System.out.println(parts[parts.length-1]);
        }
    }
}

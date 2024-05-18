/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 27 - AV Club


Write a program that reads user input until an empty line. 
For each non-empty string, the program splits the string by spaces   
and then prints the pieces that contain "av", each on a new line.
=================================================
*/

import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split("\\s+");
            for (String part: parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }
    }
}

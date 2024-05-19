/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 24 - Is It True


Write a program that asks the user for a string. 
If the user writes the string "true", 
the program prints "You got it right!", 
otherwise it prints "Try again!".
=================================================
*/

import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solution
        System.out.println("Give a string: ");
        String input = scanner.nextLine();
        
        if (input.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

        // Alternative solution 
        // This code will continue asking the user for a string until the input is "true".
        /*
        System.out.println("Give a string: ");
        while (true) {
            
            String string = scanner.nextLine();
            if (string.equals("true")) {
                System.out.println("You got it right!");
                break;
            } 
            
            System.out.println("Try again!");   
        }*/
    }
}

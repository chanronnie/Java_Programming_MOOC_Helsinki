/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 33 - Password

 
Write a program that prompts the user for a password. 
If the password is "Caput Draconis" the program prints "Welcome!". 
Otherwise, the program prints "Off with you!"
=================================================
*/

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Password?");
        String password = scan.nextLine();
        
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}

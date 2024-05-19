/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 24 - Speeding Ticket


Write a program that asks the user for an integer 
and prints the string "Speeding ticket!" if the input is greater than 120.
=================================================
*/

import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        
        // Check speed value
        if (speed > 120){
            System.out.println("Speeding ticket!");
        }
    }
}

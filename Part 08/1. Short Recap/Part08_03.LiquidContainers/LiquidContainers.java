/*
============== Java Programming I ==============
Part 8
Section 1 - Short Recap
Ex 3 - Liquid Containers 1.0


Implement a program that manages the volume of two containers. 
Write it in the procedural programming style.
=================================================
*/

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
        while (true) {
            // Output the current state of the containers
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            // Read input from the user
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            // Process the command
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && amount > 0) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            
            } else if (command.equals("move") && amount > 0) {
                if (amount > first) {
                    amount = first;
                }
                first -= amount;
                second += amount;
                if (second > 100) {
                    second = 100;
                }
            
            } else if (command.equals("remove") && amount > 0) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            }
            System.out.println("");
        }
    }

}

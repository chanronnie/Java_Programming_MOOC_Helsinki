/*
============== Java Programming I ==============
Part 7
Section 1 - Programming paradigms
Ex 1 - Liquid containers 1.0


Implement a program that manages the contents of the containers.
Write the code in the "procedural programming" style.
=================================================
*/

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxCapacity = 100;
        int first = 0;
        int second = 0;

        while (true) {
            
            // Output the contents of both containers
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            // Read an input from the user
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            // Extract the command and the amount from the input
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println("");
            
            // Process the given command
            if (amount < 0) {
                continue;
            }
            
            if (command.equals("add")) {
                first += amount;
                if (first > maxCapacity) {
                    first = maxCapacity;
                }
                
            } else if (command.equals("move")) {
                first -= amount;
                second += amount;
                
                if (first < 0) {
                    second += first;
                    first = 0;
                } else if (second > maxCapacity) {
                    second = maxCapacity;
                }
                
            } else if (command.equals("remove")) {
                second -= amount;
                if (second < 0){
                    second = 0;
                }
            }
        }
    }
}

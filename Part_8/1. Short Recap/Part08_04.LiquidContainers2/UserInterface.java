/*
============== Java Programming I ==============
Part 8
Section 1 - Short Recap
Ex 4 - Liquid Containers 2.0


Implement a program that manages the volume of two containers. 
This time, write it in the object-oriented programming style.
=================================================
*/

import java.util.Scanner;

public class UserInterface {
    
    // Private fields
    private Scanner scan;
    private Container first;
    private Container second;
    
    // Constructor
    public UserInterface(Scanner scan, Container first, Container second) {
        this.scan = scan;
        this.first = first;
        this.second = second;
    }
    
    // Method
    public void start() {
        while (true) {
            System.out.println("First: " + this.first);
            System.out.println("Second: " + this.second);
            
            String input = this.scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                this.first.add(amount);
                
            } else if (command.equals("move")) {
                if (amount > this.first.contains()) {
                    amount = this.first.contains();
                }
                this.first.remove(amount);
                this.second.add(amount);
                
            } else if (command.equals("remove")) {
                this.second.remove(amount);
            }
            System.out.println("");
        } 
    }
}

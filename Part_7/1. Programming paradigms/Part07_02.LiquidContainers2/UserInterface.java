/*
============== Java Programming I ==============
Part 7
Section 1 - Programming paradigms
Ex 2 - Liquid containers with object 2.0


Implement a program that manages the contents of the containers.
Write the code in the "object-oriented programming" style.
=================================================
*/

import java.util.Scanner;

public class UserInterface {
    
    // Private fields
    private Scanner scanner;
    public Container first;
    public Container second;
    
    // Constructor
    public UserInterface(Scanner scanner, Container first, Container second) {
        this.scanner = scanner;
        this.first = first;
        this.second = second;
    }
    
    public void start() {
        while (true) {
            
            // Print the Contents
            System.out.println("First: " + this.first);
            System.out.println("Second: " + this.second);
           
            // Read an input from the user
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            processCommand(command, amount);
            System.out.println("");
        }
    }
    
    public void processCommand(String command, int amount) {    
        if (command.equals("add")) {
            this.first.add(amount);
        } else if (command.equals("move")) {
            move(amount);
        } else if (command.equals("remove")) {
            this.second.remove(amount);
        }
    }   
    
    public void move(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (amount > this.first.contains()) {
            amount = this.first.contains();
        }
        this.first.remove(amount);
        this.second.add(amount);
    }
}

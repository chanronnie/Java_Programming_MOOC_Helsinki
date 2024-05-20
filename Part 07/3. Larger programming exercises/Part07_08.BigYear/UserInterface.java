/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 8 - Big year


Implement an interactive program that stores birds for bird-watchers.
=================================================
*/

import java.util.Scanner;

public class UserInterface {
    
    // Private fields
    private Scanner scanner;
    private BirdDatabase birds;
    
    // Constructor
    public UserInterface(BirdDatabase birds, Scanner scanner) {
        this.birds = birds;
        this.scanner = scanner;
    }
    
    // Method
    public void start() {
        // Output the command options
        System.out.println("Add - adds a bird\n" +
                           "Observation - adds an observation\n" +
                           "All - prints all birds\n" +
                           "One - prints one bird\n" +
                           "Quit - ends the program\n");
        
        
        while (true) {
            System.out.println("?");
            String command = this.scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                add(); 
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("All")) {
                this.birds.printAll();
            } else if (command.equals("One")) {
                printOne();
            } else {
                System.out.println("Incorrect command - Please re-enter");
            }
        }
    }
  
    // Helper methods
    public void add() {
        System.out.println("Name: ");
        String name = this.scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latin = this.scanner.nextLine();
            
        this.birds.addBird(name, latin);
    }
    
    public void observation() {
        System.out.println("Bird? ");
        String searchedBird = this.scanner.nextLine();
        
        if (!this.birds.contains(searchedBird)) {
            System.out.println("Not a bird!");
            return;
        }     
        this.birds.getBird(searchedBird).addObservation();
    }

    public void printOne() {
        System.out.println("Bird? ");
        String searchedBird = this.scanner.nextLine();
        
        if (!this.birds.contains(searchedBird)) {
            System.out.println("Bird is not found");
            return;
        }
        System.out.println(this.birds.getBird(searchedBird));
    }
}

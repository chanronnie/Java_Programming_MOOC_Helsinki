/*
============== Java Programming II ==============
Part 14
Section 4 - Maven and third-party libraries
Ex 10 - Database


Using the database management system "H2" from Maven, implement a program that manages the user's to-do list.
=================================================
*/

package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    // Private fields
    private Scanner scanner;
    private TodoDao database;

    // Constructor
    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    // Method to start the UI
    public void start() throws SQLException {
        
        while (true) {
            
            // Print the command options
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            // Read the user input
            System.out.print("> ");
            String command = this.scanner.nextLine();
            
            // Process the input command
            if (command.equals("x")) {
                break;
                
            } else if (command.equals("1")) {
                list();
                
            } else if (command.equals("2")) {
                add();  
                
            } else if (command.equals("3")) {
                markAsDone();
                
            } else if (command.equals("4")) {
                remove();
            }
        }
        // Farewell message
        System.out.println("Thank you!");
    }
    
    public void list() throws SQLException {
        System.out.println("Listing the database contents");
        this.database.list().forEach(task -> System.out.println(task.toString()));
    }
    
    public void add() throws SQLException {
        // Prompt the user for the information
        System.out.println("Adding a new todo");
        System.out.println("Enter name");
        String name = this.scanner.nextLine();
        System.out.println("Enter description");
        String description = this.scanner.nextLine();
        
        // Add given Todo to the database with the updated "currentId"
        int currentId = this.database.list().size() + 1;
        this.database.add(new Todo(currentId, name, description, false));
    }
    
    public void markAsDone() throws SQLException {
        while (true) {
            System.out.println("Which todo should be marked as done (give the id)?");
            int inputId = this.scanner.nextInt();
                    
            if (inputId > 0 || inputId < this.database.list().size()) {
                this.database.markAsDone(inputId);
                break;
            }
            // Keep prompting the user for a valid id
            System.out.println("Given id " + inputId + " cannot be found.");
        }
    }
    
    public void remove() throws SQLException {
        while (true) {
            System.out.println("Which todo should be removed (give the id)?");
            int inputId = this.scanner.nextInt();
                    
            if (inputId > 0 || inputId < this.database.list().size()) {
                this.database.remove(inputId);
                break;
            }
            // Keep prompting the user for a valid id
            System.out.println("Given id " + inputId + " cannot be found.");
        }
                
        // Reset the id for the entire database
        int id = 1;
        for (Todo todo: this.database.list()) {
            todo.setId(id);
            id++;
        }
    }
}

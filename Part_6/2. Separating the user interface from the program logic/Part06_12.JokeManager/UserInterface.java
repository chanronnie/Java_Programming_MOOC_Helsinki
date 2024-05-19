/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 12 - Joke Manager 


Implement the class UserInterface.
=================================================
*/

import java.util.Scanner;

public class UserInterface {
    
    // Private fields
    private JokeManager jokes;
    private Scanner scanner;
    
    // Constructor
    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scanner = scan;
    }
    
    // Method
    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = this.scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                addJoke();
            } else if (command.equals("2")) {
                drawJoke();
            } else if (command.equals("3")) {
                printJokes();
            }   
        }
    }
    
    
    public void addJoke() {
        System.out.println("Write the joke to be added:");
        this.jokes.addJoke(this.scanner.nextLine());
    }
    
    public void drawJoke() {
        System.out.println("Drawing a joke.D");
        System.out.println(this.jokes.drawJoke());
    }
    
    public void printJokes() {
        System.out.println("Printing the jokes.");
        this.jokes.printJokes();
    }
}

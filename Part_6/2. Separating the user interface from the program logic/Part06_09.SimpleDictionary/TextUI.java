/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 9 - Simple Dictionary


Implement the TextUI class.
=================================================
*/

import java.util.Scanner;

public class TextUI {
    
    // Private fields
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    // Constructor
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    // Method
    public void start() {
        
        while (true) {
            
            // Request a command from the user
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            
            // Leave the loop and the start() method 
            if (command.equals("end")) {
                break;
            }
            
            processCommand(command);
        }
        
        // Send a farewell message 
        System.out.println("Bye bye!");
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        System.out.println("Word: ");
        String word = this.scanner.nextLine();
        System.out.println("Translation: ");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void search() {
        System.out.println("To be translated: ");
        String searchedWord = this.scanner.nextLine();
                
        String translation = this.dictionary.translate(searchedWord);
        if (translation == null) {
            System.out.println("Word " + searchedWord + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}

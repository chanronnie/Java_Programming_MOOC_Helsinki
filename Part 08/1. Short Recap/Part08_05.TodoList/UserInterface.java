/*
============== Java Programming I ==============
Part 8
Section 1 - Short Recap
Ex 5 - To-do list


Implement an interactive program that manages a to-do list for the user.
Write it in the object-oriented programming style.
=================================================
*/

import java.util.Scanner;

public class UserInterface {
    
    // Private fields
    private TodoList list;
    private Scanner scanner;
    
    // Constructor
    public UserInterface(TodoList theList, Scanner scanner) {
        this.scanner = scanner;
        this.list = theList;
    }
    
    // Method
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                remove();
            }
        }
    }
    public void add() {
        System.out.println("To add: ");
        String task = this.scanner.nextLine();
        this.list.add(task);
    }
    
    public void remove() {
        System.out.println("Which one is removed? ");
        int number = Integer.valueOf(this.scanner.nextInt());
        this.list.remove(number);
    }
}

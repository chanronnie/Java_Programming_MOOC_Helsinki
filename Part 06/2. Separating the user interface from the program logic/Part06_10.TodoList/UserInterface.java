/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 10 - To do list


Implement the classes TodoList and UserInterface.
=================================================
*/

import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            printList();
        } else if (command.equals("remove")) {
            remove();
        }
    }
    
    public void add() {
        System.out.println("To add: ");
        String task = this.scanner.nextLine();
        this.list.add(task);
    }
    
    public void printList() {
        this.list.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed? ");
        int number = Integer.valueOf(this.scanner.nextLine());
        this.list.remove(number);
    }
}   

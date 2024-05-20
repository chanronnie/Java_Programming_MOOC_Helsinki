/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 10 - To do list


Implement the classes TodoList and UserInterface.
=================================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoList toDolist = new TodoList();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface userInterface = new UserInterface(toDolist, scanner);
        userInterface.start();

    }
}

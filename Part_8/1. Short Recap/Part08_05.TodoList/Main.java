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

public class Main {

    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}

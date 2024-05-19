/*
============== Java Programming I ==============
Part 8
Section 1 - Short Recap
Ex 5 - To-do list


Implement an interactive program that manages a to-do list for the user.
Write it in the object-oriented programming style.
=================================================
*/

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        for (int index = 0; index < this.todoList.size(); index++) {
            System.out.println((index+1) + ": " + this.todoList.get(index));
        }
    }
    
    public void remove(int number) {
        if (number < 0 || number >= this.todoList.size()) {
            return;
        }
        
        this.todoList.remove(number-1);
    }

}

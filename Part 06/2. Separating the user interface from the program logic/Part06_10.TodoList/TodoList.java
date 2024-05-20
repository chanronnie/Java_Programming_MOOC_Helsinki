/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 10 - To do list


Implement the classes TodoList and UserInterface.
=================================================
*/

import java.util.ArrayList;

public class TodoList {
 
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void remove(int number) {
        int index = number - 1;
        if (index >= 0 && index < this.list.size()) {
            this.list.remove(index);
        }
    }
    
    public void print() {
        for (int index=0; index < this.list.size(); index++) {
            System.out.println((index + 1) + ": " + this.list.get(index));
        }
    }
}

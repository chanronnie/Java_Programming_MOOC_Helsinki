/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 2 - Stack


Implement the Stack class and a program as directed by the instructions.
=================================================
*/

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
    
    public void add (String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        int topMostIndex = this.stack.size() - 1;
        String topMostValue = this.stack.get(topMostIndex);
        this.stack.remove(topMostIndex);
        return topMostValue;
    }
}

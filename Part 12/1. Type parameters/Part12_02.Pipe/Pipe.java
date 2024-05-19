/*
============== Java Programming II ==============
Part 12
Section 1 - Type Parameters
Ex 2 - Pipe


Implement the class Pipe, which has a single generic type parameter.
=================================================
*/

import java.util.ArrayList;

public class Pipe<T> {
    
    private ArrayList<T> pipe;
    
    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }
    
    public T takeFromPipe() {
        if (this.pipe.isEmpty()) {
            return null;
        }
        T firstElement = this.pipe.get(0);
        this.pipe.remove(0);
        return firstElement;
    }
    
    public boolean isInPipe() {
        return this.pipe.size() > 0;
    }
}

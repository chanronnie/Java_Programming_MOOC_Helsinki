/*
============== Java Programming II ==============
Part 12
Section 2 - ArrayList and hash table
Ex 4 - List


Implement the class List. The object List can store any type of elements.
It should have the methods add, remove, contains, indexValueOf, value and size.
=================================================
*/

public class List<Type> {
    
    private Type[] values;
    private int firstFreeIndex;
    
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    
    public void add(Type value) {
        if (this.values.length == this.firstFreeIndex) {
            grow();
        }
        
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    private void grow() {
        int newSize = this.values.length + this.values.length/2;  
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i=0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
    }
    
    public boolean contains(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
    
    public void remove(Type value) {
        int indexOfvalue = indexOfValue(value);
        if (indexOfvalue < 0) {
            return;
        }
        moveToTheLeft(indexOfvalue);
        this.firstFreeIndex--;
    }
    
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0-"+ this.firstFreeIndex + "]");
        }
        
        return this.values[index];
    }
    
    public int size() {
        return this.firstFreeIndex;
    }
}

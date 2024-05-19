/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 2 - Person and subclasses


Implement classes that utilize class inheritance concepts.
=================================================
*/

public class Student extends Person {
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }
    
    public void study() {
        this.credits++;
    }
    
    public int credits() {
        return this.credits;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
    }
}

/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 2 - Person and subclasses


Implement classes that utilize class inheritance concepts.
=================================================
*/

public class Teacher extends Person{
    private int salary;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }
}

/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 7 - Height Order


Implement the Room class.
=================================================
*/

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> classroom;
    
    public Room() {
        this.classroom = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.classroom.add(person);
    }
    
    public boolean isEmpty() {
        return this.classroom.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.classroom;
    }
    
    public Person shortest() {
        if (this.classroom.isEmpty()) {
            return null;
        }
        
        Person shortest = this.classroom.get(0);
        for (Person person: this.classroom) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (this.classroom.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.shortest();
        this.classroom.remove(this.classroom.indexOf(shortestPerson));
        return shortestPerson;
    }
}

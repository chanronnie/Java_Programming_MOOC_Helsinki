/*
============== Java Programming II ==============
Part 10
Section 3 - Other useful techniques
Ex 16 - Enum and Iterator


Create a program that manages an employee database using the concepts of enum and iterator. 
The database should include the names of the employees along with their highest level of education.
=================================================
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    
    private ArrayList<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.employees.add(person));
    }
    
    public void print() {
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}

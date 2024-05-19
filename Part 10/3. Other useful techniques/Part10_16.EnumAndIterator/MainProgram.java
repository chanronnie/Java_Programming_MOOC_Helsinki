/*
============== Java Programming II ==============
Part 10
Section 3 - Other useful techniques
Ex 16 - Enum and Iterator


Create a program that manages an employee database using the concepts of enum and iterator. 
The database should include the names of the employees along with their highest level of education.
=================================================
*/

public class MainProgram {

    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}

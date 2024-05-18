/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 6 - Door


Create a class named "Door". The door does not have any variables. 
Create for it a constructor with no parameters (or use the default constructor). 
After that, create a public void knock() method for the door that prints the message "Who's there?" when called.
=================================================
*/

public class Main {

    public static void main(String[] args) {
        // This is an empty main method
        // You can use it to test your Door class. Try the following:

        Door alexander = new Door();

        alexander.knock();
        alexander.knock();
    }
}

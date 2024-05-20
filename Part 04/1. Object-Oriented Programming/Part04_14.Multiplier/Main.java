/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 14 - Multiplier


Create a class Multiplier and implement a program as directed by the instructions.
=================================================
*/

public class Main {

    public static void main(String[] args) {
        // Test your Multiplier class here

        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    }
}

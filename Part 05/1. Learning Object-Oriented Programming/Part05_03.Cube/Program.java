/*
============== Java Programming I ==============
Part 5
Section 1 - Learning object-oriented programming
Ex 3 - Cube


Implement a class called "Cube".
=================================================
*/

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}

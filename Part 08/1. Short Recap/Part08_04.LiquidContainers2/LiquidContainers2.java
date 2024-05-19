/*
============== Java Programming I ==============
Part 8
Section 1 - Short Recap
Ex 4 - Liquid Containers 2.0


Implement a program that manages the volume of two containers. 
This time, write it in the object-oriented programming style.
=================================================
*/

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        
        UserInterface ui = new UserInterface(scan, first, second);
        ui.start();
    }

}

/*
============== Java Programming I ==============
Part 7
Section 1 - Programming paradigms
Ex 2 - Liquid containers with object 2.0


Implement a program that manages the contents of the containers.
Write the code in the "object-oriented programming" style.
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

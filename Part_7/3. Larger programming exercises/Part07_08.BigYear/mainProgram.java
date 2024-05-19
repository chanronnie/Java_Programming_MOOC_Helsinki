/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 8 - Big year


Implement an interactive program that stores birds for bird-watchers.
=================================================
*/

import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BirdDatabase birds = new BirdDatabase();
        
        UserInterface ui = new UserInterface(birds, scan);
        ui.start();
    }
}

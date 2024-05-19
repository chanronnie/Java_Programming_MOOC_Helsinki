/*
============== Java Programming II ==============
Part 11
Section 2 - Packages
Ex 10 - Flight Control


Implement the packages and their contents as directed by the instructions.
=================================================
*/

package FlightControl;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(scan);
        
        ui.start();
    }
}

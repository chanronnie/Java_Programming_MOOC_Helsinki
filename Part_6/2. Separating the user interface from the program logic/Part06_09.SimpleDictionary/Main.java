/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 9 - Simple Dictionary


Implement the TextUI class.
=================================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
    }
}

/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 11 - Averages


Implement the classes UserInterface.
=================================================
*/

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
     
    }
}

/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 12 - Joke Manager 


Implement the classes JokeManager and UserInterface.
=================================================
*/

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }       
}

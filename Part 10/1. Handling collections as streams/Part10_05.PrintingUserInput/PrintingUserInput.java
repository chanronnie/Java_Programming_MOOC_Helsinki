/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 5 - Printing User Input


Write a program that prints all user inputs using a stream.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            inputs.add(input);
        }
        
        inputs.stream().forEach(input -> System.out.println(input));
    }
}

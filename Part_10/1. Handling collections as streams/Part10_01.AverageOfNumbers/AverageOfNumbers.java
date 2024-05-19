/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 1 - Average of Numbers


Write a program that computes the average of numbers given by the user using a stream.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        
        // Read inputs from the user
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            numbers.add(input);
        }

        // Compute the average using stream()
        double average = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}

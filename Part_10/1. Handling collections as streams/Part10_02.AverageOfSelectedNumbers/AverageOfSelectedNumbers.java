/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 2 - Average of selected numbers


Write a program that computes the average of numbers given by the user using a stream.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs from the user
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            numbers.add(Integer.valueOf(input));
        }

        // Process the given command
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        
        if (command.equals("n")) {
            double neg_average = numbers.stream()
                                    .mapToInt(i -> i)
                                    .filter(i -> i < 0)
                                    .average()
                                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + neg_average);
        } else if (command.equals("p")) {
            double pos_average = numbers.stream()
                                        .mapToInt(i -> i)
                                        .filter(i -> i > 0)
                                        .average()
                                        .getAsDouble();
            System.out.println("Average of the positive numbers: " + pos_average);
        }
    }
}

/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 4 - Divisible


Write a program that retrieves the numbers from a list that are divisible by 2, 3 or 5 using a stream.
=================================================
*/

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    // Main program
    public static void main(String[] args) {
        
        // Create a list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        // Retrieve numbers that are divisible by 2, 3 or 5
        ArrayList<Integer> divisible = divisible(numbers);

        // Output the result
        divisible.stream()
                .forEach(number -> System.out.println(number));
    }

    // Class method
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream()
                      .filter(num -> num%2 == 0 || num%3 == 0 || num % 5 == 0)
                      .collect(Collectors.toCollection(ArrayList::new));
    }

}

/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 3 - Positive Numbers


Write a program that retrieves the positive numbers from a list by using both a static method and a stream.
=================================================
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(7);
        list.add(-4);
        list.add(2);
        list.add(6);
        list.add(1);
        
        // Call the static method
        System.out.println(positive(list));

    }
    
    // Class method
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toList());
    }
}

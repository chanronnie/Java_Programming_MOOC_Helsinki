/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 6 - Limited numbers


Write a program that prints given integers that are between 1 and 5 using a stream.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int number = scanner.nextInt();
            
            if (number < 0) {
                break;
            }
            
            numbers.add(number);
        }
        
        numbers.stream()
                .filter(num -> num > 0 && num < 6)
                .forEach(num -> System.out.println(num));
        
    }
}

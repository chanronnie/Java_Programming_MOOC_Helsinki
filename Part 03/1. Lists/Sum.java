/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 16 - Sum


Create the method public static int sum(ArrayList<Integer> numbers) in the exercise template. 
The method is to return the sum of the numbers in the parameter list.
=================================================
*/

import java.util.ArrayList;

public class Sum {

    // Main program
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }
    
    // Implement the sum method
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer num: numbers) {
            sum += num;
        }
        return sum;
    }
}

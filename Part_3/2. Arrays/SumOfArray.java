/*
============== Java Programming I ==============
Part 3
Section 3 - Arrays
Ex 20 - Sum Of Array


The class SumOfArray has a method public static int sumOfNumbersInArray(int[] array). 
Complete the method so that it computes and returns the sum of the numbers in the array it receives as parameter.
=================================================
*/

public class SumOfArray {

    // Main program
    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }
    
    // Implement the method
    public static int sumOfNumbersInArray(int[] arrayNumbers) {
        int sum = 0;
        for (Integer element: arrayNumbers) {
            sum += element;
        }
        return sum;
    }
}

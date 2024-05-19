/*
============== Java Programming I ==============
Part 3
Section 3 - Arrays
Ex 22 - Printer


Complete the method public static void printArrayInStars(int[] array) to make it print a row of stars for each number in the array. 
The amount of stars on each row is defined by the corresponding number in the array.
=================================================
*/

public class Printer {

    // Main program
    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    // Implement the method
    public static void printArrayInStars(int[] array) {
        for (Integer number: array) {
            int nbStar = 1;
            while (nbStar <= number) {
                System.out.print("*");
                nbStar++;
            }
            System.out.println("");
        }
    }
}

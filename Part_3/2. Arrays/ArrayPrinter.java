/*
============== Java Programming I ==============
Part 3
Section 3 - Arrays
Ex 21 - Array Printer


Complete the method public static void printNeatly(int[] array) to make it print the numbers of the array it receives more neatly. 
There should be a whitespace and a comma between each number. 
Don't put a comma after the last number.
=================================================
*/

public class ArrayPrinter {

    // Main program
    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    // Implement the method
    public static void printNeatly(int[] array) {
        String printing = "";
        for (int index = 0; index < array.length; index++) {
            printing += array[index];
            if (index < array.length - 1) {
                printing += ", ";
            } 
        }
        System.out.println(printing);
    }
}

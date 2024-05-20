/*
============== Java Programming I ==============
Part 7
Section 2 - Algorithms
Ex 3 - Sorting 


Implement methods that sort an array of numbers in an ascending order.
=================================================
*/

import java.util.Arrays;

public class MainProgram {

    // Main program
    public static void main(String[] args) {
        
        // Testing the smallest() and indexOfSmallest() methods
        int[] array1 = {6, 5, 8, 7, 11};
        System.out.println(Arrays.toString(array1));
        System.out.println("Smallest: " + MainProgram.smallest(array1));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array1));
        System.out.println("");
        
        // Testing the indexOfSmallestFrom() method
        int[] array2 = {-1, 6, 9, 8, 12};
        System.out.println(Arrays.toString(array2));
        System.out.println("Index of the smallest number from index 0: " + MainProgram.indexOfSmallestFrom(array2, 0));
        System.out.println("Index of the smallest number from index 1: " + MainProgram.indexOfSmallestFrom(array2, 1));
        System.out.println("Index of the smallest number from index 2: " + MainProgram.indexOfSmallestFrom(array2, 2));
        System.out.println("");
        
        // Testing the swap() method
        int[] array3 = {3, 2, 5, 4, 8};
        System.out.println("Original array (no swapping): " + Arrays.toString(array3));

        MainProgram.swap(array3, 1, 0);
        System.out.println("After swapping index 1 and 0: " + Arrays.toString(array3));

        MainProgram.swap(array3, 0, 3);
        System.out.println("After swapping index 0 and 3: " + Arrays.toString(array3));
        System.out.println("");
        
        
        // Testing the sort() method
        int[] array4 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(array4);
    }
    
    
    // Class Methods
    public static void sort(int[] array) {
        if (array.length == 0) {
            return;
        }

        int startIndex = 0;
        while (startIndex < array.length) {
            System.out.println(Arrays.toString(array));
            int indexOfSmallest = indexOfSmallestFrom(array, startIndex);
            swap(array, startIndex, indexOfSmallest);
            startIndex++;
        }
    }
    
    public static int smallest(int[] array) {
        if (array.length == 0) {
            return -9999;
        }
        
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        if (array.length == 0) {
            return -1;
        }
        
        int indexOfSmallest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) { 
        if (table.length == 0) {
            return -1;
        }
        
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        if (array.length == 0) {
            return;
        }
        
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}

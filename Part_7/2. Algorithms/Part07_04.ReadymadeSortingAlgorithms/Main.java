/*
============== Java Programming I ==============
Part 7
Section 2 - Algorithms
Ex 4 - Ready-made Sorting Algorithms 


Implement class methods that sort an array and a list using the pre-build Java libraries.
=================================================
*/

// Libraries
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // Main program
    public static void main(String[] args) {
        
        // Sort arrays using the implemented sort class methods below
        int[] array1 = {3, 1, 5, 99, 3, 12};
        System.out.println("Original Array: " + Arrays.toString(array1));
        sort(array1);
        System.out.println("Sorted Array: " + Arrays.toString(array1) + "\n");
        
        String[] array2 = {"bella", "zoe", "fido", "leo", "abby"};
        System.out.println("Original Array: " + Arrays.toString(array2));
        sort(array2);
        System.out.println("Sorted Array: " + Arrays.toString(array2) + "\n");
        
        
        // Sort lists using the implemented sort class methods below
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(5);
        list1.add(0);
        list1.add(-1);
        list1.add(2);
        System.out.println("Original List: " + list1);
        sortIntegers(list1);
        System.out.println("Sorted List: " + list1 + "\n");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("red");
        list2.add("pink");
        list2.add("orange");
        list2.add("brown");
        list2.add("cyan");
        System.out.println("Original List: " + list2);
        sortStrings(list2);
        System.out.println("Sorted List: " + list2  + "\n");
    }
    
    // Class methods
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}

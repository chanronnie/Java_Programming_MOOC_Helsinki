/*
============== Java Programming I ==============
Part 2
Section 4 - Methods and dividing the program into smaller parts
Ex 34 - Advanced Astrology


Create methods that print a Christmas Tree.
=================================================
*/

public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int row = 1;
        while (row <= size) {
            printSpaces(size - row);
            printStars(row);
            row++;
        }   
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int row = 1;
        int rowWidth = height;
        
        // Top of the tree
        while (row <= height) {
            int spaces = height - row;
            printSpaces(spaces);
            printStars(rowWidth - spaces);
            row++;
            rowWidth++;
        }
        
        // Base of the tree
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);    
    }
    

    // Main program
    public static void main(String[] args) {

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

/*
============== Java Programming I ==============
Part 2
Section 4 - Methods and dividing the program into smaller parts
Ex 33 - Star Sign


Create methods that print stars.
=================================================
*/

public class StarSign {

    // Main program
    public static void main(String[] args) {
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    // Define the methods
    public static void printStars(int number) {
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        int row = 1;
        while (row <= size) {
            printStars(size);
            row++;
        }
    }

    public static void printRectangle(int width, int height) {
        int row = 1;
        while (row <= height) {
            printStars(width);
            row++;
        }
    }

    public static void printTriangle(int size) {
        int row = 1;
        while (row <= size) {
            printStars(row);
            row++;
        }
    }
}

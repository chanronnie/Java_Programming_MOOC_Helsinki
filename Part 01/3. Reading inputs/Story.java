/*
============== Java Programming I ==============
Part 1
Section 3 - Reading input
Ex 10 - Story


Write a program that asks the user for a character's name and their job. 
The program then prints a short story.
=================================================
*/

import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Collect information (name and job)
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();
     
        // Print the story
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");
    }
}

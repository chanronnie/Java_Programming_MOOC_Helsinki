/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 7 - Recipe search 


Implement a program that reads recipes from a file and that searches recipes from given command.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;


public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        UserInterface ui = new UserInterface(recipes, scanner);
        ui.start();
    }  
}

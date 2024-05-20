/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 7 - Recipe search 


Implement a program that reads recipes from a file and that searches recipes from given command.
=================================================
*/

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    
    // Private fields
    private ArrayList<Recipe> recipes;
    private Scanner scanner;
    
    // Constructor
    public UserInterface(ArrayList<Recipe> recipes, Scanner scan) {
        this.recipes = recipes;
        this.scanner = scan;
    }
    
    // Methods
    public void start() {
        System.out.println("File to read: ");
        String file = this.scanner.nextLine();
        
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        readFile(file);
        
        while (true) {
            System.out.println("\nEnter command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommand(command);
        }
    }
    
    
    // Helper methods
    public void readFile(String fileName) {
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            
            while (fileReader.hasNextLine()) {
                
                String recipeName = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    recipe.addIngredient(ingredient);
                }
                
                this.recipes.add(recipe);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Cannot open the file: " + fileName);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("list")) {
            list();
        } else if (command.equals("find name")) {
            findName();
        } else if (command.equals("find cooking time")) {
            findCookingTime();
        } else if (command.equals("find ingredient")) {
            findIngredient();
        }
    }
     
    public void list() {
        System.out.println("\nRecipes: ");
        for (Recipe recipe: this.recipes) {
            System.out.println(recipe);
            System.out.println(recipe.getIngredients());
        }
    }
    
    public void findName() {
        System.out.println("Searched word: ");
        String searchedWord = this.scanner.nextLine();
        
        System.out.println("\nRecipes: ");
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime() {
        System.out.println("Max cooking time: ");
        int max = Integer.valueOf(this.scanner.nextLine());
        
        System.out.println("\nRecipes: ");
        for (Recipe recipe: this.recipes) {
            if (recipe.getCookingTime() <= max) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient() {
        System.out.println("Ingredient: ");
        String ingredient = this.scanner.nextLine();
        
        System.out.println("\nRecipes: ");
        for (Recipe recipe: this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}

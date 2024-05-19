/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 7 - Recipe search 


Implement a program that reads recipes from a file and that searches recipes from given command.
=================================================
*/

import java.util.ArrayList;

public class Recipe {
    
    // Private fields
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    // Constructor
    public Recipe(String recipeName, int cookingTime) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return this.recipeName;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
}

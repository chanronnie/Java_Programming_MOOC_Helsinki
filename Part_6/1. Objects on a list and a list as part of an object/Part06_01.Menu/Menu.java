/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 1 - Menu


Implement the Menu class and a program as directed by the instructions.
=================================================
*/

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        } 
    }
    
    public void printMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }
    public void clearMenu() {
        this.meals.clear();
    }
}

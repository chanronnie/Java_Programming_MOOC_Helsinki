/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 1 - Menu


Implement the Menu class and a program as directed by the instructions.
=================================================
*/

public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();
        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
        exactum.addMeal("Roasted lamb in a red wine sauce");
        exactum.printMeals();
        
        System.out.println("---------");
        exactum.clearMenu();
        exactum.printMeals();
        
        System.out.println("---------");
        exactum.addMeal("Tomato and mozzarella salad");
        exactum.printMeals();
    }
}

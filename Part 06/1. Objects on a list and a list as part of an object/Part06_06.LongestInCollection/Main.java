/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 6 - Longest in collection


Implement the SimpleCollection class.
=================================================
*/

public class Main {

    public static void main(String[] args) {

        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Longest: " + c.longest());
        
        c.add("magneto");
        c.add("mystique");
        c.add("phoenix");
        
        System.out.println("Longest: " + c.longest());
    }
}

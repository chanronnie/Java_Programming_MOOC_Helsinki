/*
============== Java Programming I ==============
Part 5
Section 2 - Removing repetitive code (overloading methods and constructors)
Ex 5 - Constructor Overload


Implement three overloading constructors in the Product class.
=================================================
*/

public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}

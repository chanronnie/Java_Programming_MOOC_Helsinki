/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 17 - Money


Implement the Money class.
=================================================
*/

public class MainProgram {

    public static void main(String[] args) {
        
        // Part 1 - Testing plus() method
        Money a = new Money(10,0);
        Money b = new Money(5,0);
        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        System.out.println("------------");
        
        // Part 2 - Testing minus() method
        Money a2 = new Money(10, 0);
        Money b2 = new Money(3, 50);
        Money c2 = a2.minus(b2);

        System.out.println(a2);  // 10.00e
        System.out.println(b2);  // 3.50e
        System.out.println(c2);  // 6.50e

        c2 = c2.minus(a2);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it
        
        System.out.println(a2);  // 10.00e
        System.out.println(b2);  // 3.50e
        System.out.println(c2);  // 0.00e
    }
}

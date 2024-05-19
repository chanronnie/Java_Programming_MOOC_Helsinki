/*
============== Java Programming II ==============
Part 12
Section 1 - Type Parameters
Ex 1 - Hideout


Implement the class Hideout, which has a single generic type parameter.
=================================================
*/

public class Program {

    public static void main(String[] args) {
        
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout()); 
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout()); 
        System.out.println(den.takeFromHideout()); 
        System.out.println(den.isInHideout()); 
        den.putIntoHideout("toodaloo");  
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout()); 
        System.out.println(den.takeFromHideout()); 
        System.out.println(den.isInHideout()); 
        System.out.println("");
        
        Hideout<Integer> integer = new Hideout<>();
        System.out.println(integer.isInHideout());
        integer.putIntoHideout(1);
        System.out.println(integer.isInHideout());
        System.out.println(integer.isInHideout());
        System.out.println(integer.takeFromHideout());
        System.out.println(integer.isInHideout());

    }
}

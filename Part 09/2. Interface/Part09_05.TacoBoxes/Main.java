/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 5 - Taco Boxes 


Implement classes that implements the TacoBox interface.
=======
*/

public class Main {

    public static void main(String[] args) {
        
        // Instantiate a TripleTacoBox object with 3 tacos
        TripleTacoBox triple = new TripleTacoBox();
        System.out.println("Remaining tacos: " + triple.tacosRemaining()); 
        triple.eat();
        System.out.println("Remaining tacos: " + triple.tacosRemaining()); 
        triple.eat();       
        triple.eat();       
        System.out.println("Remaining tacos: " + triple.tacosRemaining()); 
        triple.eat();       
        System.out.println("Remaining tacos: " + triple.tacosRemaining());
        
        // Instantiate a CustomTacoBox object with given number of tacos
        CustomTacoBox custom = new CustomTacoBox(10);
        System.out.println("Remaining tacos: " + custom.tacosRemaining()); 
        custom.eat();
        System.out.println("Remaining tacos: " + custom.tacosRemaining()); 
        custom.eat();       
        custom.eat();       
        System.out.println("Remaining tacos: " + custom.tacosRemaining()); 
    }
}

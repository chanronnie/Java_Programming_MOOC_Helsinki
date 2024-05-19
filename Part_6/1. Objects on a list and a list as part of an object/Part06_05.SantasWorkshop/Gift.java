/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 5 - Santa's Workshop


Implement the Gift class.
=================================================
*/

public class Gift {
   private String name;
   private int weight;
   
   public Gift(String name, int weight) {
       this.name = name;
       this.weight = weight;
   }
   
   public String getName() {
       return this.name;
   }
   
   public int getWeight() {
       return this.weight;
   }
   
   public String toString() {
       return this.name + " (" + this.weight + " kg)";
   }
}

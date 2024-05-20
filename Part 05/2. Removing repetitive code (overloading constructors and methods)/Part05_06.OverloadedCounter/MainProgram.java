/*
============== Java Programming I ==============
Part 5
Section 2 - Removing repetitive code (overloading methods and constructors)
Ex 5 - Overloaded Counter


Implement three overloading constructors in the Product class.
=================================================
*/

public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter testing = new Counter(1);
        
        testing.increase();                  
        testing.increase(10);          
        System.out.println(testing.value()); 
        
        testing.decrease();          
        testing.decrease(-2);    
        testing.decrease(10);  
        System.out.println(testing.value());
    }
}
